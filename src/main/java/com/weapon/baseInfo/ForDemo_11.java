package com.weapon.baseInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: weapon
 * @Date: 2019/2/11 0011 下午 5:48
 * @Author: jiangzikai
 * @Description:循环示例
 */
public class ForDemo_11 {
    //在循环中，条件不要使用浮点数比较，值不精确，循环可能永远不会结束
    public static void main(String args[]){
        //普通for循环
        for(int i=0;i<=10;i++){
            System.out.println("当前数字是"+i);
        }
        //foreach 增强for循环  Java SE 5.0 新增加的
//        foreach语句格式：
//
//        for(元素类型type  元素变量value : 遍历对象obj) {
//　　　　//do something
//        }
        //示例
        int arr[] = {2,3,5,4};
        for(int x:arr){
            System.out.println("循环x的值是："+x);
        }
        System.out.println("");
        //数组冒泡排序
        Arrays.sort(arr);
        for(int x:arr){
            System.out.println("排序后循环x的值是："+x);
        }

        //创建list并且添加元素
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("5");

        //foreach循环输出集合元素
        System.out.println("-----foreach输出集合元素");
        for(String y:list) {
            System.out.println(y+ " ");
        }

    }



}
