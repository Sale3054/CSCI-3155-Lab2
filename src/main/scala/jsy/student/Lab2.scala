package jsy.student

import jsy.lab2.Lab2Like

object Lab2 extends jsy.util.JsyApplication with Lab2Like {
  import jsy.lab2.Parser
  import jsy.lab2.ast._

  /*
   * CSCI 3155: Lab 2
   * Samuel Leon
   * 
   * Partner: <Your Partner's Name>
   * Collaborators: <Any Collaborators>
   */

  /*
   * Fill in the appropriate portions above by replacing things delimited
   * by '<'... '>'.
   * 
   * Replace the '???' expression with  your code in each function.
   * 
   * Do not make other modifications to this template, such as
   * - adding "extends App" or "extends Application" to your Lab object,
   * - adding a "main" method, and
   * - leaving any failing asserts.
   * 
   * Your lab will not be graded if it does not compile.
   * 
   * This template compiles without error. Before you submit comment out any
   * code that does not compile or causes a failing assert. Simply put in a
   * '???' as needed to get something  that compiles without error. The '???'
   * is a Scala expression that throws the exception scala.NotImplementedError.
   *
   */

  /* We represent a variable environment as a map from a string of the
   * variable name to the value to which it is bound.
   * 
   * You may use the following provided helper functions to manipulate
   * environments, which are just thin wrappers around the Map type
   * in the Scala standard library.  You can use the Scala standard
   * library directly, but these are the only interfaces that you
   * need.
   */



  /* Some useful Scala methods for working with Scala values include:
   * - Double.NaN
   * - s.toDouble (for s: String)
   * - n.isNaN (for n: Double)
   * - n.isWhole (for n: Double)
   * - s (for n: Double)
   * - s format n (for s: String [a format string like for printf], n: Double)
   *
   * You can catch an exception in Scala using:
   * try ... catch { case ... => ... }
   */


  def toNumber(v: Expr): Double = {
    require(isValue(v))
    (v: @unchecked) match {
      case N(n) => n
      case Undefined => Double.NaN
      case N(n) if n.isNaN => Double.NaN
      case null => +0
      case B(true) => 1
      case B(false) => 0
      case S(s) if s.isEmpty => 0
      case S(s) => try {s.toDouble} catch {case e: NumberFormatException => Double.NaN}
      case _ => ???
    }
  }

  def toBoolean(v: Expr): Boolean = {
    require(isValue(v))
    (v: @unchecked) match {
      case B(b) => b
      case Undefined => false
      case null => false
      case S(s) if s.isEmpty => false
      case S(s) if s.isEmpty == false => true
      case N(n) => n match {
        case 0 => false
        case 0.0 => false
        case -0.0 => false
        case x if x.isNaN => false
        case _ => true
      }
      case _ => ???
    }
  }

  def toStr(v: Expr): String = {
    require(isValue(v))
    (v: @unchecked) match {
      case S(s) => s
      case B(true) => "true"
      case B(false) => "false"
      case Undefined => "undefined"
      case null => "null"
      case N(n) => n match {
        case n if n.isNaN => "NaN"
        case 0 => "0"
        case -0 => "0"
        case 0.0 => "0"
        case -0.0 => "0"
        case n if n.isInfinity => "Infinity"
        case n if n < 0 => "-" + n.toString
        case n if n.isWhole => n.toInt.toString
        case n => n.toString
      }
      case _ => ???
    }
  }

  def absRelational(px: Expr, py: Expr): Expr = {
    require(isValue(px), isValue(py))
    (px: @unchecked, py: @unchecked) match
    {
      case(S(px), S(py)) => B(px < py)
      case(px, py) => (toNumber(px),toNumber(py)) match
      {
        case (nx, ny) if nx.isNaN || ny.isNaN => Undefined
        case (nx, ny) if nx == ny => B(false)
        case (nx, ny) if nx == +0 && ny == -0 => B(false)
        case (nx, ny) if nx == -0 && ny == +0 => B(false)
        case (Double.PositiveInfinity, _) => B(false)
        case (_, Double.PositiveInfinity) => B(true)
        case (Double.NegativeInfinity, _) => B(true)
        case (_, Double.NegativeInfinity) => B(false)
        case (nx, ny) => B(nx < ny)
      }
    }
  }
  def strictEqualityComparison(x: Expr, y: Expr): Expr = {
    require(isValue(x), isValue(y))
    (x: @unchecked, y: @unchecked) match
    {
      case (Undefined, Undefined) => B(true)
      case (null, null) => B(true)
      case (N(lref), N(rref)) => (lref, rref) match
      {
        case(lref, _) if lref.isNaN => B(false)
        case(_, rref) if rref.isNaN => B(false)
        case(lref, rref) if lref == rref => B(true)
        case(lref, rref) if lref == +0 && rref == -0 => B(true)
        case(lref, rref) if lref == -0 && rref == +0 => B(true)
        case(_,_) => B(false)
      }
      case (S(lref), S(rref)) => B(lref == rref)
      case (B(true), B(true)) => B(true)
      case (B(false), B(false)) => B(true)
      case (B(_), B(_)) => B(false)
      case _ => B(false)
    }
  }


