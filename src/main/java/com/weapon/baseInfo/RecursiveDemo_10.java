package com.weapon.baseInfo;

/**
 * @program: weapon
 * @Date: 2019/2/11 0011 下午 3:52
 * @Author: jiangzikai
 * @Description:递归
 *
 * 递归，方法自己调用自己
 * 1、递归头：何时结束递归
 * 2、递归体：逻辑
 * 缺点是：耗内存。一直最后一个计算完毕，才会回溯释放内存空间。
 * 递归
 * ∑100=1+2+3...+100
 * ∑100
 * =100+∑99
 * =99+∑98
 * ....
 * =2+∑1
 * =1
 * 使用递归 求阶乘
 * 10!=10 *9!
 * =9*8!
 * ...
 * =2*1!
 * =1*0!
 * =1
 */
public class RecursiveDemo_10 {
    public static void main(String[] args){
        System. out.println( sumR(100));
        System. out.println( jieCheng(10));
    }
    //∑100
    public static int sumR(int num){
        if(num<2){
            return 1; //头
        }
        return num+ sumR(num-1); //体
        //100 +sumR(99)
        // 99+sumR(98)
    }
    //10!
    public static int jieCheng(int num){
        if(num<2){
            return 1; //头
        }
        return num* jieCheng(num-1);//体
    }
}
