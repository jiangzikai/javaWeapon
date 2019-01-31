package com.weapon.baseInfo.enums;

/**
 * @program: weapon
 * @Date: 2019/1/31 0031 下午 4:01
 * @Author: jiangzikai
 * @Description:
 */
public interface CodeEnum {
    //所有的Enum都实现这个接口，接口是一个规范。用来规范Enum枚举都有这个code属性
    //方便使用多态，实现EnumUtil中的getByCode方法。根据code，查询出对应的枚举对象
    Integer getCode();
}
