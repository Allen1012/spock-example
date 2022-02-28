package com.javakk.spock.TestDemo

import spock.lang.Specification

/**
 * @Created by sunmeng9
 * @Date 2022/2/28 11:47 AM
 * @Description TODO
 */
class TestDemoFuncSpec extends Specification{

    // 每个测试方法开始前都会执行一遍,类似JUnit @Before
    def setup() {
        println("setup")
    }
    // 每个测试方法后都会执行一遍,类似JUnit @After
    def cleanup() {
        println("cleanup")
    }

    // 在第一个测试方法开始前执行一遍,类似JUnit @BeforeClass
    def setupSpec() {
        println("setupSpec")
    }

    // 最后一个测试方法后执行,类似JUnit @AfterClass
    def cleanupSpec() {
        println("cleanupSpec")
    }

    def "test 1"(){

        println("do test 1")

        setup:
        def a = 1
        def b = 2

        expect:
        Math.max(a, b) == 2
    }

    def "test 2"(){

        println("do test 2")

        setup:
        def a = 1
        def b = 2

        expect:
        Math.max(a, b) == 2
    }
}