  def eval(env: Env, e: Expr): Expr = {
    e match {
      /* Base Cases */
      //Returns standalone values that do not require evaluation
      case N(n) => N(n)
      case B(b) => B(b)
      case Undefined => Undefined
      case S(s) => S(s)

      /* Inductive Cases */
      case Print(e1) => println(pretty(eval(env, e1))); Undefined

      //Handles Unary operators
        /* Unary Operators */
      case Unary(uop, e1) => uop match{
        case Neg => N(-toNumber(eval(env, e1)))
        case Not => B(!toBoolean(eval(env, e1)))
      }
        /* Binary Operators */
      case Binary(bop, e1, e2) => bop match{
        case Plus => (eval(env, e1), eval(env, e2)) match
        {
          case (S(lref), rref) => S(lref + toStr(rref))
          case (lref, S(rref)) => S(toStr(lref) + rref)
          case (lref, rref) => N(toNumber(lref) + toNumber(rref))
        }
        case Minus => (eval(env, e1), eval(env, e2)) match
        {
          case (lref, rref) => N(toNumber(lref) - toNumber(rref))
        }
        case Times => (eval(env, e1), eval(env, e2)) match
        {
          case (N(lref), N(rref)) => N(lref * rref)
          case (N(lref), rref) => N(lref * toNumber(rref))
          case (lref, N(rref)) => N(toNumber(lref) * rref)
          case (lref, rref) => N(toNumber(lref) * toNumber(rref))
          case (x, y) if toNumber(x).isNaN || toNumber(y).isNaN => N(Double.NaN)
          case _ => throw new UnsupportedOperationException("Uncaught operation exception in: Times()")
        }
        case Div => (eval(env, e1), eval(env, e2)) match
        {
          case (N(lref), N(rref)) => N(lref / rref)
          case (lref, rref) => N(toNumber(lref) / toNumber(rref))
          case (x, y) if toNumber(x).isNaN || toNumber(y).isNaN => N(Double.NaN)
          case (Undefined, y) => N(Double.NaN)
          case (x, Undefined) => N(Double.NaN)
          case (Undefined, Undefined) => N(Double.NaN)
          case _ => ???
        }

        case Eq => (eval(env, e1), eval(env, e2)) match
        {
          case(lref, rref) => strictEqualityComparison(lref, rref)
        }
        case Ne => (eval(env, e1), eval(env, e2)) match
        {
          case (lref, rref) => eval(env, Unary(Not, Binary(Eq, lref, rref)))
        }
        case Lt => (eval(env, e1), eval(env, e2)) match
        {
          case (lref, rref) => absRelational(lref, rref) match
          {
            case Undefined => B(false)
            case r => r
          }
        }
        case Gt => (eval(env, e1), eval(env, e2)) match
        {
          case (lref, rref) => absRelational(rref, lref) match
          {
            case Undefined => B(false)
            case r => r
          }
        }
        case Le => (eval(env, e1), eval(env, e2)) match
        {
          case (lref, rref) => absRelational(rref, lref) match
          {
            case B(true) => B(false)
            case Undefined => B(false)
            case _ => B(true)
          }
          case _=> ???
        }
        case Ge => (eval(env, e1), eval(env, e2)) match
        {
          case (lref, rref) => absRelational(lref, rref) match
          {
            case B(true) => B(false)
            case Undefined => B(false)
            case _ => B(true)
          }
        }
        case Or => (eval(env, e1), e2) match
        {
          case (lref, rref) if toBoolean(lref) == true => lref
          case (lref, rref) if toBoolean(lref) == false => eval(env, rref)
        }
        case Seq => (eval(env, e1), eval(env, e2)) match
        {
          case (e1, e2) => e1; e2
          case (x, y) if toNumber(x).isNaN || toNumber(y).isNaN => N(Double.NaN)
          case _ => ???
        }
        case And => (eval(env, e1), e2) match
        {
          case (lref, rref) if toBoolean(lref) == false => lref
          case (lref, rref) if toBoolean(lref) == true  => eval(env, rref)

        }
      }
        /* Intraprocedural Control */
      case If(e1, e2, e3) => (toBoolean(eval(env, e1)), e2, e3) match
      {
        case (true, lref, rref) => eval(env, lref)
        case (false, lref, rref) => eval(env, rref)
      }
      case ConstDecl(x, e1, e2) => (x, e1, e2) match
      {
        case (x, e1, e2) => eval(extend(env,x,eval(env, e1)), e2)
      }
      case Var(x) => x match
      {
        case "Infinity" => N(Double.PositiveInfinity)
        case x => lookup(env, x)
      }


      case _ => ???
    }
  }



  /* Interface to run your interpreter from the command-line.  You can ignore what's below. */
  def processFile(file: java.io.File) {
    if (debug) { println("Parsing ...") }

    val expr = Parser.parseFile(file)

    if (debug) {
      println("\nExpression AST:\n  " + expr)
      println("------------------------------------------------------------")
    }

    if (debug) { println("Evaluating ...") }

    val v = eval(expr)

     println(pretty(v))
  }

}
