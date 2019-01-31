package com.weapon.baseInfo.enums;

/**
 * @program: weapon
 * @Date: 2019/1/31 0031 下午 4:04
 * @Author: jiangzikai
 * @Description:订单状态枚举
 * 标准枚举，code值和message值
 * 构造器需定义成私有的，这样就不能在别处申明此类的对象了。
 * 枚举类通常应该设计成不可变类，它的Field不应该被改变，这样会更安全，而且代码更加简洁。
 * 所以我们将Field用private final修饰。
 */
public enum OrderStatusEnum_4 implements CodeEnum {
    ORDERSTATUS_INIT(0, "初始"),
    ORDERSTATUS_SUCCESS(1, "支付成功"),
    ORDERSTATUS_FAIL(2, "支付失败"),
    ORDERSTATUS_WAIT(3,"待支付"),
    ORDERSTATUS_SIGNWAIT(4,"已签名待支付");//这个后面必须有分号

    private final Integer code;
    private final String message;

    //私有构造器
    private OrderStatusEnum_4(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
