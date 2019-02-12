package com.weapon.baseInfo;

import java.util.Scanner;

/**
 * @program: weapon
 * @Date: 2019/2/11 0011 下午 3:09
 * @Author: jiangzikai
 * @Description:
 */
public class ControllerFllow_8 {
    //if、if/else省略
    public static void main(String args[]){
        //while循环
        //攒够10000元，买kindel电子阅读器。每执行一次每月加1000元
        int mubiaoMoney = 10000;//目标金额1万
        int xianzaiMoney = 0;//现在的金额是0
        int months = 0;
        while(xianzaiMoney<mubiaoMoney){
            xianzaiMoney+=1000;//每次加1000元
            months++;
        }
        System.out.println("经过"+months+"个月，攒够了1万元，可以买我想要的kindel喽，好开心");

        //do/while,这种先执行一次语句，然后判断条件。do…while 循环至少会执行一次。
        //对于 while 语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次。

        Scanner in=new Scanner(System.in);
        System.out.println("请连续录入学生姓名, 直到输入q退出系统");
        String name="";
        do
        {
            name=in.nextLine();
        }
        while (!name.equals("q"));

//        ---------------------
//        作者：verejava
//        来源：CSDN
//        原文：https://blog.csdn.net/verejava/article/details/80491684
//        版权声明：本文为博主原创文章，转载请附上博文链接！

    }

}
