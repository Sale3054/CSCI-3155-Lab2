# Javascripty Omnitest Suite
# By Paul Lucero

# PREREQUISITES FOR RUNNING THIS FILE:
# Any version of node installed as `node` on your machine
# Python 3.6.0 or higher to run this file

# Import libraries for calling NodeJS later
import subprocess

# Set up the values to check, and the operators
# Currently, we have a nonzero number, a zero number, a blank string, a non-blank string,
# a true boolean, a false boolean, and an undefined. Having NaN may be necessary later?
# Not sure how thorough I need to be here. Hopefully NaN doesn't matter...
vals = ["4", "0", "''", "'stringy'", "true", "false", "undefined", "Infinity", "'1E4'", "console.log('foo')"]
opers = ["+", "-", "*", "/", "===", "!==", "<", "<=", ">", ">=", "&&", "||"]

# Create a master file of JavaScripty expressions to test on NodeJS
with open('master_tester.jsyx', 'w') as f:
	for rval in vals:
		for lval in vals:
			for oper in opers:
				f.write(f'{rval} {oper} {lval}\n')

# Actually test those values using NodeJS and spit it out to a big .ansx file
# This spit-out is handled inside of the transcriber.js file
subprocess.call(["node", "transcriber.js"])

def to_AST(ans):
	# Converts a resultant value expression into its AST form.
	ans = ans.strip()
	if "'" in ans: # If the result is a string
		ans = ans.replace("'", "")
		ans = f'S(\"{ans}\")'
	elif ans == "true": # If the result is the boolean true
		ans = 'B(true)'
	elif ans == "false": # If the result is the boolean false
		ans = 'B(false)'
	elif ans == "NaN": # If the result is NaN
		ans = 'N(Double.NaN)'
	elif ans == "Infinity": # If the result is Infinity
		ans = 'N(Double.PositiveInfinity)'
	elif ans == "-Infinity": # or negative Infinity
		ans = 'N(Double.NegativeInfinity)'
	elif ans == "undefined": # If the result is Undefined
		ans = "Undefined"
	else: # Otherwise, it's a number
		ans = f'N({ans})'
	return ans


# Create a new file which contains our test cases
# TODO figure out how to seek to the right place in Lab2Spec and write it there (probably not worth/10)
num = 2000
first = True
with open('Lab2Spec_Bonus.scala', 'w') as specfile:
	if first:
		specfile.write(f'  "Exhaustive test spec" should "test number {num}" in {{\n')
	jsyx = open('master_tester.jsyx', 'r')
	ansx = open('master_tester.ansx', 'r')
	# Read the two files at the same rate
	for test, ans in zip(jsyx, ansx):
		if not first:
			specfile.write(f'  it should "test number {num}" in {{\n')
		if first:
			first = not first # fuck my life
		if ans.strip() != "NaN": # special handling for NaNs because fuck IEEE754
			specfile.write(f'    assert(eval("{test.strip()}") === {to_AST(ans)})\n')
		else:
			specfile.write(f'    assert(toNumber(eval("{test.strip()}")).isNaN)\n')
		specfile.write('  }\n')
		num += 1