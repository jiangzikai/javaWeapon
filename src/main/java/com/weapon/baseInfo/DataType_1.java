package com.weapon.baseInfo;

/**
 * @program: weapon
 * @Date: 2019/1/23 0023 上午 9:56
 * @Author: jiangzikai
 * @Description:数据类型
 */
public class DataType_1 {
    /**
     *      数据类型
     *      4类八种
     *      基本数据类型--(数值型)--整数类型byte、short、int、long
     *      基本数据类型--(数值型)--浮点类型float、double
     *      基本数据类型--字符型char
     *      基本数据类型--布尔型boolean
     *
     *      引用数据类型--类class
     *      引用数据类型--接口interface
     *      引用数据类型--数组[]
     *
     *      类型 |  存储需求 |  取值范围
     *      byte     1字节      -128到127
     *      short    2字节      正负3万
     *      int      4字节      正负21亿
     *      long     8字节      非常大
     *      -------------------------------
     *      float    4字节
     *      double   8字节
     *
     *      (取值范围的理解
     *      层次一：简单理解记忆。一字节占8位,2的8次方，一共256个数，正负各一半128，算上0，范围就是-128-127)
     *      层次二：一字节占8位，8个二进制数，最高位是符号位，0是正，1是负数，最大的值是0111_1111计算为十进制为127
     *      最小的值是1000_0000计算为十进制为-128
     *      层次三：原码、反码、补码，暂时看不明白，欢迎补充
     *
     *      tips:
     *      float、double浮点数不适用于禁止出现舍入误差的金融计算中。应该使用java有一个能够表示任意精度的算术包BigDecimal;
     *      float的精度很难满足需求，绝大多数程序都使用double类型;
     *      通常情况下,int类型最常用。byte和short类型主要用于特定的应用场合，如底层的文件处理等等;
     *
     *      char类型用于表示单个字符,单个字符占两个字节16位65535个字符，可用Unicode(十六进制值)表示。强烈不建议在程序中使用char类型
     *      字符集的小故事https://www.cnblogs.com/lslk89/p/6898526.html
     *
     *      转义字符 :用于表达键盘不方便输入的值 \+一个字母
     *      \n:换行
     *      \t:tab
     *
     *      boolean类型，有两个值true和false,用来判定逻辑条件。整型值和布尔值之间不能进行相互转换
     *
     *      进制
     *      二进制，前缀0b
     *      八进制，前缀0
     *      十六进制，前缀0x
     *
     *
     *      变量命名规则。由字母数字下划线组成，不能数字开头，$特殊不建议使用。驼峰规则。
     *      类，首字母大写+驼峰。变量方法，首字母小写+驼峰。常量，全大写_分割
     *
     *      final修饰常量，只能被赋值一次，赋值之后不能再更改了。常量名全大写
     *      static final 类常量
     */
    public static void main(String[] args) {
//        int x = 0;
//        if(x){//整型值和布尔值之间不能进行相互转换
//            System.out.println("测试");
//        }

        //不要使用未被初始化的变量
        //在java中，变量的声明尽可能地靠近变量第一次使用的地方
//        int vacationDays;
//        System.out.println(vacationDays);//Variable 'vacationDays' might not have been initialized
    }
}
