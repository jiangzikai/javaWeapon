package com.weapon.Utils;

import com.weapon.baseInfo.enums.CodeEnum;

/**
 * @program: weapon
 * @Date: 2019/1/31 0031 下午 3:58
 * @Author: jiangzikai
 * @Description:根据code，查询出对应的枚举对象
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
