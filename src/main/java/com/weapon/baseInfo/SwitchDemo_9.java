package com.weapon.baseInfo;

/**
 * @program: weapon
 * @Date: 2019/2/11 0011 下午 3:48
 * @Author: jiangzikai
 * @Description: 没有case中的break语句，就会继续执行下一个分支，造成穿透现象，所以不建议使用switch语句
 */
public class SwitchDemo_9 {
    public static void main(String[] args) {
        //随机生成1-3整数，判断星期数
        int day =(int)(Math.random()*(3-1+1))+1;//Math.random()生成的是[0,1)
        //判断
        String dayStr = "";
        switch(day){
            case 1:
                dayStr = "星期一";
                break;
            case 2:
                dayStr = "星期二";
                break;
            default:
                dayStr = "星期三";
        }
        System. out.println(day+ "-->"+dayStr);
    }
}
