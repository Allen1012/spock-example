package com.javakk.spock.TestDemo;

import java.math.BigDecimal;

/**
 * @Created by sunmeng9
 * @Date 2022/2/27 11:49 PM
 * @Description if/else多分支复杂场景测试
 */
public class TestDemoIf {

   /**
    * 《编程珠玑》中一个计算税金的例子
    *
    * @param income
    * @return double
    * @author sunmeng9
    * @date 2022/2/27 11:51 PM
    */
    public double calc(double income) {
        BigDecimal tax;
        BigDecimal salary = BigDecimal.valueOf(income);
        if (income <= 0) {
            return 0;
        }
        if (income > 0 && income <= 3000) {
            BigDecimal taxLevel = BigDecimal.valueOf(0.03);
            tax = salary.multiply(taxLevel);
        } else if (income > 3000 && income <= 12000) {
            BigDecimal taxLevel = BigDecimal.valueOf(0.1);
            BigDecimal base = BigDecimal.valueOf(210);
            tax = salary.multiply(taxLevel).subtract(base);
        } else if (income > 12000 && income <= 25000) {
            BigDecimal taxLevel = BigDecimal.valueOf(0.2);
            BigDecimal base = BigDecimal.valueOf(1410);
            tax = salary.multiply(taxLevel).subtract(base);
        } else if (income > 25000 && income <= 35000) {
            BigDecimal taxLevel = BigDecimal.valueOf(0.25);
            BigDecimal base = BigDecimal.valueOf(2660);
            tax = salary.multiply(taxLevel).subtract(base);
        } else if (income > 35000 && income <= 55000) {
            BigDecimal taxLevel = BigDecimal.valueOf(0.3);
            BigDecimal base = BigDecimal.valueOf(4410);
            tax = salary.multiply(taxLevel).subtract(base);
        } else if (income > 55000 && income <= 80000) {
            BigDecimal taxLevel = BigDecimal.valueOf(0.35);
            BigDecimal base = BigDecimal.valueOf(7160);
            tax = salary.multiply(taxLevel).subtract(base);
        } else {
            BigDecimal taxLevel = BigDecimal.valueOf(0.45);
            BigDecimal base = BigDecimal.valueOf(15160);
            tax = salary.multiply(taxLevel).subtract(base);
        }
        return tax.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

}
