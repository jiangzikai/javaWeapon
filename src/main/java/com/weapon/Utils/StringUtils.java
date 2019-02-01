package com.weapon.Utils;

/**
 * @program: weapon
 * @Date: 2019/2/1 0001 下午 3:22
 * @Author: jiangzikai
 * @Description:通用工具类
 */
public class StringUtils {

    private StringUtils(){}

    //判断字符串是否为空
    public static boolean isBlank(String str){
        return null == str || "".equals(str.trim());
    }

}
