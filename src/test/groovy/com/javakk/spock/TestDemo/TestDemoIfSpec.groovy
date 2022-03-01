package com.javakk.spock.TestDemo

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @Created by sunmeng9
 * @Date 2022/2/27 11:55 PM
 * @Description TODO
 */
class TestDemoIfSpec extends Specification {

    @Unroll
    def "个税计算,收入:#income, 个税:#result"() {
        setup:
        TestDemoIf testDemoIf  = new TestDemoIf()

        expect: "when + then 的组合"
        testDemoIf.calc(income) == result

        where: "表格方式测试不同的分支逻辑"
        income || result
        -1     || 0
        0      || 0
        2999   || 89.97
        3000   || 90.0
        3001   || 90.1
        11999  || 989.9
        12000  || 990.0
        12001  || 990.2
        24999  || 3589.8
        25000  || 3590.0
        25001  || 3590.25
        34999  || 6089.75
        35000  || 6090.0
        35001  || 6090.3
        54999  || 12089
        55000  || 12090
        55001  || 12090.35
        79999  || 20839.65
        80000  || 20840.0
        80001  || 20840.45
    }


    @Unroll
    def "测试加法运算: #a + #b = #c"(){
        setup:
        TestDemoIf testDemoIf  = new TestDemoIf()

        expect:"测试加法运算"
        c == testDemoIf.add(a,b)

        where:
        a | b || c
        1 | 2 || 3
        2 | 2 || 4
        2 | 2 || 5
    }


    @Unroll
    def "测试减法运算: #a - #b = #c"(){
        setup:
        TestDemoIf testDemoIf  = new TestDemoIf()

        expect:"测试加法运算"
        c == testDemoIf.subtraction(a,b)

        where:
        a  | b || c
        11 | 2 || 9
        12 | 2 || 10
        12 | 2 || 5
    }
}
