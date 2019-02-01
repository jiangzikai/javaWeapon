package com.weapon.baseInfo;

/**
 * @program: weapon
 * @Date: 2019/2/1 0001 上午 10:09
 * @Author: jiangzikai
 * @Description:字符串
 */
public class StringType_5 {
    //每个用双引号括起来的字符串都是String类的一个实例
    String e="";//ann empty string
    String greeting = "Hello";


    //String的常用方法
    public static void main(String[] args) {
        //1、String substring(int beginIndex, int endIndex)截取字符串方法，从较大的字符串提取一个子串。两个参数注意是左闭右开。
        //返回一个新字符串。这个字符串包含原始字符串中从beginIndex到串尾或endIndex-1的所有代码单元
        String insureStartDate = "2019-02-01 10:27:50";
        String insureFrontStartDate = insureStartDate.substring(0,10);//左闭右开，如果想截取到日，那么参数是10才能截取到
        System.out.println("截取后的日期是："+insureFrontStartDate);//2019-02-01

        //2、equals()检测两个字符串是否相等
        //一定不能使用==运算符检测两个字符串是否相等。==运算符比较的是他们在内存中的存放地址，所以，除非是同一个new出来的对象，他们的比较后的结果为true，否则比较后结果为false。
        String a1 = "Hello";
        String a2 = "Hello";
        if(a1.equals(a2)){
            System.out.println("a1等于a2!");
        }
        //3、equalsIgnoreCase()检测两个字符串是否相等，而不区分大小写
        if(a1.equalsIgnoreCase(a2)){
            System.out.println("a1等于a2!");
        }
        //4、int indexOf(String str)
        //返回与字符串str匹配的第一个子串的开始 位置。这个位置从索引0开始计算。如果在原始串中不存在str,返回-1
        String helloStr = "商君啊，秦国可否一统天下";
        //求秦国的下标
        int qinguoIndex = helloStr.indexOf("秦国");//秦国子串的开始位置
        System.out.println("秦国的下标:"+qinguoIndex);

        //可以通过int indexOf(String str)   的是是否为-1 来判断子串在原始串中是否存在
        String sonStr = "商君";//商君、秦惠文王
        if(-1!=helloStr.indexOf(sonStr)){
            System.out.println("子串在原始串中存在");
        }else{
            System.out.println("子串在原始串中不存在");
        }

        //5、字符串的长度
        int strLength = helloStr.length();
        System.out.println("字符串长度为："+strLength);

        //6、boolean startsWith(String prefix)
        //如果字符串以preffix字符串开始，返回true
        if(helloStr.startsWith("商君")){
            System.out.println("字符串是以商君开始的");
        }

        //7、String toLowerCase()
        //返回一个新字符串。这个字符串将原始字符串中的所有大写字母改成了小写字母。
        //String toUpperCase()
        //返回一个新字符串。这个字符串将原始字符串中的所有小写字母改成了大写字母。
        String productName = "fangDiDai";
        String lowerProductName = productName.toLowerCase();
        String upperProductName = productName.toUpperCase();
        System.out.println(productName+"全转为小写为："+lowerProductName);
        System.out.println(productName+"全转为大写为："+upperProductName);

        //8、String trim()
        //返回一个新字符串。这个字符串删除了原始字符串头部和尾部的空格
        String sysFlag = " min sheng haha   ";
        System.out.println("|"+sysFlag+"|去掉收尾空格为：|"+sysFlag.trim()+"|");
        //tips:trim只是删除了字符串头部和尾部的空格，字符串中间的空格并没有删除！

    }


}
