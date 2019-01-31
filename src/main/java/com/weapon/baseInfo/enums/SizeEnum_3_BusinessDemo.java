package com.weapon.baseInfo.enums;

import com.weapon.baseInfo.enums.SizeEnum_3;

/**
 * @program: weapon
 * @Date: 2019/1/31 0031 下午 3:07
 * @Author: jiangzikai
 * @Description:
 */
public class SizeEnum_3_BusinessDemo {
    public static void main (String args[]){
        //业务demo
        //SMALL,MEDIUM,LARGE
        SizeEnum_3 size = SizeEnum_3.MEDIUM;
        switch (size){
            case SMALL:
                System.out.println("小披萨10元");
                break;
            case MEDIUM:
                System.out.println("中披萨20元");
                break;
            case LARGE:
                System.out.println("大披萨30元");
                break;
            default:
                break;
        }

    }
}
