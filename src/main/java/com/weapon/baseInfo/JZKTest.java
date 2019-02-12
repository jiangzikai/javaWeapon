package com.weapon.baseInfo;

/**
 * @program: weapon
 * @Date: 2019/2/12 0012 上午 9:50
 * @Author: jiangzikai
 * @Description: 测试验证使用
 */
public class JZKTest {
    public static void main(String args[]){
        //∑100计算
        sumR(100);
        //10!阶乘
        jiecheng(10);
    }
    //∑100
    //100+∑99
    //.....
    //3+∑2
    //2+∑1
    public static int sumR(int num){
        //头
        if(num<2){
            return 1;
        }
        return num+sumR(num-1);//体
    }
    //10!
    //10*9!
    //.....
    //3*2!
    //2*1!
    public static int jiecheng(int num1){
        if(num1<2){
            return 1;
        }
        return num1*jiecheng(num1-1);
    }
}
