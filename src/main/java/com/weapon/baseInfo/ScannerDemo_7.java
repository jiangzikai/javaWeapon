package com.weapon.baseInfo;

import java.util.Scanner;

/**
 * @program: weapon
 * @Date: 2019/2/11 0011 上午 11:11
 * @Author: jiangzikai
 * @Description:
 */
public class ScannerDemo_7 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //nextLine()方法将输入一行

        System.out.println("what is your name?");
        String name = in.nextLine();
        System.out.println("name is ;"+name);
    }
}
