package com.javakk.spock.TestDemo;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @Created by sunmeng9
 * @Date 2022/2/27 11:59 PM
 * @Description TODO
 */
@RunWith(JUnitParamsRunner.class)
public class TestDemoIfTest {

 @Test
 @Parameters(method = "getMoney")
 public void getBirAgeSex(Double income, Double result) {
  TestDemoIf testDemoIf = new TestDemoIf();
  Double ret = testDemoIf.calc(income);
  Assert.assertTrue(result.equals( ret));
 }

 public Object[] getMoney() {
  return new Object[]{
          new Object[]{-1.0,0.0},
          new Object[]{0.0,0.0},
          new Object[]{2999.0,89.97},
          new Object[]{3000.0,90.0},
          new Object[]{3001.0,90.0},
          new Object[]{11999.0,989.9},
          new Object[]{12000.0,990.0},
          new Object[]{12001.0,990.2}
  };
 }
}
