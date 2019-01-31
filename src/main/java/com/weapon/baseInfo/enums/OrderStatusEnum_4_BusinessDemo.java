package com.weapon.baseInfo.enums;

import com.weapon.Utils.EnumUtil;

/**
 * @program: weapon
 * @Date: 2019/1/31 0031 下午 4:23
 * @Author: jiangzikai
 * @Description:
 */
public class OrderStatusEnum_4_BusinessDemo {
    public static void main (String args[]){
        //业务demo
        //判断不同的支付状态走不同的逻辑哦

        //1、从数据库查询，获取当前订单的支付状态
        int currentOrderStatus = 3;//订单表状态是3
        if(currentOrderStatus==OrderStatusEnum_4.ORDERSTATUS_INIT.getCode()){
            System.out.println("此时订单状态是初始，走初始逻辑");
        }else if(currentOrderStatus==OrderStatusEnum_4.ORDERSTATUS_SUCCESS.getCode()){
            System.out.println("此时订单状态是支付成功，走成功逻辑");
        }else if(currentOrderStatus==OrderStatusEnum_4.ORDERSTATUS_WAIT.getCode()){
            System.out.println("此时订单状态是待支付，走待支付逻辑");
        }else if(currentOrderStatus==OrderStatusEnum_4.ORDERSTATUS_SIGNWAIT.getCode()){
            System.out.println("此时订单状态是已签名待支付，走已签名待支付逻辑");
        }

        //根据code，获取枚举对象
        //已知订单状态是3,获取枚举对象并打印出3对应的是什么订单状态
        OrderStatusEnum_4 orderStatusEnum_4 = EnumUtil.getByCode(3,OrderStatusEnum_4.class);
        String message = orderStatusEnum_4.getMessage();
        System.out.println("订单状态3，对应的订单状态是："+message);

    }
}
