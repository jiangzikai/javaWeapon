package com.weapon.baseInfo;

import java.math.BigDecimal;

/**
 * @program: weapon
 * @Date: 2019/2/12 0012 上午 11:00
 * @Author: jiangzikai
 * @Description:
 * 大数值
 * 商业金融计算中，一般采用java.math.BigDecimal类来进行精确计算。
 */
public class BigDecimalDemo_12 {
    public static void main(String[] args){
        System.out.println(0.2 + 0.1);//结果0.30000000000000004
        System.out.println(0.3 - 0.1);//结果0.19999999999999998
        System.out.println(0.2 * 0.1);//结果0.020000000000000004
        System.out.println(0.3 / 0.1);//结果2.9999999999999996
        //原因在于我们的计算机是二进制的。浮点数没有办法使用二进制进行精确表示

        //BigDecimal构造方法
        //1.public BigDecimal(double val)    将double表示形式转换为BigDecimal !!不建议使用!!!
        //2.public BigDecimal(int val)　　将int表示形式转换成BigDecimal
        //3.public BigDecimal(String val)　　将String表示形式转换成BigDecimal
        //为什么不建议采用第一种构造方法呢？来看例子
        BigDecimal bigDecimal = new BigDecimal(2);
        BigDecimal bDouble = new BigDecimal(2.3);
        BigDecimal bString = new BigDecimal("2.3");
        System.out.println("bigDecimal=" + bigDecimal);//bigDecimal=2
        System.out.println("bDouble=" + bDouble);//bDouble=2.29999999999999982236431605997495353221893310546875
        System.out.println("bString=" + bString);//bString=2.3
        //1、参数类型为double的构造方法的结果有一定的不可预知性。
        // 有人可能认为在Java中写入newBigDecimal(0.1)所创建的BigDecimal正好等于 0.1（非标度值 1，其标度为 1），
        // 但是它实际上等于0.1000000000000000055511151231257827021181583404541015625。
        // 这是因为0.1无法准确地表示为 double（或者说对于该情况，不能表示为任何有限长度的二进制小数）。
        // 这样，传入到构造方法的值不会正好等于 0.1（虽然表面上等于该值）。
        //2、另一方面，String 构造方法是完全可预知的：写入 newBigDecimal("0.1") 将创建一个 BigDecimal，
        // 它正好等于预期的 0.1。因此，比较而言，通常建议优先使用String构造方法!!!

        //
        //当double必须用作BigDecimal的源时，请使用Double.toString(double)转成String，然后使用String构造方法，或使用BigDecimal的静态方法valueOf，如下
        BigDecimal bDouble1 = BigDecimal.valueOf(2.3);
        BigDecimal bDouble2 = new BigDecimal(Double.toString(2.3));
        System.out.println("bDouble1=" + bDouble1);
        System.out.println("bDouble2=" + bDouble2);
    }
}
