  "Exhaustive test spec" should "test number 2000" in {
    assert(eval("4 + 4") === N(8))
  }
  it should "test number 2001" in {
    assert(eval("4 - 4") === N(0))
  }
  it should "test number 2002" in {
    assert(eval("4 * 4") === N(16))
  }
  it should "test number 2003" in {
    assert(eval("4 / 4") === N(1))
  }
  it should "test number 2004" in {
    assert(eval("4 === 4") === B(true))
  }
  it should "test number 2005" in {
    assert(eval("4 !== 4") === B(false))
  }
  it should "test number 2006" in {
    assert(eval("4 < 4") === B(false))
  }
  it should "test number 2007" in {
    assert(eval("4 <= 4") === B(true))
  }
  it should "test number 2008" in {
    assert(eval("4 > 4") === B(false))
  }
  it should "test number 2009" in {
    assert(eval("4 >= 4") === B(true))
  }
  it should "test number 2010" in {
    assert(eval("4 && 4") === N(4))
  }
  it should "test number 2011" in {
    assert(eval("4 || 4") === N(4))
  }
  it should "test number 2012" in {
    assert(eval("4 + 0") === N(4))
  }
  it should "test number 2013" in {
    assert(eval("4 - 0") === N(4))
  }
  it should "test number 2014" in {
    assert(eval("4 * 0") === N(0))
  }
  it should "test number 2015" in {
    assert(eval("4 / 0") === N(Double.PositiveInfinity))
  }
  it should "test number 2016" in {
    assert(eval("4 === 0") === B(false))
  }
  it should "test number 2017" in {
    assert(eval("4 !== 0") === B(true))
  }
  it should "test number 2018" in {
    assert(eval("4 < 0") === B(false))
  }
  it should "test number 2019" in {
    assert(eval("4 <= 0") === B(false))
  }
  it should "test number 2020" in {
    assert(eval("4 > 0") === B(true))
  }
  it should "test number 2021" in {
    assert(eval("4 >= 0") === B(true))
  }
  it should "test number 2022" in {
    assert(eval("4 && 0") === N(0))
  }
  it should "test number 2023" in {
    assert(eval("4 || 0") === N(4))
  }
  it should "test number 2024" in {
    assert(eval("4 + ''") === S("4"))
  }
  it should "test number 2025" in {
    assert(eval("4 - ''") === N(4))
  }
  it should "test number 2026" in {
    assert(eval("4 * ''") === N(0))
  }
  it should "test number 2027" in {
    assert(eval("4 / ''") === N(Double.PositiveInfinity))
  }
  it should "test number 2028" in {
    assert(eval("4 === ''") === B(false))
  }
  it should "test number 2029" in {
    assert(eval("4 !== ''") === B(true))
  }
  it should "test number 2030" in {
    assert(eval("4 < ''") === B(false))
  }
  it should "test number 2031" in {
    assert(eval("4 <= ''") === B(false))
  }
  it should "test number 2032" in {
    assert(eval("4 > ''") === B(true))
  }
  it should "test number 2033" in {
    assert(eval("4 >= ''") === B(true))
  }
  it should "test number 2034" in {
    assert(eval("4 && ''") === S(""))
  }
  it should "test number 2035" in {
    assert(eval("4 || ''") === N(4))
  }
  it should "test number 2036" in {
    assert(eval("4 + 'stringy'") === S("4stringy"))
  }
  it should "test number 2037" in {
    assert(toNumber(eval("4 - 'stringy'")).isNaN)
  }
  it should "test number 2038" in {
    assert(toNumber(eval("4 * 'stringy'")).isNaN)
  }
  it should "test number 2039" in {
    assert(toNumber(eval("4 / 'stringy'")).isNaN)
  }
  it should "test number 2040" in {
    assert(eval("4 === 'stringy'") === B(false))
  }
  it should "test number 2041" in {
    assert(eval("4 !== 'stringy'") === B(true))
  }
  it should "test number 2042" in {
    assert(eval("4 < 'stringy'") === B(false))
  }
  it should "test number 2043" in {
    assert(eval("4 <= 'stringy'") === B(false))
  }
  it should "test number 2044" in {
    assert(eval("4 > 'stringy'") === B(false))
  }
  it should "test number 2045" in {
    assert(eval("4 >= 'stringy'") === B(false))
  }
  it should "test number 2046" in {
    assert(eval("4 && 'stringy'") === S("stringy"))
  }
  it should "test number 2047" in {
    assert(eval("4 || 'stringy'") === N(4))
  }
  it should "test number 2048" in {
    assert(eval("4 + true") === N(5))
  }
  it should "test number 2049" in {
    assert(eval("4 - true") === N(3))
  }
  it should "test number 2050" in {
    assert(eval("4 * true") === N(4))
  }
  it should "test number 2051" in {
    assert(eval("4 / true") === N(4))
  }
  it should "test number 2052" in {
    assert(eval("4 === true") === B(false))
  }
  it should "test number 2053" in {
    assert(eval("4 !== true") === B(true))
  }
  it should "test number 2054" in {
    assert(eval("4 < true") === B(false))
  }
  it should "test number 2055" in {
    assert(eval("4 <= true") === B(false))
  }
  it should "test number 2056" in {
    assert(eval("4 > true") === B(true))
  }
  it should "test number 2057" in {
    assert(eval("4 >= true") === B(true))
  }
  it should "test number 2058" in {
    assert(eval("4 && true") === B(true))
  }
  it should "test number 2059" in {
    assert(eval("4 || true") === N(4))
  }
  it should "test number 2060" in {
    assert(eval("4 + false") === N(4))
  }
  it should "test number 2061" in {
    assert(eval("4 - false") === N(4))
  }
  it should "test number 2062" in {
    assert(eval("4 * false") === N(0))
  }
  it should "test number 2063" in {
    assert(eval("4 / false") === N(Double.PositiveInfinity))
  }
  it should "test number 2064" in {
    assert(eval("4 === false") === B(false))
  }
  it should "test number 2065" in {
    assert(eval("4 !== false") === B(true))
  }
  it should "test number 2066" in {
    assert(eval("4 < false") === B(false))
  }
  it should "test number 2067" in {
    assert(eval("4 <= false") === B(false))
  }
  it should "test number 2068" in {
    assert(eval("4 > false") === B(true))
  }
  it should "test number 2069" in {
    assert(eval("4 >= false") === B(true))
  }
  it should "test number 2070" in {
    assert(eval("4 && false") === B(false))
  }
  it should "test number 2071" in {
    assert(eval("4 || false") === N(4))
  }
  it should "test number 2072" in {
    assert(toNumber(eval("4 + undefined")).isNaN)
  }
  it should "test number 2073" in {
    assert(toNumber(eval("4 - undefined")).isNaN)
  }
  it should "test number 2074" in {
    assert(toNumber(eval("4 * undefined")).isNaN)
  }
  it should "test number 2075" in {
    assert(toNumber(eval("4 / undefined")).isNaN)
  }
  it should "test number 2076" in {
    assert(eval("4 === undefined") === B(false))
  }
  it should "test number 2077" in {
    assert(eval("4 !== undefined") === B(true))
  }
  it should "test number 2078" in {
    assert(eval("4 < undefined") === B(false))
  }
  it should "test number 2079" in {
    assert(eval("4 <= undefined") === B(false))
  }
  it should "test number 2080" in {
    assert(eval("4 > undefined") === B(false))
  }
  it should "test number 2081" in {
    assert(eval("4 >= undefined") === B(false))
  }
  it should "test number 2082" in {
    assert(eval("4 && undefined") === Undefined)
  }
  it should "test number 2083" in {
    assert(eval("4 || undefined") === N(4))
  }
  it should "test number 2084" in {
    assert(eval("4 + Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2085" in {
    assert(eval("4 - Infinity") === N(Double.NegativeInfinity))
  }
  it should "test number 2086" in {
    assert(eval("4 * Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2087" in {
    assert(eval("4 / Infinity") === N(0))
  }
  it should "test number 2088" in {
    assert(eval("4 === Infinity") === B(false))
  }
  it should "test number 2089" in {
    assert(eval("4 !== Infinity") === B(true))
  }
  it should "test number 2090" in {
    assert(eval("4 < Infinity") === B(true))
  }
  it should "test number 2091" in {
    assert(eval("4 <= Infinity") === B(true))
  }
  it should "test number 2092" in {
    assert(eval("4 > Infinity") === B(false))
  }
  it should "test number 2093" in {
    assert(eval("4 >= Infinity") === B(false))
  }
  it should "test number 2094" in {
    assert(eval("4 && Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2095" in {
    assert(eval("4 || Infinity") === N(4))
  }
  it should "test number 2096" in {
    assert(eval("4 + '1E4'") === S("41E4"))
  }
  it should "test number 2097" in {
    assert(eval("4 - '1E4'") === N(-9996))
  }
  it should "test number 2098" in {
    assert(eval("4 * '1E4'") === N(40000))
  }
  it should "test number 2099" in {
    assert(eval("4 / '1E4'") === N(0.0004))
  }
  it should "test number 2100" in {
    assert(eval("4 === '1E4'") === B(false))
  }
  it should "test number 2101" in {
    assert(eval("4 !== '1E4'") === B(true))
  }
  it should "test number 2102" in {
    assert(eval("4 < '1E4'") === B(true))
  }
  it should "test number 2103" in {
    assert(eval("4 <= '1E4'") === B(true))
  }
  it should "test number 2104" in {
    assert(eval("4 > '1E4'") === B(false))
  }
  it should "test number 2105" in {
    assert(eval("4 >= '1E4'") === B(false))
  }
  it should "test number 2106" in {
    assert(eval("4 && '1E4'") === S("1E4"))
  }
  it should "test number 2107" in {
    assert(eval("4 || '1E4'") === N(4))
  }
  it should "test number 2108" in {
    assert(toNumber(eval("4 + console.log('foo')")).isNaN)
  }
  it should "test number 2109" in {
    assert(toNumber(eval("4 - console.log('foo')")).isNaN)
  }
  it should "test number 2110" in {
    assert(toNumber(eval("4 * console.log('foo')")).isNaN)
  }
  it should "test number 2111" in {
    assert(toNumber(eval("4 / console.log('foo')")).isNaN)
  }
  it should "test number 2112" in {
    assert(eval("4 === console.log('foo')") === B(false))
  }
  it should "test number 2113" in {
    assert(eval("4 !== console.log('foo')") === B(true))
  }
  it should "test number 2114" in {
    assert(eval("4 < console.log('foo')") === B(false))
  }
  it should "test number 2115" in {
    assert(eval("4 <= console.log('foo')") === B(false))
  }
  it should "test number 2116" in {
    assert(eval("4 > console.log('foo')") === B(false))
  }
  it should "test number 2117" in {
    assert(eval("4 >= console.log('foo')") === B(false))
  }
  it should "test number 2118" in {
    assert(eval("4 && console.log('foo')") === Undefined)
  }
  it should "test number 2119" in {
    assert(eval("4 || console.log('foo')") === N(4))
  }
  it should "test number 2120" in {
    assert(eval("0 + 4") === N(4))
  }
  it should "test number 2121" in {
    assert(eval("0 - 4") === N(-4))
  }
  it should "test number 2122" in {
    assert(eval("0 * 4") === N(0))
  }
  it should "test number 2123" in {
    assert(eval("0 / 4") === N(0))
  }
  it should "test number 2124" in {
    assert(eval("0 === 4") === B(false))
  }
  it should "test number 2125" in {
    assert(eval("0 !== 4") === B(true))
  }
  it should "test number 2126" in {
    assert(eval("0 < 4") === B(true))
  }
  it should "test number 2127" in {
    assert(eval("0 <= 4") === B(true))
  }
  it should "test number 2128" in {
    assert(eval("0 > 4") === B(false))
  }
  it should "test number 2129" in {
    assert(eval("0 >= 4") === B(false))
  }
  it should "test number 2130" in {
    assert(eval("0 && 4") === N(0))
  }
  it should "test number 2131" in {
    assert(eval("0 || 4") === N(4))
  }
  it should "test number 2132" in {
    assert(eval("0 + 0") === N(0))
  }
  it should "test number 2133" in {
    assert(eval("0 - 0") === N(0))
  }
  it should "test number 2134" in {
    assert(eval("0 * 0") === N(0))
  }
  it should "test number 2135" in {
    assert(toNumber(eval("0 / 0")).isNaN)
  }
  it should "test number 2136" in {
    assert(eval("0 === 0") === B(true))
  }
  it should "test number 2137" in {
    assert(eval("0 !== 0") === B(false))
  }
  it should "test number 2138" in {
    assert(eval("0 < 0") === B(false))
  }
  it should "test number 2139" in {
    assert(eval("0 <= 0") === B(true))
  }
  it should "test number 2140" in {
    assert(eval("0 > 0") === B(false))
  }
  it should "test number 2141" in {
    assert(eval("0 >= 0") === B(true))
  }
  it should "test number 2142" in {
    assert(eval("0 && 0") === N(0))
  }
  it should "test number 2143" in {
    assert(eval("0 || 0") === N(0))
  }
  it should "test number 2144" in {
    assert(eval("0 + ''") === S("0"))
  }
  it should "test number 2145" in {
    assert(eval("0 - ''") === N(0))
  }
  it should "test number 2146" in {
    assert(eval("0 * ''") === N(0))
  }
  it should "test number 2147" in {
    assert(toNumber(eval("0 / ''")).isNaN)
  }
  it should "test number 2148" in {
    assert(eval("0 === ''") === B(false))
  }
  it should "test number 2149" in {
    assert(eval("0 !== ''") === B(true))
  }
  it should "test number 2150" in {
    assert(eval("0 < ''") === B(false))
  }
  it should "test number 2151" in {
    assert(eval("0 <= ''") === B(true))
  }
  it should "test number 2152" in {
    assert(eval("0 > ''") === B(false))
  }
  it should "test number 2153" in {
    assert(eval("0 >= ''") === B(true))
  }
  it should "test number 2154" in {
    assert(eval("0 && ''") === N(0))
  }
  it should "test number 2155" in {
    assert(eval("0 || ''") === S(""))
  }
  it should "test number 2156" in {
    assert(eval("0 + 'stringy'") === S("0stringy"))
  }
  it should "test number 2157" in {
    assert(toNumber(eval("0 - 'stringy'")).isNaN)
  }
  it should "test number 2158" in {
    assert(toNumber(eval("0 * 'stringy'")).isNaN)
  }
  it should "test number 2159" in {
    assert(toNumber(eval("0 / 'stringy'")).isNaN)
  }
  it should "test number 2160" in {
    assert(eval("0 === 'stringy'") === B(false))
  }
  it should "test number 2161" in {
    assert(eval("0 !== 'stringy'") === B(true))
  }
  it should "test number 2162" in {
    assert(eval("0 < 'stringy'") === B(false))
  }
  it should "test number 2163" in {
    assert(eval("0 <= 'stringy'") === B(false))
  }
  it should "test number 2164" in {
    assert(eval("0 > 'stringy'") === B(false))
  }
  it should "test number 2165" in {
    assert(eval("0 >= 'stringy'") === B(false))
  }
  it should "test number 2166" in {
    assert(eval("0 && 'stringy'") === N(0))
  }
  it should "test number 2167" in {
    assert(eval("0 || 'stringy'") === S("stringy"))
  }
  it should "test number 2168" in {
    assert(eval("0 + true") === N(1))
  }
  it should "test number 2169" in {
    assert(eval("0 - true") === N(-1))
  }
  it should "test number 2170" in {
    assert(eval("0 * true") === N(0))
  }
  it should "test number 2171" in {
    assert(eval("0 / true") === N(0))
  }
  it should "test number 2172" in {
    assert(eval("0 === true") === B(false))
  }
  it should "test number 2173" in {
    assert(eval("0 !== true") === B(true))
  }
  it should "test number 2174" in {
    assert(eval("0 < true") === B(true))
  }
  it should "test number 2175" in {
    assert(eval("0 <= true") === B(true))
  }
  it should "test number 2176" in {
    assert(eval("0 > true") === B(false))
  }
  it should "test number 2177" in {
    assert(eval("0 >= true") === B(false))
  }
  it should "test number 2178" in {
    assert(eval("0 && true") === N(0))
  }
  it should "test number 2179" in {
    assert(eval("0 || true") === B(true))
  }
  it should "test number 2180" in {
    assert(eval("0 + false") === N(0))
  }
  it should "test number 2181" in {
    assert(eval("0 - false") === N(0))
  }
  it should "test number 2182" in {
    assert(eval("0 * false") === N(0))
  }
  it should "test number 2183" in {
    assert(toNumber(eval("0 / false")).isNaN)
  }
  it should "test number 2184" in {
    assert(eval("0 === false") === B(false))
  }
  it should "test number 2185" in {
    assert(eval("0 !== false") === B(true))
  }
  it should "test number 2186" in {
    assert(eval("0 < false") === B(false))
  }
  it should "test number 2187" in {
    assert(eval("0 <= false") === B(true))
  }
  it should "test number 2188" in {
    assert(eval("0 > false") === B(false))
  }
  it should "test number 2189" in {
    assert(eval("0 >= false") === B(true))
  }
  it should "test number 2190" in {
    assert(eval("0 && false") === N(0))
  }
  it should "test number 2191" in {
    assert(eval("0 || false") === B(false))
  }
  it should "test number 2192" in {
    assert(toNumber(eval("0 + undefined")).isNaN)
  }
  it should "test number 2193" in {
    assert(toNumber(eval("0 - undefined")).isNaN)
  }
  it should "test number 2194" in {
    assert(toNumber(eval("0 * undefined")).isNaN)
  }
  it should "test number 2195" in {
    assert(toNumber(eval("0 / undefined")).isNaN)
  }
  it should "test number 2196" in {
    assert(eval("0 === undefined") === B(false))
  }
  it should "test number 2197" in {
    assert(eval("0 !== undefined") === B(true))
  }
  it should "test number 2198" in {
    assert(eval("0 < undefined") === B(false))
  }
  it should "test number 2199" in {
    assert(eval("0 <= undefined") === B(false))
  }
  it should "test number 2200" in {
    assert(eval("0 > undefined") === B(false))
  }
  it should "test number 2201" in {
    assert(eval("0 >= undefined") === B(false))
  }
  it should "test number 2202" in {
    assert(eval("0 && undefined") === N(0))
  }
  it should "test number 2203" in {
    assert(eval("0 || undefined") === Undefined)
  }
  it should "test number 2204" in {
    assert(eval("0 + Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2205" in {
    assert(eval("0 - Infinity") === N(Double.NegativeInfinity))
  }
  it should "test number 2206" in {
    assert(toNumber(eval("0 * Infinity")).isNaN)
  }
  it should "test number 2207" in {
    assert(eval("0 / Infinity") === N(0))
  }
  it should "test number 2208" in {
    assert(eval("0 === Infinity") === B(false))
  }
  it should "test number 2209" in {
    assert(eval("0 !== Infinity") === B(true))
  }
  it should "test number 2210" in {
    assert(eval("0 < Infinity") === B(true))
  }
  it should "test number 2211" in {
    assert(eval("0 <= Infinity") === B(true))
  }
  it should "test number 2212" in {
    assert(eval("0 > Infinity") === B(false))
  }
  it should "test number 2213" in {
    assert(eval("0 >= Infinity") === B(false))
  }
  it should "test number 2214" in {
    assert(eval("0 && Infinity") === N(0))
  }
  it should "test number 2215" in {
    assert(eval("0 || Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2216" in {
    assert(eval("0 + '1E4'") === S("01E4"))
  }
  it should "test number 2217" in {
    assert(eval("0 - '1E4'") === N(-10000))
  }
  it should "test number 2218" in {
    assert(eval("0 * '1E4'") === N(0))
  }
  it should "test number 2219" in {
    assert(eval("0 / '1E4'") === N(0))
  }
  it should "test number 2220" in {
    assert(eval("0 === '1E4'") === B(false))
  }
  it should "test number 2221" in {
    assert(eval("0 !== '1E4'") === B(true))
  }
  it should "test number 2222" in {
    assert(eval("0 < '1E4'") === B(true))
  }
  it should "test number 2223" in {
    assert(eval("0 <= '1E4'") === B(true))
  }
  it should "test number 2224" in {
    assert(eval("0 > '1E4'") === B(false))
  }
  it should "test number 2225" in {
    assert(eval("0 >= '1E4'") === B(false))
  }
  it should "test number 2226" in {
    assert(eval("0 && '1E4'") === N(0))
  }
  it should "test number 2227" in {
    assert(eval("0 || '1E4'") === S("1E4"))
  }
  it should "test number 2228" in {
    assert(toNumber(eval("0 + console.log('foo')")).isNaN)
  }
  it should "test number 2229" in {
    assert(toNumber(eval("0 - console.log('foo')")).isNaN)
  }
  it should "test number 2230" in {
    assert(toNumber(eval("0 * console.log('foo')")).isNaN)
  }
  it should "test number 2231" in {
    assert(toNumber(eval("0 / console.log('foo')")).isNaN)
  }
  it should "test number 2232" in {
    assert(eval("0 === console.log('foo')") === B(false))
  }
  it should "test number 2233" in {
    assert(eval("0 !== console.log('foo')") === B(true))
  }
  it should "test number 2234" in {
    assert(eval("0 < console.log('foo')") === B(false))
  }
  it should "test number 2235" in {
    assert(eval("0 <= console.log('foo')") === B(false))
  }
  it should "test number 2236" in {
    assert(eval("0 > console.log('foo')") === B(false))
  }
  it should "test number 2237" in {
    assert(eval("0 >= console.log('foo')") === B(false))
  }
  it should "test number 2238" in {
    assert(eval("0 && console.log('foo')") === N(0))
  }
  it should "test number 2239" in {
    assert(eval("0 || console.log('foo')") === Undefined)
  }
  it should "test number 2240" in {
    assert(eval("'' + 4") === S("4"))
  }
  it should "test number 2241" in {
    assert(eval("'' - 4") === N(-4))
  }
  it should "test number 2242" in {
    assert(eval("'' * 4") === N(0))
  }
  it should "test number 2243" in {
    assert(eval("'' / 4") === N(0))
  }
  it should "test number 2244" in {
    assert(eval("'' === 4") === B(false))
  }
  it should "test number 2245" in {
    assert(eval("'' !== 4") === B(true))
  }
  it should "test number 2246" in {
    assert(eval("'' < 4") === B(true))
  }
  it should "test number 2247" in {
    assert(eval("'' <= 4") === B(true))
  }
  it should "test number 2248" in {
    assert(eval("'' > 4") === B(false))
  }
  it should "test number 2249" in {
    assert(eval("'' >= 4") === B(false))
  }
  it should "test number 2250" in {
    assert(eval("'' && 4") === S(""))
  }
  it should "test number 2251" in {
    assert(eval("'' || 4") === N(4))
  }
  it should "test number 2252" in {
    assert(eval("'' + 0") === S("0"))
  }
  it should "test number 2253" in {
    assert(eval("'' - 0") === N(0))
  }
  it should "test number 2254" in {
    assert(eval("'' * 0") === N(0))
  }
  it should "test number 2255" in {
    assert(toNumber(eval("'' / 0")).isNaN)
  }
  it should "test number 2256" in {
    assert(eval("'' === 0") === B(false))
  }
  it should "test number 2257" in {
    assert(eval("'' !== 0") === B(true))
  }
  it should "test number 2258" in {
    assert(eval("'' < 0") === B(false))
  }
  it should "test number 2259" in {
    assert(eval("'' <= 0") === B(true))
  }
  it should "test number 2260" in {
    assert(eval("'' > 0") === B(false))
  }
  it should "test number 2261" in {
    assert(eval("'' >= 0") === B(true))
  }
  it should "test number 2262" in {
    assert(eval("'' && 0") === S(""))
  }
  it should "test number 2263" in {
    assert(eval("'' || 0") === N(0))
  }
  it should "test number 2264" in {
    assert(eval("'' + ''") === S(""))
  }
  it should "test number 2265" in {
    assert(eval("'' - ''") === N(0))
  }
  it should "test number 2266" in {
    assert(eval("'' * ''") === N(0))
  }
  it should "test number 2267" in {
    assert(toNumber(eval("'' / ''")).isNaN)
  }
  it should "test number 2268" in {
    assert(eval("'' === ''") === B(true))
  }
  it should "test number 2269" in {
    assert(eval("'' !== ''") === B(false))
  }
  it should "test number 2270" in {
    assert(eval("'' < ''") === B(false))
  }
  it should "test number 2271" in {
    assert(eval("'' <= ''") === B(true))
  }
  it should "test number 2272" in {
    assert(eval("'' > ''") === B(false))
  }
  it should "test number 2273" in {
    assert(eval("'' >= ''") === B(true))
  }
  it should "test number 2274" in {
    assert(eval("'' && ''") === S(""))
  }
  it should "test number 2275" in {
    assert(eval("'' || ''") === S(""))
  }
  it should "test number 2276" in {
    assert(eval("'' + 'stringy'") === S("stringy"))
  }
  it should "test number 2277" in {
    assert(toNumber(eval("'' - 'stringy'")).isNaN)
  }
  it should "test number 2278" in {
    assert(toNumber(eval("'' * 'stringy'")).isNaN)
  }
  it should "test number 2279" in {
    assert(toNumber(eval("'' / 'stringy'")).isNaN)
  }
  it should "test number 2280" in {
    assert(eval("'' === 'stringy'") === B(false))
  }
  it should "test number 2281" in {
    assert(eval("'' !== 'stringy'") === B(true))
  }
  it should "test number 2282" in {
    assert(eval("'' < 'stringy'") === B(true))
  }
  it should "test number 2283" in {
    assert(eval("'' <= 'stringy'") === B(true))
  }
  it should "test number 2284" in {
    assert(eval("'' > 'stringy'") === B(false))
  }
  it should "test number 2285" in {
    assert(eval("'' >= 'stringy'") === B(false))
  }
  it should "test number 2286" in {
    assert(eval("'' && 'stringy'") === S(""))
  }
  it should "test number 2287" in {
    assert(eval("'' || 'stringy'") === S("stringy"))
  }
  it should "test number 2288" in {
    assert(eval("'' + true") === S("true"))
  }
  it should "test number 2289" in {
    assert(eval("'' - true") === N(-1))
  }
  it should "test number 2290" in {
    assert(eval("'' * true") === N(0))
  }
  it should "test number 2291" in {
    assert(eval("'' / true") === N(0))
  }
  it should "test number 2292" in {
    assert(eval("'' === true") === B(false))
  }
  it should "test number 2293" in {
    assert(eval("'' !== true") === B(true))
  }
  it should "test number 2294" in {
    assert(eval("'' < true") === B(true))
  }
  it should "test number 2295" in {
    assert(eval("'' <= true") === B(true))
  }
  it should "test number 2296" in {
    assert(eval("'' > true") === B(false))
  }
  it should "test number 2297" in {
    assert(eval("'' >= true") === B(false))
  }
  it should "test number 2298" in {
    assert(eval("'' && true") === S(""))
  }
  it should "test number 2299" in {
    assert(eval("'' || true") === B(true))
  }
  it should "test number 2300" in {
    assert(eval("'' + false") === S("false"))
  }
  it should "test number 2301" in {
    assert(eval("'' - false") === N(0))
  }
  it should "test number 2302" in {
    assert(eval("'' * false") === N(0))
  }
  it should "test number 2303" in {
    assert(toNumber(eval("'' / false")).isNaN)
  }
  it should "test number 2304" in {
    assert(eval("'' === false") === B(false))
  }
  it should "test number 2305" in {
    assert(eval("'' !== false") === B(true))
  }
  it should "test number 2306" in {
    assert(eval("'' < false") === B(false))
  }
  it should "test number 2307" in {
    assert(eval("'' <= false") === B(true))
  }
  it should "test number 2308" in {
    assert(eval("'' > false") === B(false))
  }
  it should "test number 2309" in {
    assert(eval("'' >= false") === B(true))
  }
  it should "test number 2310" in {
    assert(eval("'' && false") === S(""))
  }
  it should "test number 2311" in {
    assert(eval("'' || false") === B(false))
  }
  it should "test number 2312" in {
    assert(eval("'' + undefined") === S("undefined"))
  }
  it should "test number 2313" in {
    assert(toNumber(eval("'' - undefined")).isNaN)
  }
  it should "test number 2314" in {
    assert(toNumber(eval("'' * undefined")).isNaN)
  }
  it should "test number 2315" in {
    assert(toNumber(eval("'' / undefined")).isNaN)
  }
  it should "test number 2316" in {
    assert(eval("'' === undefined") === B(false))
  }
  it should "test number 2317" in {
    assert(eval("'' !== undefined") === B(true))
  }
  it should "test number 2318" in {
    assert(eval("'' < undefined") === B(false))
  }
  it should "test number 2319" in {
    assert(eval("'' <= undefined") === B(false))
  }
  it should "test number 2320" in {
    assert(eval("'' > undefined") === B(false))
  }
  it should "test number 2321" in {
    assert(eval("'' >= undefined") === B(false))
  }
  it should "test number 2322" in {
    assert(eval("'' && undefined") === S(""))
  }
  it should "test number 2323" in {
    assert(eval("'' || undefined") === Undefined)
  }
  it should "test number 2324" in {
    assert(eval("'' + Infinity") === S("Infinity"))
  }
  it should "test number 2325" in {
    assert(eval("'' - Infinity") === N(Double.NegativeInfinity))
  }
  it should "test number 2326" in {
    assert(toNumber(eval("'' * Infinity")).isNaN)
  }
  it should "test number 2327" in {
    assert(eval("'' / Infinity") === N(0))
  }
  it should "test number 2328" in {
    assert(eval("'' === Infinity") === B(false))
  }
  it should "test number 2329" in {
    assert(eval("'' !== Infinity") === B(true))
  }
  it should "test number 2330" in {
    assert(eval("'' < Infinity") === B(true))
  }
  it should "test number 2331" in {
    assert(eval("'' <= Infinity") === B(true))
  }
  it should "test number 2332" in {
    assert(eval("'' > Infinity") === B(false))
  }
  it should "test number 2333" in {
    assert(eval("'' >= Infinity") === B(false))
  }
  it should "test number 2334" in {
    assert(eval("'' && Infinity") === S(""))
  }
  it should "test number 2335" in {
    assert(eval("'' || Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2336" in {
    assert(eval("'' + '1E4'") === S("1E4"))
  }
  it should "test number 2337" in {
    assert(eval("'' - '1E4'") === N(-10000))
  }
  it should "test number 2338" in {
    assert(eval("'' * '1E4'") === N(0))
  }
  it should "test number 2339" in {
    assert(eval("'' / '1E4'") === N(0))
  }
  it should "test number 2340" in {
    assert(eval("'' === '1E4'") === B(false))
  }
  it should "test number 2341" in {
    assert(eval("'' !== '1E4'") === B(true))
  }
  it should "test number 2342" in {
    assert(eval("'' < '1E4'") === B(true))
  }
  it should "test number 2343" in {
    assert(eval("'' <= '1E4'") === B(true))
  }
  it should "test number 2344" in {
    assert(eval("'' > '1E4'") === B(false))
  }
  it should "test number 2345" in {
    assert(eval("'' >= '1E4'") === B(false))
  }
  it should "test number 2346" in {
    assert(eval("'' && '1E4'") === S(""))
  }
  it should "test number 2347" in {
    assert(eval("'' || '1E4'") === S("1E4"))
  }
  it should "test number 2348" in {
    assert(eval("'' + console.log('foo')") === S("undefined"))
  }
  it should "test number 2349" in {
    assert(toNumber(eval("'' - console.log('foo')")).isNaN)
  }
  it should "test number 2350" in {
    assert(toNumber(eval("'' * console.log('foo')")).isNaN)
  }
  it should "test number 2351" in {
    assert(toNumber(eval("'' / console.log('foo')")).isNaN)
  }
  it should "test number 2352" in {
    assert(eval("'' === console.log('foo')") === B(false))
  }
  it should "test number 2353" in {
    assert(eval("'' !== console.log('foo')") === B(true))
  }
  it should "test number 2354" in {
    assert(eval("'' < console.log('foo')") === B(false))
  }
  it should "test number 2355" in {
    assert(eval("'' <= console.log('foo')") === B(false))
  }
  it should "test number 2356" in {
    assert(eval("'' > console.log('foo')") === B(false))
  }
  it should "test number 2357" in {
    assert(eval("'' >= console.log('foo')") === B(false))
  }
  it should "test number 2358" in {
    assert(eval("'' && console.log('foo')") === S(""))
  }
  it should "test number 2359" in {
    assert(eval("'' || console.log('foo')") === Undefined)
  }
  it should "test number 2360" in {
    assert(eval("'stringy' + 4") === S("stringy4"))
  }
  it should "test number 2361" in {
    assert(toNumber(eval("'stringy' - 4")).isNaN)
  }
  it should "test number 2362" in {
    assert(toNumber(eval("'stringy' * 4")).isNaN)
  }
  it should "test number 2363" in {
    assert(toNumber(eval("'stringy' / 4")).isNaN)
  }
  it should "test number 2364" in {
    assert(eval("'stringy' === 4") === B(false))
  }
  it should "test number 2365" in {
    assert(eval("'stringy' !== 4") === B(true))
  }
  it should "test number 2366" in {
    assert(eval("'stringy' < 4") === B(false))
  }
  it should "test number 2367" in {
    assert(eval("'stringy' <= 4") === B(false))
  }
  it should "test number 2368" in {
    assert(eval("'stringy' > 4") === B(false))
  }
  it should "test number 2369" in {
    assert(eval("'stringy' >= 4") === B(false))
  }
  it should "test number 2370" in {
    assert(eval("'stringy' && 4") === N(4))
  }
  it should "test number 2371" in {
    assert(eval("'stringy' || 4") === S("stringy"))
  }
  it should "test number 2372" in {
    assert(eval("'stringy' + 0") === S("stringy0"))
  }
  it should "test number 2373" in {
    assert(toNumber(eval("'stringy' - 0")).isNaN)
  }
  it should "test number 2374" in {
    assert(toNumber(eval("'stringy' * 0")).isNaN)
  }
  it should "test number 2375" in {
    assert(toNumber(eval("'stringy' / 0")).isNaN)
  }
  it should "test number 2376" in {
    assert(eval("'stringy' === 0") === B(false))
  }
  it should "test number 2377" in {
    assert(eval("'stringy' !== 0") === B(true))
  }
  it should "test number 2378" in {
    assert(eval("'stringy' < 0") === B(false))
  }
  it should "test number 2379" in {
    assert(eval("'stringy' <= 0") === B(false))
  }
  it should "test number 2380" in {
    assert(eval("'stringy' > 0") === B(false))
  }
  it should "test number 2381" in {
    assert(eval("'stringy' >= 0") === B(false))
  }
  it should "test number 2382" in {
    assert(eval("'stringy' && 0") === N(0))
  }
  it should "test number 2383" in {
    assert(eval("'stringy' || 0") === S("stringy"))
  }
  it should "test number 2384" in {
    assert(eval("'stringy' + ''") === S("stringy"))
  }
  it should "test number 2385" in {
    assert(toNumber(eval("'stringy' - ''")).isNaN)
  }
  it should "test number 2386" in {
    assert(toNumber(eval("'stringy' * ''")).isNaN)
  }
  it should "test number 2387" in {
    assert(toNumber(eval("'stringy' / ''")).isNaN)
  }
  it should "test number 2388" in {
    assert(eval("'stringy' === ''") === B(false))
  }
  it should "test number 2389" in {
    assert(eval("'stringy' !== ''") === B(true))
  }
  it should "test number 2390" in {
    assert(eval("'stringy' < ''") === B(false))
  }
  it should "test number 2391" in {
    assert(eval("'stringy' <= ''") === B(false))
  }
  it should "test number 2392" in {
    assert(eval("'stringy' > ''") === B(true))
  }
  it should "test number 2393" in {
    assert(eval("'stringy' >= ''") === B(true))
  }
  it should "test number 2394" in {
    assert(eval("'stringy' && ''") === S(""))
  }
  it should "test number 2395" in {
    assert(eval("'stringy' || ''") === S("stringy"))
  }
  it should "test number 2396" in {
    assert(eval("'stringy' + 'stringy'") === S("stringystringy"))
  }
  it should "test number 2397" in {
    assert(toNumber(eval("'stringy' - 'stringy'")).isNaN)
  }
  it should "test number 2398" in {
    assert(toNumber(eval("'stringy' * 'stringy'")).isNaN)
  }
  it should "test number 2399" in {
    assert(toNumber(eval("'stringy' / 'stringy'")).isNaN)
  }
  it should "test number 2400" in {
    assert(eval("'stringy' === 'stringy'") === B(true))
  }
  it should "test number 2401" in {
    assert(eval("'stringy' !== 'stringy'") === B(false))
  }
  it should "test number 2402" in {
    assert(eval("'stringy' < 'stringy'") === B(false))
  }
  it should "test number 2403" in {
    assert(eval("'stringy' <= 'stringy'") === B(true))
  }
  it should "test number 2404" in {
    assert(eval("'stringy' > 'stringy'") === B(false))
  }
  it should "test number 2405" in {
    assert(eval("'stringy' >= 'stringy'") === B(true))
  }
  it should "test number 2406" in {
    assert(eval("'stringy' && 'stringy'") === S("stringy"))
  }
  it should "test number 2407" in {
    assert(eval("'stringy' || 'stringy'") === S("stringy"))
  }
  it should "test number 2408" in {
    assert(eval("'stringy' + true") === S("stringytrue"))
  }
  it should "test number 2409" in {
    assert(toNumber(eval("'stringy' - true")).isNaN)
  }
  it should "test number 2410" in {
    assert(toNumber(eval("'stringy' * true")).isNaN)
  }
  it should "test number 2411" in {
    assert(toNumber(eval("'stringy' / true")).isNaN)
  }
  it should "test number 2412" in {
    assert(eval("'stringy' === true") === B(false))
  }
  it should "test number 2413" in {
    assert(eval("'stringy' !== true") === B(true))
  }
  it should "test number 2414" in {
    assert(eval("'stringy' < true") === B(false))
  }
  it should "test number 2415" in {
    assert(eval("'stringy' <= true") === B(false))
  }
  it should "test number 2416" in {
    assert(eval("'stringy' > true") === B(false))
  }
  it should "test number 2417" in {
    assert(eval("'stringy' >= true") === B(false))
  }
  it should "test number 2418" in {
    assert(eval("'stringy' && true") === B(true))
  }
  it should "test number 2419" in {
    assert(eval("'stringy' || true") === S("stringy"))
  }
  it should "test number 2420" in {
    assert(eval("'stringy' + false") === S("stringyfalse"))
  }
  it should "test number 2421" in {
    assert(toNumber(eval("'stringy' - false")).isNaN)
  }
  it should "test number 2422" in {
    assert(toNumber(eval("'stringy' * false")).isNaN)
  }
  it should "test number 2423" in {
    assert(toNumber(eval("'stringy' / false")).isNaN)
  }
  it should "test number 2424" in {
    assert(eval("'stringy' === false") === B(false))
  }
  it should "test number 2425" in {
    assert(eval("'stringy' !== false") === B(true))
  }
  it should "test number 2426" in {
    assert(eval("'stringy' < false") === B(false))
  }
  it should "test number 2427" in {
    assert(eval("'stringy' <= false") === B(false))
  }
  it should "test number 2428" in {
    assert(eval("'stringy' > false") === B(false))
  }
  it should "test number 2429" in {
    assert(eval("'stringy' >= false") === B(false))
  }
  it should "test number 2430" in {
    assert(eval("'stringy' && false") === B(false))
  }
  it should "test number 2431" in {
    assert(eval("'stringy' || false") === S("stringy"))
  }
  it should "test number 2432" in {
    assert(eval("'stringy' + undefined") === S("stringyundefined"))
  }
  it should "test number 2433" in {
    assert(toNumber(eval("'stringy' - undefined")).isNaN)
  }
  it should "test number 2434" in {
    assert(toNumber(eval("'stringy' * undefined")).isNaN)
  }
  it should "test number 2435" in {
    assert(toNumber(eval("'stringy' / undefined")).isNaN)
  }
  it should "test number 2436" in {
    assert(eval("'stringy' === undefined") === B(false))
  }
  it should "test number 2437" in {
    assert(eval("'stringy' !== undefined") === B(true))
  }
  it should "test number 2438" in {
    assert(eval("'stringy' < undefined") === B(false))
  }
  it should "test number 2439" in {
    assert(eval("'stringy' <= undefined") === B(false))
  }
  it should "test number 2440" in {
    assert(eval("'stringy' > undefined") === B(false))
  }
  it should "test number 2441" in {
    assert(eval("'stringy' >= undefined") === B(false))
  }
  it should "test number 2442" in {
    assert(eval("'stringy' && undefined") === Undefined)
  }
  it should "test number 2443" in {
    assert(eval("'stringy' || undefined") === S("stringy"))
  }
  it should "test number 2444" in {
    assert(eval("'stringy' + Infinity") === S("stringyInfinity"))
  }
  it should "test number 2445" in {
    assert(toNumber(eval("'stringy' - Infinity")).isNaN)
  }
  it should "test number 2446" in {
    assert(toNumber(eval("'stringy' * Infinity")).isNaN)
  }
  it should "test number 2447" in {
    assert(toNumber(eval("'stringy' / Infinity")).isNaN)
  }
  it should "test number 2448" in {
    assert(eval("'stringy' === Infinity") === B(false))
  }
  it should "test number 2449" in {
    assert(eval("'stringy' !== Infinity") === B(true))
  }
  it should "test number 2450" in {
    assert(eval("'stringy' < Infinity") === B(false))
  }
  it should "test number 2451" in {
    assert(eval("'stringy' <= Infinity") === B(false))
  }
  it should "test number 2452" in {
    assert(eval("'stringy' > Infinity") === B(false))
  }
  it should "test number 2453" in {
    assert(eval("'stringy' >= Infinity") === B(false))
  }
  it should "test number 2454" in {
    assert(eval("'stringy' && Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2455" in {
    assert(eval("'stringy' || Infinity") === S("stringy"))
  }
  it should "test number 2456" in {
    assert(eval("'stringy' + '1E4'") === S("stringy1E4"))
  }
  it should "test number 2457" in {
    assert(toNumber(eval("'stringy' - '1E4'")).isNaN)
  }
  it should "test number 2458" in {
    assert(toNumber(eval("'stringy' * '1E4'")).isNaN)
  }
  it should "test number 2459" in {
    assert(toNumber(eval("'stringy' / '1E4'")).isNaN)
  }
  it should "test number 2460" in {
    assert(eval("'stringy' === '1E4'") === B(false))
  }
  it should "test number 2461" in {
    assert(eval("'stringy' !== '1E4'") === B(true))
  }
  it should "test number 2462" in {
    assert(eval("'stringy' < '1E4'") === B(false))
  }
  it should "test number 2463" in {
    assert(eval("'stringy' <= '1E4'") === B(false))
  }
  it should "test number 2464" in {
    assert(eval("'stringy' > '1E4'") === B(true))
  }
  it should "test number 2465" in {
    assert(eval("'stringy' >= '1E4'") === B(true))
  }
  it should "test number 2466" in {
    assert(eval("'stringy' && '1E4'") === S("1E4"))
  }
  it should "test number 2467" in {
    assert(eval("'stringy' || '1E4'") === S("stringy"))
  }
  it should "test number 2468" in {
    assert(eval("'stringy' + console.log('foo')") === S("stringyundefined"))
  }
  it should "test number 2469" in {
    assert(toNumber(eval("'stringy' - console.log('foo')")).isNaN)
  }
  it should "test number 2470" in {
    assert(toNumber(eval("'stringy' * console.log('foo')")).isNaN)
  }
  it should "test number 2471" in {
    assert(toNumber(eval("'stringy' / console.log('foo')")).isNaN)
  }
  it should "test number 2472" in {
    assert(eval("'stringy' === console.log('foo')") === B(false))
  }
  it should "test number 2473" in {
    assert(eval("'stringy' !== console.log('foo')") === B(true))
  }
  it should "test number 2474" in {
    assert(eval("'stringy' < console.log('foo')") === B(false))
  }
  it should "test number 2475" in {
    assert(eval("'stringy' <= console.log('foo')") === B(false))
  }
  it should "test number 2476" in {
    assert(eval("'stringy' > console.log('foo')") === B(false))
  }
  it should "test number 2477" in {
    assert(eval("'stringy' >= console.log('foo')") === B(false))
  }
  it should "test number 2478" in {
    assert(eval("'stringy' && console.log('foo')") === Undefined)
  }
  it should "test number 2479" in {
    assert(eval("'stringy' || console.log('foo')") === S("stringy"))
  }
  it should "test number 2480" in {
    assert(eval("true + 4") === N(5))
  }
  it should "test number 2481" in {
    assert(eval("true - 4") === N(-3))
  }
  it should "test number 2482" in {
    assert(eval("true * 4") === N(4))
  }
  it should "test number 2483" in {
    assert(eval("true / 4") === N(0.25))
  }
  it should "test number 2484" in {
    assert(eval("true === 4") === B(false))
  }
  it should "test number 2485" in {
    assert(eval("true !== 4") === B(true))
  }
  it should "test number 2486" in {
    assert(eval("true < 4") === B(true))
  }
  it should "test number 2487" in {
    assert(eval("true <= 4") === B(true))
  }
  it should "test number 2488" in {
    assert(eval("true > 4") === B(false))
  }
  it should "test number 2489" in {
    assert(eval("true >= 4") === B(false))
  }
  it should "test number 2490" in {
    assert(eval("true && 4") === N(4))
  }
  it should "test number 2491" in {
    assert(eval("true || 4") === B(true))
  }
  it should "test number 2492" in {
    assert(eval("true + 0") === N(1))
  }
  it should "test number 2493" in {
    assert(eval("true - 0") === N(1))
  }
  it should "test number 2494" in {
    assert(eval("true * 0") === N(0))
  }
  it should "test number 2495" in {
    assert(eval("true / 0") === N(Double.PositiveInfinity))
  }
  it should "test number 2496" in {
    assert(eval("true === 0") === B(false))
  }
  it should "test number 2497" in {
    assert(eval("true !== 0") === B(true))
  }
  it should "test number 2498" in {
    assert(eval("true < 0") === B(false))
  }
  it should "test number 2499" in {
    assert(eval("true <= 0") === B(false))
  }
  it should "test number 2500" in {
    assert(eval("true > 0") === B(true))
  }
  it should "test number 2501" in {
    assert(eval("true >= 0") === B(true))
  }
  it should "test number 2502" in {
    assert(eval("true && 0") === N(0))
  }
  it should "test number 2503" in {
    assert(eval("true || 0") === B(true))
  }
  it should "test number 2504" in {
    assert(eval("true + ''") === S("true"))
  }
  it should "test number 2505" in {
    assert(eval("true - ''") === N(1))
  }
  it should "test number 2506" in {
    assert(eval("true * ''") === N(0))
  }
  it should "test number 2507" in {
    assert(eval("true / ''") === N(Double.PositiveInfinity))
  }
  it should "test number 2508" in {
    assert(eval("true === ''") === B(false))
  }
  it should "test number 2509" in {
    assert(eval("true !== ''") === B(true))
  }
  it should "test number 2510" in {
    assert(eval("true < ''") === B(false))
  }
  it should "test number 2511" in {
    assert(eval("true <= ''") === B(false))
  }
  it should "test number 2512" in {
    assert(eval("true > ''") === B(true))
  }
  it should "test number 2513" in {
    assert(eval("true >= ''") === B(true))
  }
  it should "test number 2514" in {
    assert(eval("true && ''") === S(""))
  }
  it should "test number 2515" in {
    assert(eval("true || ''") === B(true))
  }
  it should "test number 2516" in {
    assert(eval("true + 'stringy'") === S("truestringy"))
  }
  it should "test number 2517" in {
    assert(toNumber(eval("true - 'stringy'")).isNaN)
  }
  it should "test number 2518" in {
    assert(toNumber(eval("true * 'stringy'")).isNaN)
  }
  it should "test number 2519" in {
    assert(toNumber(eval("true / 'stringy'")).isNaN)
  }
  it should "test number 2520" in {
    assert(eval("true === 'stringy'") === B(false))
  }
  it should "test number 2521" in {
    assert(eval("true !== 'stringy'") === B(true))
  }
  it should "test number 2522" in {
    assert(eval("true < 'stringy'") === B(false))
  }
  it should "test number 2523" in {
    assert(eval("true <= 'stringy'") === B(false))
  }
  it should "test number 2524" in {
    assert(eval("true > 'stringy'") === B(false))
  }
  it should "test number 2525" in {
    assert(eval("true >= 'stringy'") === B(false))
  }
  it should "test number 2526" in {
    assert(eval("true && 'stringy'") === S("stringy"))
  }
  it should "test number 2527" in {
    assert(eval("true || 'stringy'") === B(true))
  }
  it should "test number 2528" in {
    assert(eval("true + true") === N(2))
  }
  it should "test number 2529" in {
    assert(eval("true - true") === N(0))
  }
  it should "test number 2530" in {
    assert(eval("true * true") === N(1))
  }
  it should "test number 2531" in {
    assert(eval("true / true") === N(1))
  }
  it should "test number 2532" in {
    assert(eval("true === true") === B(true))
  }
  it should "test number 2533" in {
    assert(eval("true !== true") === B(false))
  }
  it should "test number 2534" in {
    assert(eval("true < true") === B(false))
  }
  it should "test number 2535" in {
    assert(eval("true <= true") === B(true))
  }
  it should "test number 2536" in {
    assert(eval("true > true") === B(false))
  }
  it should "test number 2537" in {
    assert(eval("true >= true") === B(true))
  }
  it should "test number 2538" in {
    assert(eval("true && true") === B(true))
  }
  it should "test number 2539" in {
    assert(eval("true || true") === B(true))
  }
  it should "test number 2540" in {
    assert(eval("true + false") === N(1))
  }
  it should "test number 2541" in {
    assert(eval("true - false") === N(1))
  }
  it should "test number 2542" in {
    assert(eval("true * false") === N(0))
  }
  it should "test number 2543" in {
    assert(eval("true / false") === N(Double.PositiveInfinity))
  }
  it should "test number 2544" in {
    assert(eval("true === false") === B(false))
  }
  it should "test number 2545" in {
    assert(eval("true !== false") === B(true))
  }
  it should "test number 2546" in {
    assert(eval("true < false") === B(false))
  }
  it should "test number 2547" in {
    assert(eval("true <= false") === B(false))
  }
  it should "test number 2548" in {
    assert(eval("true > false") === B(true))
  }
  it should "test number 2549" in {
    assert(eval("true >= false") === B(true))
  }
  it should "test number 2550" in {
    assert(eval("true && false") === B(false))
  }
  it should "test number 2551" in {
    assert(eval("true || false") === B(true))
  }
  it should "test number 2552" in {
    assert(toNumber(eval("true + undefined")).isNaN)
  }
  it should "test number 2553" in {
    assert(toNumber(eval("true - undefined")).isNaN)
  }
  it should "test number 2554" in {
    assert(toNumber(eval("true * undefined")).isNaN)
  }
  it should "test number 2555" in {
    assert(toNumber(eval("true / undefined")).isNaN)
  }
  it should "test number 2556" in {
    assert(eval("true === undefined") === B(false))
  }
  it should "test number 2557" in {
    assert(eval("true !== undefined") === B(true))
  }
  it should "test number 2558" in {
    assert(eval("true < undefined") === B(false))
  }
  it should "test number 2559" in {
    assert(eval("true <= undefined") === B(false))
  }
  it should "test number 2560" in {
    assert(eval("true > undefined") === B(false))
  }
  it should "test number 2561" in {
    assert(eval("true >= undefined") === B(false))
  }
  it should "test number 2562" in {
    assert(eval("true && undefined") === Undefined)
  }
  it should "test number 2563" in {
    assert(eval("true || undefined") === B(true))
  }
  it should "test number 2564" in {
    assert(eval("true + Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2565" in {
    assert(eval("true - Infinity") === N(Double.NegativeInfinity))
  }
  it should "test number 2566" in {
    assert(eval("true * Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2567" in {
    assert(eval("true / Infinity") === N(0))
  }
  it should "test number 2568" in {
    assert(eval("true === Infinity") === B(false))
  }
  it should "test number 2569" in {
    assert(eval("true !== Infinity") === B(true))
  }
  it should "test number 2570" in {
    assert(eval("true < Infinity") === B(true))
  }
  it should "test number 2571" in {
    assert(eval("true <= Infinity") === B(true))
  }
  it should "test number 2572" in {
    assert(eval("true > Infinity") === B(false))
  }
  it should "test number 2573" in {
    assert(eval("true >= Infinity") === B(false))
  }
  it should "test number 2574" in {
    assert(eval("true && Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2575" in {
    assert(eval("true || Infinity") === B(true))
  }
  it should "test number 2576" in {
    assert(eval("true + '1E4'") === S("true1E4"))
  }
  it should "test number 2577" in {
    assert(eval("true - '1E4'") === N(-9999))
  }
  it should "test number 2578" in {
    assert(eval("true * '1E4'") === N(10000))
  }
  it should "test number 2579" in {
    assert(eval("true / '1E4'") === N(0.0001))
  }
  it should "test number 2580" in {
    assert(eval("true === '1E4'") === B(false))
  }
  it should "test number 2581" in {
    assert(eval("true !== '1E4'") === B(true))
  }
  it should "test number 2582" in {
    assert(eval("true < '1E4'") === B(true))
  }
  it should "test number 2583" in {
    assert(eval("true <= '1E4'") === B(true))
  }
  it should "test number 2584" in {
    assert(eval("true > '1E4'") === B(false))
  }
  it should "test number 2585" in {
    assert(eval("true >= '1E4'") === B(false))
  }
  it should "test number 2586" in {
    assert(eval("true && '1E4'") === S("1E4"))
  }
  it should "test number 2587" in {
    assert(eval("true || '1E4'") === B(true))
  }
  it should "test number 2588" in {
    assert(toNumber(eval("true + console.log('foo')")).isNaN)
  }
  it should "test number 2589" in {
    assert(toNumber(eval("true - console.log('foo')")).isNaN)
  }
  it should "test number 2590" in {
    assert(toNumber(eval("true * console.log('foo')")).isNaN)
  }
  it should "test number 2591" in {
    assert(toNumber(eval("true / console.log('foo')")).isNaN)
  }
  it should "test number 2592" in {
    assert(eval("true === console.log('foo')") === B(false))
  }
  it should "test number 2593" in {
    assert(eval("true !== console.log('foo')") === B(true))
  }
  it should "test number 2594" in {
    assert(eval("true < console.log('foo')") === B(false))
  }
  it should "test number 2595" in {
    assert(eval("true <= console.log('foo')") === B(false))
  }
  it should "test number 2596" in {
    assert(eval("true > console.log('foo')") === B(false))
  }
  it should "test number 2597" in {
    assert(eval("true >= console.log('foo')") === B(false))
  }
  it should "test number 2598" in {
    assert(eval("true && console.log('foo')") === Undefined)
  }
  it should "test number 2599" in {
    assert(eval("true || console.log('foo')") === B(true))
  }
  it should "test number 2600" in {
    assert(eval("false + 4") === N(4))
  }
  it should "test number 2601" in {
    assert(eval("false - 4") === N(-4))
  }
  it should "test number 2602" in {
    assert(eval("false * 4") === N(0))
  }
  it should "test number 2603" in {
    assert(eval("false / 4") === N(0))
  }
  it should "test number 2604" in {
    assert(eval("false === 4") === B(false))
  }
  it should "test number 2605" in {
    assert(eval("false !== 4") === B(true))
  }
  it should "test number 2606" in {
    assert(eval("false < 4") === B(true))
  }
  it should "test number 2607" in {
    assert(eval("false <= 4") === B(true))
  }
  it should "test number 2608" in {
    assert(eval("false > 4") === B(false))
  }
  it should "test number 2609" in {
    assert(eval("false >= 4") === B(false))
  }
  it should "test number 2610" in {
    assert(eval("false && 4") === B(false))
  }
  it should "test number 2611" in {
    assert(eval("false || 4") === N(4))
  }
  it should "test number 2612" in {
    assert(eval("false + 0") === N(0))
  }
  it should "test number 2613" in {
    assert(eval("false - 0") === N(0))
  }
  it should "test number 2614" in {
    assert(eval("false * 0") === N(0))
  }
  it should "test number 2615" in {
    assert(toNumber(eval("false / 0")).isNaN)
  }
  it should "test number 2616" in {
    assert(eval("false === 0") === B(false))
  }
  it should "test number 2617" in {
    assert(eval("false !== 0") === B(true))
  }
  it should "test number 2618" in {
    assert(eval("false < 0") === B(false))
  }
  it should "test number 2619" in {
    assert(eval("false <= 0") === B(true))
  }
  it should "test number 2620" in {
    assert(eval("false > 0") === B(false))
  }
  it should "test number 2621" in {
    assert(eval("false >= 0") === B(true))
  }
  it should "test number 2622" in {
    assert(eval("false && 0") === B(false))
  }
  it should "test number 2623" in {
    assert(eval("false || 0") === N(0))
  }
  it should "test number 2624" in {
    assert(eval("false + ''") === S("false"))
  }
  it should "test number 2625" in {
    assert(eval("false - ''") === N(0))
  }
  it should "test number 2626" in {
    assert(eval("false * ''") === N(0))
  }
  it should "test number 2627" in {
    assert(toNumber(eval("false / ''")).isNaN)
  }
  it should "test number 2628" in {
    assert(eval("false === ''") === B(false))
  }
  it should "test number 2629" in {
    assert(eval("false !== ''") === B(true))
  }
  it should "test number 2630" in {
    assert(eval("false < ''") === B(false))
  }
  it should "test number 2631" in {
    assert(eval("false <= ''") === B(true))
  }
  it should "test number 2632" in {
    assert(eval("false > ''") === B(false))
  }
  it should "test number 2633" in {
    assert(eval("false >= ''") === B(true))
  }
  it should "test number 2634" in {
    assert(eval("false && ''") === B(false))
  }
  it should "test number 2635" in {
    assert(eval("false || ''") === S(""))
  }
  it should "test number 2636" in {
    assert(eval("false + 'stringy'") === S("falsestringy"))
  }
  it should "test number 2637" in {
    assert(toNumber(eval("false - 'stringy'")).isNaN)
  }
  it should "test number 2638" in {
    assert(toNumber(eval("false * 'stringy'")).isNaN)
  }
  it should "test number 2639" in {
    assert(toNumber(eval("false / 'stringy'")).isNaN)
  }
  it should "test number 2640" in {
    assert(eval("false === 'stringy'") === B(false))
  }
  it should "test number 2641" in {
    assert(eval("false !== 'stringy'") === B(true))
  }
  it should "test number 2642" in {
    assert(eval("false < 'stringy'") === B(false))
  }
  it should "test number 2643" in {
    assert(eval("false <= 'stringy'") === B(false))
  }
  it should "test number 2644" in {
    assert(eval("false > 'stringy'") === B(false))
  }
  it should "test number 2645" in {
    assert(eval("false >= 'stringy'") === B(false))
  }
  it should "test number 2646" in {
    assert(eval("false && 'stringy'") === B(false))
  }
  it should "test number 2647" in {
    assert(eval("false || 'stringy'") === S("stringy"))
  }
  it should "test number 2648" in {
    assert(eval("false + true") === N(1))
  }
  it should "test number 2649" in {
    assert(eval("false - true") === N(-1))
  }
  it should "test number 2650" in {
    assert(eval("false * true") === N(0))
  }
  it should "test number 2651" in {
    assert(eval("false / true") === N(0))
  }
  it should "test number 2652" in {
    assert(eval("false === true") === B(false))
  }
  it should "test number 2653" in {
    assert(eval("false !== true") === B(true))
  }
  it should "test number 2654" in {
    assert(eval("false < true") === B(true))
  }
  it should "test number 2655" in {
    assert(eval("false <= true") === B(true))
  }
  it should "test number 2656" in {
    assert(eval("false > true") === B(false))
  }
  it should "test number 2657" in {
    assert(eval("false >= true") === B(false))
  }
  it should "test number 2658" in {
    assert(eval("false && true") === B(false))
  }
  it should "test number 2659" in {
    assert(eval("false || true") === B(true))
  }
  it should "test number 2660" in {
    assert(eval("false + false") === N(0))
  }
  it should "test number 2661" in {
    assert(eval("false - false") === N(0))
  }
  it should "test number 2662" in {
    assert(eval("false * false") === N(0))
  }
  it should "test number 2663" in {
    assert(toNumber(eval("false / false")).isNaN)
  }
  it should "test number 2664" in {
    assert(eval("false === false") === B(true))
  }
  it should "test number 2665" in {
    assert(eval("false !== false") === B(false))
  }
  it should "test number 2666" in {
    assert(eval("false < false") === B(false))
  }
  it should "test number 2667" in {
    assert(eval("false <= false") === B(true))
  }
  it should "test number 2668" in {
    assert(eval("false > false") === B(false))
  }
  it should "test number 2669" in {
    assert(eval("false >= false") === B(true))
  }
  it should "test number 2670" in {
    assert(eval("false && false") === B(false))
  }
  it should "test number 2671" in {
    assert(eval("false || false") === B(false))
  }
  it should "test number 2672" in {
    assert(toNumber(eval("false + undefined")).isNaN)
  }
  it should "test number 2673" in {
    assert(toNumber(eval("false - undefined")).isNaN)
  }
  it should "test number 2674" in {
    assert(toNumber(eval("false * undefined")).isNaN)
  }
  it should "test number 2675" in {
    assert(toNumber(eval("false / undefined")).isNaN)
  }
  it should "test number 2676" in {
    assert(eval("false === undefined") === B(false))
  }
  it should "test number 2677" in {
    assert(eval("false !== undefined") === B(true))
  }
  it should "test number 2678" in {
    assert(eval("false < undefined") === B(false))
  }
  it should "test number 2679" in {
    assert(eval("false <= undefined") === B(false))
  }
  it should "test number 2680" in {
    assert(eval("false > undefined") === B(false))
  }
  it should "test number 2681" in {
    assert(eval("false >= undefined") === B(false))
  }
  it should "test number 2682" in {
    assert(eval("false && undefined") === B(false))
  }
  it should "test number 2683" in {
    assert(eval("false || undefined") === Undefined)
  }
  it should "test number 2684" in {
    assert(eval("false + Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2685" in {
    assert(eval("false - Infinity") === N(Double.NegativeInfinity))
  }
  it should "test number 2686" in {
    assert(toNumber(eval("false * Infinity")).isNaN)
  }
  it should "test number 2687" in {
    assert(eval("false / Infinity") === N(0))
  }
  it should "test number 2688" in {
    assert(eval("false === Infinity") === B(false))
  }
  it should "test number 2689" in {
    assert(eval("false !== Infinity") === B(true))
  }
  it should "test number 2690" in {
    assert(eval("false < Infinity") === B(true))
  }
  it should "test number 2691" in {
    assert(eval("false <= Infinity") === B(true))
  }
  it should "test number 2692" in {
    assert(eval("false > Infinity") === B(false))
  }
  it should "test number 2693" in {
    assert(eval("false >= Infinity") === B(false))
  }
  it should "test number 2694" in {
    assert(eval("false && Infinity") === B(false))
  }
  it should "test number 2695" in {
    assert(eval("false || Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2696" in {
    assert(eval("false + '1E4'") === S("false1E4"))
  }
  it should "test number 2697" in {
    assert(eval("false - '1E4'") === N(-10000))
  }
  it should "test number 2698" in {
    assert(eval("false * '1E4'") === N(0))
  }
  it should "test number 2699" in {
    assert(eval("false / '1E4'") === N(0))
  }
  it should "test number 2700" in {
    assert(eval("false === '1E4'") === B(false))
  }
  it should "test number 2701" in {
    assert(eval("false !== '1E4'") === B(true))
  }
  it should "test number 2702" in {
    assert(eval("false < '1E4'") === B(true))
  }
  it should "test number 2703" in {
    assert(eval("false <= '1E4'") === B(true))
  }
  it should "test number 2704" in {
    assert(eval("false > '1E4'") === B(false))
  }
  it should "test number 2705" in {
    assert(eval("false >= '1E4'") === B(false))
  }
  it should "test number 2706" in {
    assert(eval("false && '1E4'") === B(false))
  }
  it should "test number 2707" in {
    assert(eval("false || '1E4'") === S("1E4"))
  }
  it should "test number 2708" in {
    assert(toNumber(eval("false + console.log('foo')")).isNaN)
  }
  it should "test number 2709" in {
    assert(toNumber(eval("false - console.log('foo')")).isNaN)
  }
  it should "test number 2710" in {
    assert(toNumber(eval("false * console.log('foo')")).isNaN)
  }
  it should "test number 2711" in {
    assert(toNumber(eval("false / console.log('foo')")).isNaN)
  }
  it should "test number 2712" in {
    assert(eval("false === console.log('foo')") === B(false))
  }
  it should "test number 2713" in {
    assert(eval("false !== console.log('foo')") === B(true))
  }
  it should "test number 2714" in {
    assert(eval("false < console.log('foo')") === B(false))
  }
  it should "test number 2715" in {
    assert(eval("false <= console.log('foo')") === B(false))
  }
  it should "test number 2716" in {
    assert(eval("false > console.log('foo')") === B(false))
  }
  it should "test number 2717" in {
    assert(eval("false >= console.log('foo')") === B(false))
  }
  it should "test number 2718" in {
    assert(eval("false && console.log('foo')") === B(false))
  }
  it should "test number 2719" in {
    assert(eval("false || console.log('foo')") === Undefined)
  }
  it should "test number 2720" in {
    assert(toNumber(eval("undefined + 4")).isNaN)
  }
  it should "test number 2721" in {
    assert(toNumber(eval("undefined - 4")).isNaN)
  }
  it should "test number 2722" in {
    assert(toNumber(eval("undefined * 4")).isNaN)
  }
  it should "test number 2723" in {
    assert(toNumber(eval("undefined / 4")).isNaN)
  }
  it should "test number 2724" in {
    assert(eval("undefined === 4") === B(false))
  }
  it should "test number 2725" in {
    assert(eval("undefined !== 4") === B(true))
  }
  it should "test number 2726" in {
    assert(eval("undefined < 4") === B(false))
  }
  it should "test number 2727" in {
    assert(eval("undefined <= 4") === B(false))
  }
  it should "test number 2728" in {
    assert(eval("undefined > 4") === B(false))
  }
  it should "test number 2729" in {
    assert(eval("undefined >= 4") === B(false))
  }
  it should "test number 2730" in {
    assert(eval("undefined && 4") === Undefined)
  }
  it should "test number 2731" in {
    assert(eval("undefined || 4") === N(4))
  }
  it should "test number 2732" in {
    assert(toNumber(eval("undefined + 0")).isNaN)
  }
  it should "test number 2733" in {
    assert(toNumber(eval("undefined - 0")).isNaN)
  }
  it should "test number 2734" in {
    assert(toNumber(eval("undefined * 0")).isNaN)
  }
  it should "test number 2735" in {
    assert(toNumber(eval("undefined / 0")).isNaN)
  }
  it should "test number 2736" in {
    assert(eval("undefined === 0") === B(false))
  }
  it should "test number 2737" in {
    assert(eval("undefined !== 0") === B(true))
  }
  it should "test number 2738" in {
    assert(eval("undefined < 0") === B(false))
  }
  it should "test number 2739" in {
    assert(eval("undefined <= 0") === B(false))
  }
  it should "test number 2740" in {
    assert(eval("undefined > 0") === B(false))
  }
  it should "test number 2741" in {
    assert(eval("undefined >= 0") === B(false))
  }
  it should "test number 2742" in {
    assert(eval("undefined && 0") === Undefined)
  }
  it should "test number 2743" in {
    assert(eval("undefined || 0") === N(0))
  }
  it should "test number 2744" in {
    assert(eval("undefined + ''") === S("undefined"))
  }
  it should "test number 2745" in {
    assert(toNumber(eval("undefined - ''")).isNaN)
  }
  it should "test number 2746" in {
    assert(toNumber(eval("undefined * ''")).isNaN)
  }
  it should "test number 2747" in {
    assert(toNumber(eval("undefined / ''")).isNaN)
  }
  it should "test number 2748" in {
    assert(eval("undefined === ''") === B(false))
  }
  it should "test number 2749" in {
    assert(eval("undefined !== ''") === B(true))
  }
  it should "test number 2750" in {
    assert(eval("undefined < ''") === B(false))
  }
  it should "test number 2751" in {
    assert(eval("undefined <= ''") === B(false))
  }
  it should "test number 2752" in {
    assert(eval("undefined > ''") === B(false))
  }
  it should "test number 2753" in {
    assert(eval("undefined >= ''") === B(false))
  }
  it should "test number 2754" in {
    assert(eval("undefined && ''") === Undefined)
  }
  it should "test number 2755" in {
    assert(eval("undefined || ''") === S(""))
  }
  it should "test number 2756" in {
    assert(eval("undefined + 'stringy'") === S("undefinedstringy"))
  }
  it should "test number 2757" in {
    assert(toNumber(eval("undefined - 'stringy'")).isNaN)
  }
  it should "test number 2758" in {
    assert(toNumber(eval("undefined * 'stringy'")).isNaN)
  }
  it should "test number 2759" in {
    assert(toNumber(eval("undefined / 'stringy'")).isNaN)
  }
  it should "test number 2760" in {
    assert(eval("undefined === 'stringy'") === B(false))
  }
  it should "test number 2761" in {
    assert(eval("undefined !== 'stringy'") === B(true))
  }
  it should "test number 2762" in {
    assert(eval("undefined < 'stringy'") === B(false))
  }
  it should "test number 2763" in {
    assert(eval("undefined <= 'stringy'") === B(false))
  }
  it should "test number 2764" in {
    assert(eval("undefined > 'stringy'") === B(false))
  }
  it should "test number 2765" in {
    assert(eval("undefined >= 'stringy'") === B(false))
  }
  it should "test number 2766" in {
    assert(eval("undefined && 'stringy'") === Undefined)
  }
  it should "test number 2767" in {
    assert(eval("undefined || 'stringy'") === S("stringy"))
  }
  it should "test number 2768" in {
    assert(toNumber(eval("undefined + true")).isNaN)
  }
  it should "test number 2769" in {
    assert(toNumber(eval("undefined - true")).isNaN)
  }
  it should "test number 2770" in {
    assert(toNumber(eval("undefined * true")).isNaN)
  }
  it should "test number 2771" in {
    assert(toNumber(eval("undefined / true")).isNaN)
  }
  it should "test number 2772" in {
    assert(eval("undefined === true") === B(false))
  }
  it should "test number 2773" in {
    assert(eval("undefined !== true") === B(true))
  }
  it should "test number 2774" in {
    assert(eval("undefined < true") === B(false))
  }
  it should "test number 2775" in {
    assert(eval("undefined <= true") === B(false))
  }
  it should "test number 2776" in {
    assert(eval("undefined > true") === B(false))
  }
  it should "test number 2777" in {
    assert(eval("undefined >= true") === B(false))
  }
  it should "test number 2778" in {
    assert(eval("undefined && true") === Undefined)
  }
  it should "test number 2779" in {
    assert(eval("undefined || true") === B(true))
  }
  it should "test number 2780" in {
    assert(toNumber(eval("undefined + false")).isNaN)
  }
  it should "test number 2781" in {
    assert(toNumber(eval("undefined - false")).isNaN)
  }
  it should "test number 2782" in {
    assert(toNumber(eval("undefined * false")).isNaN)
  }
  it should "test number 2783" in {
    assert(toNumber(eval("undefined / false")).isNaN)
  }
  it should "test number 2784" in {
    assert(eval("undefined === false") === B(false))
  }
  it should "test number 2785" in {
    assert(eval("undefined !== false") === B(true))
  }
  it should "test number 2786" in {
    assert(eval("undefined < false") === B(false))
  }
  it should "test number 2787" in {
    assert(eval("undefined <= false") === B(false))
  }
  it should "test number 2788" in {
    assert(eval("undefined > false") === B(false))
  }
  it should "test number 2789" in {
    assert(eval("undefined >= false") === B(false))
  }
  it should "test number 2790" in {
    assert(eval("undefined && false") === Undefined)
  }
  it should "test number 2791" in {
    assert(eval("undefined || false") === B(false))
  }
  it should "test number 2792" in {
    assert(toNumber(eval("undefined + undefined")).isNaN)
  }
  it should "test number 2793" in {
    assert(toNumber(eval("undefined - undefined")).isNaN)
  }
  it should "test number 2794" in {
    assert(toNumber(eval("undefined * undefined")).isNaN)
  }
  it should "test number 2795" in {
    assert(toNumber(eval("undefined / undefined")).isNaN)
  }
  it should "test number 2796" in {
    assert(eval("undefined === undefined") === B(true))
  }
  it should "test number 2797" in {
    assert(eval("undefined !== undefined") === B(false))
  }
  it should "test number 2798" in {
    assert(eval("undefined < undefined") === B(false))
  }
  it should "test number 2799" in {
    assert(eval("undefined <= undefined") === B(false))
  }
  it should "test number 2800" in {
    assert(eval("undefined > undefined") === B(false))
  }
  it should "test number 2801" in {
    assert(eval("undefined >= undefined") === B(false))
  }
  it should "test number 2802" in {
    assert(eval("undefined && undefined") === Undefined)
  }
  it should "test number 2803" in {
    assert(eval("undefined || undefined") === Undefined)
  }
  it should "test number 2804" in {
    assert(toNumber(eval("undefined + Infinity")).isNaN)
  }
  it should "test number 2805" in {
    assert(toNumber(eval("undefined - Infinity")).isNaN)
  }
  it should "test number 2806" in {
    assert(toNumber(eval("undefined * Infinity")).isNaN)
  }
  it should "test number 2807" in {
    assert(toNumber(eval("undefined / Infinity")).isNaN)
  }
  it should "test number 2808" in {
    assert(eval("undefined === Infinity") === B(false))
  }
  it should "test number 2809" in {
    assert(eval("undefined !== Infinity") === B(true))
  }
  it should "test number 2810" in {
    assert(eval("undefined < Infinity") === B(false))
  }
  it should "test number 2811" in {
    assert(eval("undefined <= Infinity") === B(false))
  }
  it should "test number 2812" in {
    assert(eval("undefined > Infinity") === B(false))
  }
  it should "test number 2813" in {
    assert(eval("undefined >= Infinity") === B(false))
  }
  it should "test number 2814" in {
    assert(eval("undefined && Infinity") === Undefined)
  }
  it should "test number 2815" in {
    assert(eval("undefined || Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2816" in {
    assert(eval("undefined + '1E4'") === S("undefined1E4"))
  }
  it should "test number 2817" in {
    assert(toNumber(eval("undefined - '1E4'")).isNaN)
  }
  it should "test number 2818" in {
    assert(toNumber(eval("undefined * '1E4'")).isNaN)
  }
  it should "test number 2819" in {
    assert(toNumber(eval("undefined / '1E4'")).isNaN)
  }
  it should "test number 2820" in {
    assert(eval("undefined === '1E4'") === B(false))
  }
  it should "test number 2821" in {
    assert(eval("undefined !== '1E4'") === B(true))
  }
  it should "test number 2822" in {
    assert(eval("undefined < '1E4'") === B(false))
  }
  it should "test number 2823" in {
    assert(eval("undefined <= '1E4'") === B(false))
  }
  it should "test number 2824" in {
    assert(eval("undefined > '1E4'") === B(false))
  }
  it should "test number 2825" in {
    assert(eval("undefined >= '1E4'") === B(false))
  }
  it should "test number 2826" in {
    assert(eval("undefined && '1E4'") === Undefined)
  }
  it should "test number 2827" in {
    assert(eval("undefined || '1E4'") === S("1E4"))
  }
  it should "test number 2828" in {
    assert(toNumber(eval("undefined + console.log('foo')")).isNaN)
  }
  it should "test number 2829" in {
    assert(toNumber(eval("undefined - console.log('foo')")).isNaN)
  }
  it should "test number 2830" in {
    assert(toNumber(eval("undefined * console.log('foo')")).isNaN)
  }
  it should "test number 2831" in {
    assert(toNumber(eval("undefined / console.log('foo')")).isNaN)
  }
  it should "test number 2832" in {
    assert(eval("undefined === console.log('foo')") === B(true))
  }
  it should "test number 2833" in {
    assert(eval("undefined !== console.log('foo')") === B(false))
  }
  it should "test number 2834" in {
    assert(eval("undefined < console.log('foo')") === B(false))
  }
  it should "test number 2835" in {
    assert(eval("undefined <= console.log('foo')") === B(false))
  }
  it should "test number 2836" in {
    assert(eval("undefined > console.log('foo')") === B(false))
  }
  it should "test number 2837" in {
    assert(eval("undefined >= console.log('foo')") === B(false))
  }
  it should "test number 2838" in {
    assert(eval("undefined && console.log('foo')") === Undefined)
  }
  it should "test number 2839" in {
    assert(eval("undefined || console.log('foo')") === Undefined)
  }
  it should "test number 2840" in {
    assert(eval("Infinity + 4") === N(Double.PositiveInfinity))
  }
  it should "test number 2841" in {
    assert(eval("Infinity - 4") === N(Double.PositiveInfinity))
  }
  it should "test number 2842" in {
    assert(eval("Infinity * 4") === N(Double.PositiveInfinity))
  }
  it should "test number 2843" in {
    assert(eval("Infinity / 4") === N(Double.PositiveInfinity))
  }
  it should "test number 2844" in {
    assert(eval("Infinity === 4") === B(false))
  }
  it should "test number 2845" in {
    assert(eval("Infinity !== 4") === B(true))
  }
  it should "test number 2846" in {
    assert(eval("Infinity < 4") === B(false))
  }
  it should "test number 2847" in {
    assert(eval("Infinity <= 4") === B(false))
  }
  it should "test number 2848" in {
    assert(eval("Infinity > 4") === B(true))
  }
  it should "test number 2849" in {
    assert(eval("Infinity >= 4") === B(true))
  }
  it should "test number 2850" in {
    assert(eval("Infinity && 4") === N(4))
  }
  it should "test number 2851" in {
    assert(eval("Infinity || 4") === N(Double.PositiveInfinity))
  }
  it should "test number 2852" in {
    assert(eval("Infinity + 0") === N(Double.PositiveInfinity))
  }
  it should "test number 2853" in {
    assert(eval("Infinity - 0") === N(Double.PositiveInfinity))
  }
  it should "test number 2854" in {
    assert(toNumber(eval("Infinity * 0")).isNaN)
  }
  it should "test number 2855" in {
    assert(eval("Infinity / 0") === N(Double.PositiveInfinity))
  }
  it should "test number 2856" in {
    assert(eval("Infinity === 0") === B(false))
  }
  it should "test number 2857" in {
    assert(eval("Infinity !== 0") === B(true))
  }
  it should "test number 2858" in {
    assert(eval("Infinity < 0") === B(false))
  }
  it should "test number 2859" in {
    assert(eval("Infinity <= 0") === B(false))
  }
  it should "test number 2860" in {
    assert(eval("Infinity > 0") === B(true))
  }
  it should "test number 2861" in {
    assert(eval("Infinity >= 0") === B(true))
  }
  it should "test number 2862" in {
    assert(eval("Infinity && 0") === N(0))
  }
  it should "test number 2863" in {
    assert(eval("Infinity || 0") === N(Double.PositiveInfinity))
  }
  it should "test number 2864" in {
    assert(eval("Infinity + ''") === S("Infinity"))
  }
  it should "test number 2865" in {
    assert(eval("Infinity - ''") === N(Double.PositiveInfinity))
  }
  it should "test number 2866" in {
    assert(toNumber(eval("Infinity * ''")).isNaN)
  }
  it should "test number 2867" in {
    assert(eval("Infinity / ''") === N(Double.PositiveInfinity))
  }
  it should "test number 2868" in {
    assert(eval("Infinity === ''") === B(false))
  }
  it should "test number 2869" in {
    assert(eval("Infinity !== ''") === B(true))
  }
  it should "test number 2870" in {
    assert(eval("Infinity < ''") === B(false))
  }
  it should "test number 2871" in {
    assert(eval("Infinity <= ''") === B(false))
  }
  it should "test number 2872" in {
    assert(eval("Infinity > ''") === B(true))
  }
  it should "test number 2873" in {
    assert(eval("Infinity >= ''") === B(true))
  }
  it should "test number 2874" in {
    assert(eval("Infinity && ''") === S(""))
  }
  it should "test number 2875" in {
    assert(eval("Infinity || ''") === N(Double.PositiveInfinity))
  }
  it should "test number 2876" in {
    assert(eval("Infinity + 'stringy'") === S("Infinitystringy"))
  }
  it should "test number 2877" in {
    assert(toNumber(eval("Infinity - 'stringy'")).isNaN)
  }
  it should "test number 2878" in {
    assert(toNumber(eval("Infinity * 'stringy'")).isNaN)
  }
  it should "test number 2879" in {
    assert(toNumber(eval("Infinity / 'stringy'")).isNaN)
  }
  it should "test number 2880" in {
    assert(eval("Infinity === 'stringy'") === B(false))
  }
  it should "test number 2881" in {
    assert(eval("Infinity !== 'stringy'") === B(true))
  }
  it should "test number 2882" in {
    assert(eval("Infinity < 'stringy'") === B(false))
  }
  it should "test number 2883" in {
    assert(eval("Infinity <= 'stringy'") === B(false))
  }
  it should "test number 2884" in {
    assert(eval("Infinity > 'stringy'") === B(false))
  }
  it should "test number 2885" in {
    assert(eval("Infinity >= 'stringy'") === B(false))
  }
  it should "test number 2886" in {
    assert(eval("Infinity && 'stringy'") === S("stringy"))
  }
  it should "test number 2887" in {
    assert(eval("Infinity || 'stringy'") === N(Double.PositiveInfinity))
  }
  it should "test number 2888" in {
    assert(eval("Infinity + true") === N(Double.PositiveInfinity))
  }
  it should "test number 2889" in {
    assert(eval("Infinity - true") === N(Double.PositiveInfinity))
  }
  it should "test number 2890" in {
    assert(eval("Infinity * true") === N(Double.PositiveInfinity))
  }
  it should "test number 2891" in {
    assert(eval("Infinity / true") === N(Double.PositiveInfinity))
  }
  it should "test number 2892" in {
    assert(eval("Infinity === true") === B(false))
  }
  it should "test number 2893" in {
    assert(eval("Infinity !== true") === B(true))
  }
  it should "test number 2894" in {
    assert(eval("Infinity < true") === B(false))
  }
  it should "test number 2895" in {
    assert(eval("Infinity <= true") === B(false))
  }
  it should "test number 2896" in {
    assert(eval("Infinity > true") === B(true))
  }
  it should "test number 2897" in {
    assert(eval("Infinity >= true") === B(true))
  }
  it should "test number 2898" in {
    assert(eval("Infinity && true") === B(true))
  }
  it should "test number 2899" in {
    assert(eval("Infinity || true") === N(Double.PositiveInfinity))
  }
  it should "test number 2900" in {
    assert(eval("Infinity + false") === N(Double.PositiveInfinity))
  }
  it should "test number 2901" in {
    assert(eval("Infinity - false") === N(Double.PositiveInfinity))
  }
  it should "test number 2902" in {
    assert(toNumber(eval("Infinity * false")).isNaN)
  }
  it should "test number 2903" in {
    assert(eval("Infinity / false") === N(Double.PositiveInfinity))
  }
  it should "test number 2904" in {
    assert(eval("Infinity === false") === B(false))
  }
  it should "test number 2905" in {
    assert(eval("Infinity !== false") === B(true))
  }
  it should "test number 2906" in {
    assert(eval("Infinity < false") === B(false))
  }
  it should "test number 2907" in {
    assert(eval("Infinity <= false") === B(false))
  }
  it should "test number 2908" in {
    assert(eval("Infinity > false") === B(true))
  }
  it should "test number 2909" in {
    assert(eval("Infinity >= false") === B(true))
  }
  it should "test number 2910" in {
    assert(eval("Infinity && false") === B(false))
  }
  it should "test number 2911" in {
    assert(eval("Infinity || false") === N(Double.PositiveInfinity))
  }
  it should "test number 2912" in {
    assert(toNumber(eval("Infinity + undefined")).isNaN)
  }
  it should "test number 2913" in {
    assert(toNumber(eval("Infinity - undefined")).isNaN)
  }
  it should "test number 2914" in {
    assert(toNumber(eval("Infinity * undefined")).isNaN)
  }
  it should "test number 2915" in {
    assert(toNumber(eval("Infinity / undefined")).isNaN)
  }
  it should "test number 2916" in {
    assert(eval("Infinity === undefined") === B(false))
  }
  it should "test number 2917" in {
    assert(eval("Infinity !== undefined") === B(true))
  }
  it should "test number 2918" in {
    assert(eval("Infinity < undefined") === B(false))
  }
  it should "test number 2919" in {
    assert(eval("Infinity <= undefined") === B(false))
  }
  it should "test number 2920" in {
    assert(eval("Infinity > undefined") === B(false))
  }
  it should "test number 2921" in {
    assert(eval("Infinity >= undefined") === B(false))
  }
  it should "test number 2922" in {
    assert(eval("Infinity && undefined") === Undefined)
  }
  it should "test number 2923" in {
    assert(eval("Infinity || undefined") === N(Double.PositiveInfinity))
  }
  it should "test number 2924" in {
    assert(eval("Infinity + Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2925" in {
    assert(toNumber(eval("Infinity - Infinity")).isNaN)
  }
  it should "test number 2926" in {
    assert(eval("Infinity * Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2927" in {
    assert(toNumber(eval("Infinity / Infinity")).isNaN)
  }
  it should "test number 2928" in {
    assert(eval("Infinity === Infinity") === B(true))
  }
  it should "test number 2929" in {
    assert(eval("Infinity !== Infinity") === B(false))
  }
  it should "test number 2930" in {
    assert(eval("Infinity < Infinity") === B(false))
  }
  it should "test number 2931" in {
    assert(eval("Infinity <= Infinity") === B(true))
  }
  it should "test number 2932" in {
    assert(eval("Infinity > Infinity") === B(false))
  }
  it should "test number 2933" in {
    assert(eval("Infinity >= Infinity") === B(true))
  }
  it should "test number 2934" in {
    assert(eval("Infinity && Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2935" in {
    assert(eval("Infinity || Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 2936" in {
    assert(eval("Infinity + '1E4'") === S("Infinity1E4"))
  }
  it should "test number 2937" in {
    assert(eval("Infinity - '1E4'") === N(Double.PositiveInfinity))
  }
  it should "test number 2938" in {
    assert(eval("Infinity * '1E4'") === N(Double.PositiveInfinity))
  }
  it should "test number 2939" in {
    assert(eval("Infinity / '1E4'") === N(Double.PositiveInfinity))
  }
  it should "test number 2940" in {
    assert(eval("Infinity === '1E4'") === B(false))
  }
  it should "test number 2941" in {
    assert(eval("Infinity !== '1E4'") === B(true))
  }
  it should "test number 2942" in {
    assert(eval("Infinity < '1E4'") === B(false))
  }
  it should "test number 2943" in {
    assert(eval("Infinity <= '1E4'") === B(false))
  }
  it should "test number 2944" in {
    assert(eval("Infinity > '1E4'") === B(true))
  }
  it should "test number 2945" in {
    assert(eval("Infinity >= '1E4'") === B(true))
  }
  it should "test number 2946" in {
    assert(eval("Infinity && '1E4'") === S("1E4"))
  }
  it should "test number 2947" in {
    assert(eval("Infinity || '1E4'") === N(Double.PositiveInfinity))
  }
  it should "test number 2948" in {
    assert(toNumber(eval("Infinity + console.log('foo')")).isNaN)
  }
  it should "test number 2949" in {
    assert(toNumber(eval("Infinity - console.log('foo')")).isNaN)
  }
  it should "test number 2950" in {
    assert(toNumber(eval("Infinity * console.log('foo')")).isNaN)
  }
  it should "test number 2951" in {
    assert(toNumber(eval("Infinity / console.log('foo')")).isNaN)
  }
  it should "test number 2952" in {
    assert(eval("Infinity === console.log('foo')") === B(false))
  }
  it should "test number 2953" in {
    assert(eval("Infinity !== console.log('foo')") === B(true))
  }
  it should "test number 2954" in {
    assert(eval("Infinity < console.log('foo')") === B(false))
  }
  it should "test number 2955" in {
    assert(eval("Infinity <= console.log('foo')") === B(false))
  }
  it should "test number 2956" in {
    assert(eval("Infinity > console.log('foo')") === B(false))
  }
  it should "test number 2957" in {
    assert(eval("Infinity >= console.log('foo')") === B(false))
  }
  it should "test number 2958" in {
    assert(eval("Infinity && console.log('foo')") === Undefined)
  }
  it should "test number 2959" in {
    assert(eval("Infinity || console.log('foo')") === N(Double.PositiveInfinity))
  }
  it should "test number 2960" in {
    assert(eval("'1E4' + 4") === S("1E44"))
  }
  it should "test number 2961" in {
    assert(eval("'1E4' - 4") === N(9996))
  }
  it should "test number 2962" in {
    assert(eval("'1E4' * 4") === N(40000))
  }
  it should "test number 2963" in {
    assert(eval("'1E4' / 4") === N(2500))
  }
  it should "test number 2964" in {
    assert(eval("'1E4' === 4") === B(false))
  }
  it should "test number 2965" in {
    assert(eval("'1E4' !== 4") === B(true))
  }
  it should "test number 2966" in {
    assert(eval("'1E4' < 4") === B(false))
  }
  it should "test number 2967" in {
    assert(eval("'1E4' <= 4") === B(false))
  }
  it should "test number 2968" in {
    assert(eval("'1E4' > 4") === B(true))
  }
  it should "test number 2969" in {
    assert(eval("'1E4' >= 4") === B(true))
  }
  it should "test number 2970" in {
    assert(eval("'1E4' && 4") === N(4))
  }
  it should "test number 2971" in {
    assert(eval("'1E4' || 4") === S("1E4"))
  }
  it should "test number 2972" in {
    assert(eval("'1E4' + 0") === S("1E40"))
  }
  it should "test number 2973" in {
    assert(eval("'1E4' - 0") === N(10000))
  }
  it should "test number 2974" in {
    assert(eval("'1E4' * 0") === N(0))
  }
  it should "test number 2975" in {
    assert(eval("'1E4' / 0") === N(Double.PositiveInfinity))
  }
  it should "test number 2976" in {
    assert(eval("'1E4' === 0") === B(false))
  }
  it should "test number 2977" in {
    assert(eval("'1E4' !== 0") === B(true))
  }
  it should "test number 2978" in {
    assert(eval("'1E4' < 0") === B(false))
  }
  it should "test number 2979" in {
    assert(eval("'1E4' <= 0") === B(false))
  }
  it should "test number 2980" in {
    assert(eval("'1E4' > 0") === B(true))
  }
  it should "test number 2981" in {
    assert(eval("'1E4' >= 0") === B(true))
  }
  it should "test number 2982" in {
    assert(eval("'1E4' && 0") === N(0))
  }
  it should "test number 2983" in {
    assert(eval("'1E4' || 0") === S("1E4"))
  }
  it should "test number 2984" in {
    assert(eval("'1E4' + ''") === S("1E4"))
  }
  it should "test number 2985" in {
    assert(eval("'1E4' - ''") === N(10000))
  }
  it should "test number 2986" in {
    assert(eval("'1E4' * ''") === N(0))
  }
  it should "test number 2987" in {
    assert(eval("'1E4' / ''") === N(Double.PositiveInfinity))
  }
  it should "test number 2988" in {
    assert(eval("'1E4' === ''") === B(false))
  }
  it should "test number 2989" in {
    assert(eval("'1E4' !== ''") === B(true))
  }
  it should "test number 2990" in {
    assert(eval("'1E4' < ''") === B(false))
  }
  it should "test number 2991" in {
    assert(eval("'1E4' <= ''") === B(false))
  }
  it should "test number 2992" in {
    assert(eval("'1E4' > ''") === B(true))
  }
  it should "test number 2993" in {
    assert(eval("'1E4' >= ''") === B(true))
  }
  it should "test number 2994" in {
    assert(eval("'1E4' && ''") === S(""))
  }
  it should "test number 2995" in {
    assert(eval("'1E4' || ''") === S("1E4"))
  }
  it should "test number 2996" in {
    assert(eval("'1E4' + 'stringy'") === S("1E4stringy"))
  }
  it should "test number 2997" in {
    assert(toNumber(eval("'1E4' - 'stringy'")).isNaN)
  }
  it should "test number 2998" in {
    assert(toNumber(eval("'1E4' * 'stringy'")).isNaN)
  }
  it should "test number 2999" in {
    assert(toNumber(eval("'1E4' / 'stringy'")).isNaN)
  }
  it should "test number 3000" in {
    assert(eval("'1E4' === 'stringy'") === B(false))
  }
  it should "test number 3001" in {
    assert(eval("'1E4' !== 'stringy'") === B(true))
  }
  it should "test number 3002" in {
    assert(eval("'1E4' < 'stringy'") === B(true))
  }
  it should "test number 3003" in {
    assert(eval("'1E4' <= 'stringy'") === B(true))
  }
  it should "test number 3004" in {
    assert(eval("'1E4' > 'stringy'") === B(false))
  }
  it should "test number 3005" in {
    assert(eval("'1E4' >= 'stringy'") === B(false))
  }
  it should "test number 3006" in {
    assert(eval("'1E4' && 'stringy'") === S("stringy"))
  }
  it should "test number 3007" in {
    assert(eval("'1E4' || 'stringy'") === S("1E4"))
  }
  it should "test number 3008" in {
    assert(eval("'1E4' + true") === S("1E4true"))
  }
  it should "test number 3009" in {
    assert(eval("'1E4' - true") === N(9999))
  }
  it should "test number 3010" in {
    assert(eval("'1E4' * true") === N(10000))
  }
  it should "test number 3011" in {
    assert(eval("'1E4' / true") === N(10000))
  }
  it should "test number 3012" in {
    assert(eval("'1E4' === true") === B(false))
  }
  it should "test number 3013" in {
    assert(eval("'1E4' !== true") === B(true))
  }
  it should "test number 3014" in {
    assert(eval("'1E4' < true") === B(false))
  }
  it should "test number 3015" in {
    assert(eval("'1E4' <= true") === B(false))
  }
  it should "test number 3016" in {
    assert(eval("'1E4' > true") === B(true))
  }
  it should "test number 3017" in {
    assert(eval("'1E4' >= true") === B(true))
  }
  it should "test number 3018" in {
    assert(eval("'1E4' && true") === B(true))
  }
  it should "test number 3019" in {
    assert(eval("'1E4' || true") === S("1E4"))
  }
  it should "test number 3020" in {
    assert(eval("'1E4' + false") === S("1E4false"))
  }
  it should "test number 3021" in {
    assert(eval("'1E4' - false") === N(10000))
  }
  it should "test number 3022" in {
    assert(eval("'1E4' * false") === N(0))
  }
  it should "test number 3023" in {
    assert(eval("'1E4' / false") === N(Double.PositiveInfinity))
  }
  it should "test number 3024" in {
    assert(eval("'1E4' === false") === B(false))
  }
  it should "test number 3025" in {
    assert(eval("'1E4' !== false") === B(true))
  }
  it should "test number 3026" in {
    assert(eval("'1E4' < false") === B(false))
  }
  it should "test number 3027" in {
    assert(eval("'1E4' <= false") === B(false))
  }
  it should "test number 3028" in {
    assert(eval("'1E4' > false") === B(true))
  }
  it should "test number 3029" in {
    assert(eval("'1E4' >= false") === B(true))
  }
  it should "test number 3030" in {
    assert(eval("'1E4' && false") === B(false))
  }
  it should "test number 3031" in {
    assert(eval("'1E4' || false") === S("1E4"))
  }
  it should "test number 3032" in {
    assert(eval("'1E4' + undefined") === S("1E4undefined"))
  }
  it should "test number 3033" in {
    assert(toNumber(eval("'1E4' - undefined")).isNaN)
  }
  it should "test number 3034" in {
    assert(toNumber(eval("'1E4' * undefined")).isNaN)
  }
  it should "test number 3035" in {
    assert(toNumber(eval("'1E4' / undefined")).isNaN)
  }
  it should "test number 3036" in {
    assert(eval("'1E4' === undefined") === B(false))
  }
  it should "test number 3037" in {
    assert(eval("'1E4' !== undefined") === B(true))
  }
  it should "test number 3038" in {
    assert(eval("'1E4' < undefined") === B(false))
  }
  it should "test number 3039" in {
    assert(eval("'1E4' <= undefined") === B(false))
  }
  it should "test number 3040" in {
    assert(eval("'1E4' > undefined") === B(false))
  }
  it should "test number 3041" in {
    assert(eval("'1E4' >= undefined") === B(false))
  }
  it should "test number 3042" in {
    assert(eval("'1E4' && undefined") === Undefined)
  }
  it should "test number 3043" in {
    assert(eval("'1E4' || undefined") === S("1E4"))
  }
  it should "test number 3044" in {
    assert(eval("'1E4' + Infinity") === S("1E4Infinity"))
  }
  it should "test number 3045" in {
    assert(eval("'1E4' - Infinity") === N(Double.NegativeInfinity))
  }
  it should "test number 3046" in {
    assert(eval("'1E4' * Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 3047" in {
    assert(eval("'1E4' / Infinity") === N(0))
  }
  it should "test number 3048" in {
    assert(eval("'1E4' === Infinity") === B(false))
  }
  it should "test number 3049" in {
    assert(eval("'1E4' !== Infinity") === B(true))
  }
  it should "test number 3050" in {
    assert(eval("'1E4' < Infinity") === B(true))
  }
  it should "test number 3051" in {
    assert(eval("'1E4' <= Infinity") === B(true))
  }
  it should "test number 3052" in {
    assert(eval("'1E4' > Infinity") === B(false))
  }
  it should "test number 3053" in {
    assert(eval("'1E4' >= Infinity") === B(false))
  }
  it should "test number 3054" in {
    assert(eval("'1E4' && Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 3055" in {
    assert(eval("'1E4' || Infinity") === S("1E4"))
  }
  it should "test number 3056" in {
    assert(eval("'1E4' + '1E4'") === S("1E41E4"))
  }
  it should "test number 3057" in {
    assert(eval("'1E4' - '1E4'") === N(0))
  }
  it should "test number 3058" in {
    assert(eval("'1E4' * '1E4'") === N(100000000))
  }
  it should "test number 3059" in {
    assert(eval("'1E4' / '1E4'") === N(1))
  }
  it should "test number 3060" in {
    assert(eval("'1E4' === '1E4'") === B(true))
  }
  it should "test number 3061" in {
    assert(eval("'1E4' !== '1E4'") === B(false))
  }
  it should "test number 3062" in {
    assert(eval("'1E4' < '1E4'") === B(false))
  }
  it should "test number 3063" in {
    assert(eval("'1E4' <= '1E4'") === B(true))
  }
  it should "test number 3064" in {
    assert(eval("'1E4' > '1E4'") === B(false))
  }
  it should "test number 3065" in {
    assert(eval("'1E4' >= '1E4'") === B(true))
  }
  it should "test number 3066" in {
    assert(eval("'1E4' && '1E4'") === S("1E4"))
  }
  it should "test number 3067" in {
    assert(eval("'1E4' || '1E4'") === S("1E4"))
  }
  it should "test number 3068" in {
    assert(eval("'1E4' + console.log('foo')") === S("1E4undefined"))
  }
  it should "test number 3069" in {
    assert(toNumber(eval("'1E4' - console.log('foo')")).isNaN)
  }
  it should "test number 3070" in {
    assert(toNumber(eval("'1E4' * console.log('foo')")).isNaN)
  }
  it should "test number 3071" in {
    assert(toNumber(eval("'1E4' / console.log('foo')")).isNaN)
  }
  it should "test number 3072" in {
    assert(eval("'1E4' === console.log('foo')") === B(false))
  }
  it should "test number 3073" in {
    assert(eval("'1E4' !== console.log('foo')") === B(true))
  }
  it should "test number 3074" in {
    assert(eval("'1E4' < console.log('foo')") === B(false))
  }
  it should "test number 3075" in {
    assert(eval("'1E4' <= console.log('foo')") === B(false))
  }
  it should "test number 3076" in {
    assert(eval("'1E4' > console.log('foo')") === B(false))
  }
  it should "test number 3077" in {
    assert(eval("'1E4' >= console.log('foo')") === B(false))
  }
  it should "test number 3078" in {
    assert(eval("'1E4' && console.log('foo')") === Undefined)
  }
  it should "test number 3079" in {
    assert(eval("'1E4' || console.log('foo')") === S("1E4"))
  }
  it should "test number 3080" in {
    assert(toNumber(eval("console.log('foo') + 4")).isNaN)
  }
  it should "test number 3081" in {
    assert(toNumber(eval("console.log('foo') - 4")).isNaN)
  }
  it should "test number 3082" in {
    assert(toNumber(eval("console.log('foo') * 4")).isNaN)
  }
  it should "test number 3083" in {
    assert(toNumber(eval("console.log('foo') / 4")).isNaN)
  }
  it should "test number 3084" in {
    assert(eval("console.log('foo') === 4") === B(false))
  }
  it should "test number 3085" in {
    assert(eval("console.log('foo') !== 4") === B(true))
  }
  it should "test number 3086" in {
    assert(eval("console.log('foo') < 4") === B(false))
  }
  it should "test number 3087" in {
    assert(eval("console.log('foo') <= 4") === B(false))
  }
  it should "test number 3088" in {
    assert(eval("console.log('foo') > 4") === B(false))
  }
  it should "test number 3089" in {
    assert(eval("console.log('foo') >= 4") === B(false))
  }
  it should "test number 3090" in {
    assert(eval("console.log('foo') && 4") === Undefined)
  }
  it should "test number 3091" in {
    assert(eval("console.log('foo') || 4") === N(4))
  }
  it should "test number 3092" in {
    assert(toNumber(eval("console.log('foo') + 0")).isNaN)
  }
  it should "test number 3093" in {
    assert(toNumber(eval("console.log('foo') - 0")).isNaN)
  }
  it should "test number 3094" in {
    assert(toNumber(eval("console.log('foo') * 0")).isNaN)
  }
  it should "test number 3095" in {
    assert(toNumber(eval("console.log('foo') / 0")).isNaN)
  }
  it should "test number 3096" in {
    assert(eval("console.log('foo') === 0") === B(false))
  }
  it should "test number 3097" in {
    assert(eval("console.log('foo') !== 0") === B(true))
  }
  it should "test number 3098" in {
    assert(eval("console.log('foo') < 0") === B(false))
  }
  it should "test number 3099" in {
    assert(eval("console.log('foo') <= 0") === B(false))
  }
  it should "test number 3100" in {
    assert(eval("console.log('foo') > 0") === B(false))
  }
  it should "test number 3101" in {
    assert(eval("console.log('foo') >= 0") === B(false))
  }
  it should "test number 3102" in {
    assert(eval("console.log('foo') && 0") === Undefined)
  }
  it should "test number 3103" in {
    assert(eval("console.log('foo') || 0") === N(0))
  }
  it should "test number 3104" in {
    assert(eval("console.log('foo') + ''") === S("undefined"))
  }
  it should "test number 3105" in {
    assert(toNumber(eval("console.log('foo') - ''")).isNaN)
  }
  it should "test number 3106" in {
    assert(toNumber(eval("console.log('foo') * ''")).isNaN)
  }
  it should "test number 3107" in {
    assert(toNumber(eval("console.log('foo') / ''")).isNaN)
  }
  it should "test number 3108" in {
    assert(eval("console.log('foo') === ''") === B(false))
  }
  it should "test number 3109" in {
    assert(eval("console.log('foo') !== ''") === B(true))
  }
  it should "test number 3110" in {
    assert(eval("console.log('foo') < ''") === B(false))
  }
  it should "test number 3111" in {
    assert(eval("console.log('foo') <= ''") === B(false))
  }
  it should "test number 3112" in {
    assert(eval("console.log('foo') > ''") === B(false))
  }
  it should "test number 3113" in {
    assert(eval("console.log('foo') >= ''") === B(false))
  }
  it should "test number 3114" in {
    assert(eval("console.log('foo') && ''") === Undefined)
  }
  it should "test number 3115" in {
    assert(eval("console.log('foo') || ''") === S(""))
  }
  it should "test number 3116" in {
    assert(eval("console.log('foo') + 'stringy'") === S("undefinedstringy"))
  }
  it should "test number 3117" in {
    assert(toNumber(eval("console.log('foo') - 'stringy'")).isNaN)
  }
  it should "test number 3118" in {
    assert(toNumber(eval("console.log('foo') * 'stringy'")).isNaN)
  }
  it should "test number 3119" in {
    assert(toNumber(eval("console.log('foo') / 'stringy'")).isNaN)
  }
  it should "test number 3120" in {
    assert(eval("console.log('foo') === 'stringy'") === B(false))
  }
  it should "test number 3121" in {
    assert(eval("console.log('foo') !== 'stringy'") === B(true))
  }
  it should "test number 3122" in {
    assert(eval("console.log('foo') < 'stringy'") === B(false))
  }
  it should "test number 3123" in {
    assert(eval("console.log('foo') <= 'stringy'") === B(false))
  }
  it should "test number 3124" in {
    assert(eval("console.log('foo') > 'stringy'") === B(false))
  }
  it should "test number 3125" in {
    assert(eval("console.log('foo') >= 'stringy'") === B(false))
  }
  it should "test number 3126" in {
    assert(eval("console.log('foo') && 'stringy'") === Undefined)
  }
  it should "test number 3127" in {
    assert(eval("console.log('foo') || 'stringy'") === S("stringy"))
  }
  it should "test number 3128" in {
    assert(toNumber(eval("console.log('foo') + true")).isNaN)
  }
  it should "test number 3129" in {
    assert(toNumber(eval("console.log('foo') - true")).isNaN)
  }
  it should "test number 3130" in {
    assert(toNumber(eval("console.log('foo') * true")).isNaN)
  }
  it should "test number 3131" in {
    assert(toNumber(eval("console.log('foo') / true")).isNaN)
  }
  it should "test number 3132" in {
    assert(eval("console.log('foo') === true") === B(false))
  }
  it should "test number 3133" in {
    assert(eval("console.log('foo') !== true") === B(true))
  }
  it should "test number 3134" in {
    assert(eval("console.log('foo') < true") === B(false))
  }
  it should "test number 3135" in {
    assert(eval("console.log('foo') <= true") === B(false))
  }
  it should "test number 3136" in {
    assert(eval("console.log('foo') > true") === B(false))
  }
  it should "test number 3137" in {
    assert(eval("console.log('foo') >= true") === B(false))
  }
  it should "test number 3138" in {
    assert(eval("console.log('foo') && true") === Undefined)
  }
  it should "test number 3139" in {
    assert(eval("console.log('foo') || true") === B(true))
  }
  it should "test number 3140" in {
    assert(toNumber(eval("console.log('foo') + false")).isNaN)
  }
  it should "test number 3141" in {
    assert(toNumber(eval("console.log('foo') - false")).isNaN)
  }
  it should "test number 3142" in {
    assert(toNumber(eval("console.log('foo') * false")).isNaN)
  }
  it should "test number 3143" in {
    assert(toNumber(eval("console.log('foo') / false")).isNaN)
  }
  it should "test number 3144" in {
    assert(eval("console.log('foo') === false") === B(false))
  }
  it should "test number 3145" in {
    assert(eval("console.log('foo') !== false") === B(true))
  }
  it should "test number 3146" in {
    assert(eval("console.log('foo') < false") === B(false))
  }
  it should "test number 3147" in {
    assert(eval("console.log('foo') <= false") === B(false))
  }
  it should "test number 3148" in {
    assert(eval("console.log('foo') > false") === B(false))
  }
  it should "test number 3149" in {
    assert(eval("console.log('foo') >= false") === B(false))
  }
  it should "test number 3150" in {
    assert(eval("console.log('foo') && false") === Undefined)
  }
  it should "test number 3151" in {
    assert(eval("console.log('foo') || false") === B(false))
  }
  it should "test number 3152" in {
    assert(toNumber(eval("console.log('foo') + undefined")).isNaN)
  }
  it should "test number 3153" in {
    assert(toNumber(eval("console.log('foo') - undefined")).isNaN)
  }
  it should "test number 3154" in {
    assert(toNumber(eval("console.log('foo') * undefined")).isNaN)
  }
  it should "test number 3155" in {
    assert(toNumber(eval("console.log('foo') / undefined")).isNaN)
  }
  it should "test number 3156" in {
    assert(eval("console.log('foo') === undefined") === B(true))
  }
  it should "test number 3157" in {
    assert(eval("console.log('foo') !== undefined") === B(false))
  }
  it should "test number 3158" in {
    assert(eval("console.log('foo') < undefined") === B(false))
  }
  it should "test number 3159" in {
    assert(eval("console.log('foo') <= undefined") === B(false))
  }
  it should "test number 3160" in {
    assert(eval("console.log('foo') > undefined") === B(false))
  }
  it should "test number 3161" in {
    assert(eval("console.log('foo') >= undefined") === B(false))
  }
  it should "test number 3162" in {
    assert(eval("console.log('foo') && undefined") === Undefined)
  }
  it should "test number 3163" in {
    assert(eval("console.log('foo') || undefined") === Undefined)
  }
  it should "test number 3164" in {
    assert(toNumber(eval("console.log('foo') + Infinity")).isNaN)
  }
  it should "test number 3165" in {
    assert(toNumber(eval("console.log('foo') - Infinity")).isNaN)
  }
  it should "test number 3166" in {
    assert(toNumber(eval("console.log('foo') * Infinity")).isNaN)
  }
  it should "test number 3167" in {
    assert(toNumber(eval("console.log('foo') / Infinity")).isNaN)
  }
  it should "test number 3168" in {
    assert(eval("console.log('foo') === Infinity") === B(false))
  }
  it should "test number 3169" in {
    assert(eval("console.log('foo') !== Infinity") === B(true))
  }
  it should "test number 3170" in {
    assert(eval("console.log('foo') < Infinity") === B(false))
  }
  it should "test number 3171" in {
    assert(eval("console.log('foo') <= Infinity") === B(false))
  }
  it should "test number 3172" in {
    assert(eval("console.log('foo') > Infinity") === B(false))
  }
  it should "test number 3173" in {
    assert(eval("console.log('foo') >= Infinity") === B(false))
  }
  it should "test number 3174" in {
    assert(eval("console.log('foo') && Infinity") === Undefined)
  }
  it should "test number 3175" in {
    assert(eval("console.log('foo') || Infinity") === N(Double.PositiveInfinity))
  }
  it should "test number 3176" in {
    assert(eval("console.log('foo') + '1E4'") === S("undefined1E4"))
  }
  it should "test number 3177" in {
    assert(toNumber(eval("console.log('foo') - '1E4'")).isNaN)
  }
  it should "test number 3178" in {
    assert(toNumber(eval("console.log('foo') * '1E4'")).isNaN)
  }
  it should "test number 3179" in {
    assert(toNumber(eval("console.log('foo') / '1E4'")).isNaN)
  }
  it should "test number 3180" in {
    assert(eval("console.log('foo') === '1E4'") === B(false))
  }
  it should "test number 3181" in {
    assert(eval("console.log('foo') !== '1E4'") === B(true))
  }
  it should "test number 3182" in {
    assert(eval("console.log('foo') < '1E4'") === B(false))
  }
  it should "test number 3183" in {
    assert(eval("console.log('foo') <= '1E4'") === B(false))
  }
  it should "test number 3184" in {
    assert(eval("console.log('foo') > '1E4'") === B(false))
  }
  it should "test number 3185" in {
    assert(eval("console.log('foo') >= '1E4'") === B(false))
  }
  it should "test number 3186" in {
    assert(eval("console.log('foo') && '1E4'") === Undefined)
  }
  it should "test number 3187" in {
    assert(eval("console.log('foo') || '1E4'") === S("1E4"))
  }
  it should "test number 3188" in {
    assert(toNumber(eval("console.log('foo') + console.log('foo')")).isNaN)
  }
  it should "test number 3189" in {
    assert(toNumber(eval("console.log('foo') - console.log('foo')")).isNaN)
  }
  it should "test number 3190" in {
    assert(toNumber(eval("console.log('foo') * console.log('foo')")).isNaN)
  }
  it should "test number 3191" in {
    assert(toNumber(eval("console.log('foo') / console.log('foo')")).isNaN)
  }
  it should "test number 3192" in {
    assert(eval("console.log('foo') === console.log('foo')") === B(true))
  }
  it should "test number 3193" in {
    assert(eval("console.log('foo') !== console.log('foo')") === B(false))
  }
  it should "test number 3194" in {
    assert(eval("console.log('foo') < console.log('foo')") === B(false))
  }
  it should "test number 3195" in {
    assert(eval("console.log('foo') <= console.log('foo')") === B(false))
  }
  it should "test number 3196" in {
    assert(eval("console.log('foo') > console.log('foo')") === B(false))
  }
  it should "test number 3197" in {
    assert(eval("console.log('foo') >= console.log('foo')") === B(false))
  }
  it should "test number 3198" in {
    assert(eval("console.log('foo') && console.log('foo')") === Undefined)
  }
  it should "test number 3199" in {
    assert(eval("console.log('foo') || console.log('foo')") === Undefined)
  }
