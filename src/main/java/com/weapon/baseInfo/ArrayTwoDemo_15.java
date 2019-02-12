package com.weapon.baseInfo;

import java.util.Arrays;

/**
 * @program: weapon
 * @Date: 2019/2/12 0012 下午 4:32
 * @Author: jiangzikai
 * @Description:二维数组
 */
public class ArrayTwoDemo_15 {

    public static void main(String args[]){
        //二维数组
        //java实际上没有多维数组，只有一维数组。多维数组被解释为，数组的数组

        //二维数组的声明
        //类型[][] 数组名;
        int[][] arr;
        //二维数组的创建
        int[][] arr1 = new int[2][3];//默认初始化，值都是默认值
        System.out.println(Arrays.toString(arr1[0]));
        System.out.println(Arrays.toString(arr1[1]));

        //静态初始化：
        int[][] arr3 = new int[][]{{1},{2,3},{4,5,6}};
        int[][] arr4 = {{1},{2,3},{4,5,6}};
    }
}
