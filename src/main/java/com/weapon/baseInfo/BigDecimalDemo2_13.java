package com.weapon.baseInfo;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @program: weapon
 * @Date: 2019/2/12 0012 上午 11:14
 * @Author: jiangzikai
 * @Description:
 */
public class BigDecimalDemo2_13 {
    //尽量使用参数类型为String的构造函数。

    //加减乘除
    public static void main(String[] args){
        BigDecimal a = new BigDecimal("4.5");
        BigDecimal b = new BigDecimal("1.5");

        System.out.println("a + b =" + a.add(b));//a + b =6.0
        System.out.println("a - b =" + a.subtract(b));//a - b =3.0
        System.out.println("a * b =" + a.multiply(b));//a * b =6.75
        System.out.println("a / b =" + a.divide(b));//a / b =3

        //compareTo比较大小
        System.out.println("比较大小："+a.compareTo(b));//相等为0，a>b正数，a<b负数

        //BigDecimal除法可能出现不能整除的情况，比如 4.5/1.3，这时会报错java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
        BigDecimal a1 = new BigDecimal("4.5");
        BigDecimal b1 = new BigDecimal("1.3");
//        BigDecimal result = a1.divide(b1);

        //第一参数表示除数， 第二个参数表示小数点后保留位数，
        //第三个参数表示舍入模式，只有在作除法运算或四舍五入时才用到舍入模式。
        BigDecimal result = a1.divide(b1,2,RoundingMode.HALF_UP);//RoundingMode.HALF_UP四舍五入
        System.out.println("a/b啊="+result);

        //需要对BigDecimal进行截断和四舍五入可用setScale方法
        BigDecimal ab = new BigDecimal("4.5635");
        ab = ab.setScale(4, RoundingMode.HALF_UP);    //保留4位小数，且四舍五入
        System.out.println(ab);

        //policyLiability.setRate(new BigDecimal(Double.valueOf(policyLiability.getInsuredPremium()*1000/policyLiability.getInsuredAmount())).setScale(4, RoundingMode.HALF_UP).toString());


        //附录舍入模式 RoundingMode.HALF_UP
//        ROUND_CEILING    //向正无穷方向舍入
//        ROUND_DOWN    //向零方向舍入
//        ROUND_FLOOR    //向负无穷方向舍入
//        ROUND_HALF_DOWN    //向（距离）最近的一边舍入，除非两边（的距离）是相等,如果是这样，向下舍入, 例如1.55 保留一位小数结果为1.5
//        ROUND_HALF_EVEN    //向（距离）最近的一边舍入，除非两边（的距离）是相等,如果是这样，如果保留位数是奇数，使用ROUND_HALF_UP，如果是偶数，使用ROUND_HALF_DOWN
//        ROUND_HALF_UP    //向（距离）最近的一边舍入，除非两边（的距离）是相等,如果是这样，向上舍入, 1.55保留一位小数结果为1.6
//        ROUND_UNNECESSARY    //计算结果是精确的，不需要舍入模式
//        ROUND_UP    //向远离0的方向舍入

    }
}
