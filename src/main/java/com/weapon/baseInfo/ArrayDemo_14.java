package com.weapon.baseInfo;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.Arrays;

/**
 * @program: weapon
 * @Date: 2019/2/12 0012 下午 2:07
 * @Author: jiangzikai
 * @Description:数组
 */
public class ArrayDemo_14 {
    //相同类型数据的有序集合
    //一旦创建了数组，就不能再改变它的大小。如果需要扩展数组的大小，请使用另一种数据结构--数组列表(array list)
    public static void main(String args[]){
        
        //一维数组的声明、创建
        //类型【】数组名|引用名； String【】 arr
        String[] arr;//声明一个数组的时候，并没有数组被真正创建。
        int[] arr1 = new int[30];//这条语句创建了一个可以存储30个String字符的数组
        System.out.println("默认值："+Arrays.toString(arr1));//默认值
        for(int i=0;i<30;i++){
            arr1[i]=i;
        }
        System.out.println("赋值："+Arrays.toString(arr1));//赋值

        String[] arrStr = new String[3];
        System.out.println("默认值："+Arrays.toString(arrStr));//默认值null,null,null
        arrStr[0] = "天天";
        arrStr[1] = "向向";
        arrStr[2] = "上上";
        System.out.println(Arrays.toString(arrStr));

        //数组的元素个数
        System.out.println("数组的元素个数："+arrStr.length);
        
        //数组初始化
        //1、静态初始化:声明并指定元素的值，不指定长度
        //Fruit[] farr = {new Fruit(),new Fruit()};
        int[] smallPrimes = {1,2,3,4,5,6};
        //2、动态初始化:声明与赋值分开，在默认基础上，依次赋值
        long[] arrlong = null;
        arrlong = new long[2];
        arrlong[0] = 1;
        arrlong[1] = 2;
        //3、默认初始化:声明同时并开辟空间 ，与对象的默认机制相同
        String[] sss = new String[5];

        //数组拷贝 Arrays类的copyTo方法
        int[] numsArr = {1,2,3,4,5};
        int[] copiedLuckyNumbers = Arrays.copyOf(numsArr,numsArr.length);
        //第二个参数是新数组的长度，这个方法通常用来增加数组的大小。
        //如果数组是数值型，那么多余的元素将被赋值为0
        int[] copiedLuckyNUmbersEx = Arrays.copyOf(numsArr,numsArr.length+2);
        System.out.println(Arrays.toString(copiedLuckyNUmbersEx));//长度加了2个，多余元素补0
        //如果新数组小于原数组，拷贝最前面的数据，后面的截掉
        int[] copiedLuckyNUmbersLow = Arrays.copyOf(numsArr,numsArr.length-2);
        System.out.println(Arrays.toString(copiedLuckyNUmbersLow));//长度减了2个


        //数组排序
        //数值型数组进行排序，使用Arrays类中的sort方法
        int[] beSoredArr = new int[4];
        beSoredArr[0] = 1;
        beSoredArr[1] = 5;
        beSoredArr[2] = 3;
        beSoredArr[3] = 2;
        System.out.println("排序前"+Arrays.toString(beSoredArr));
        Arrays.sort(beSoredArr);
        System.out.println("排序后"+Arrays.toString(beSoredArr));

        //截止目前，使用了Arrays中的3个方法
        //Arrays.toString();//打印
        //Arrays.copyOf(numsArr,numsArr.length);
        //Arrays.sort(beSoredArr);
        //其他的Arrays方法请自行寻找

    }
    
}
