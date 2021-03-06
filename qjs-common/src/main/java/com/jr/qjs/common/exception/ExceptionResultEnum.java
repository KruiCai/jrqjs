package com.jr.qjs.common.exception;

/**
 * 返回错误枚举类
 * Created by krui on 2017/05/31.
 */
public enum ExceptionResultEnum {
    /**
     * 操作成功
     * */
    OK("0", "成功！"),
    /**
     *喔唷！服务器错误！
     * */
    ERROR("1", "喔唷！服务器错误."),

    ERROR_PHONE_IS_USED("2", "该账号已被绑定."),

    ERROR_TOKEN("3", "TOKEN错误或已失效，请重新登陆."),

    ERROR_PARAMS("4","参数错误."),

    ERROR_ACCOUNT_PASSWORD_NULL("5","用户名或密码不能为空."),

    ERROR_ACCOUNT_PASSWORD_ERROR("6","用户名或密码错误."),

    ERROR_INTERFACE("7","接口调用失败."),

    ERROR_RESOURCE_DELETE("8","请先删除该资源的子项."),

    ERROR_UPLOAD_IMG("9","图片上传失败."),

    ERROR_DELETE_ROLE("10","删除失败，请检查该角色下是否有用户."),

    ERROR_DELETE_DEPT("11","删除失败，请检查该部门下是否有用户或角色."),

    ERROR_SCHEDULE_CRON("12","请输入正确的CRON表达式."),
    ;
    private String code;
    private String name;

    ExceptionResultEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }
    public String getCode() {
        return this.code;
    }
    public String getName() {
        return this.name;
    }
}
