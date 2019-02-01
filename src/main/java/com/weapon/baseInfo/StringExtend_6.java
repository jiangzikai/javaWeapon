package com.weapon.baseInfo;

/**
 * @program: weapon
 * @Date: 2019/2/1 0001 下午 5:06
 * @Author: jiangzikai
 * @Description:字符串扩展StringBuilder和StringBuffer
 */
public class StringExtend_6 {
    public static void main (String args[]){
        StringBuilder sb = new StringBuilder();
        sb.append("天青色等烟雨");
        sb.append(",");
        sb.append("而我在等你");
        System.out.println(sb.toString());

        StringBuffer sbffer = new StringBuffer();//线程安全
        sbffer.append("啦啦啦，");
        sbffer.append("啦啦啦，");
        sbffer.append("我是卖报的小行家");
        System.out.println(sbffer.toString());

    }

}
