package com.jr.qjs.common.bean;

import com.jr.qjs.common.exception.ExceptionResultEnum;

import java.io.Serializable;

/**
 * 通用返回实体类
 * Created by krui on 2017/05/31.
 */
public class AbstractBean implements Serializable {

    /** */
    private static final long serialVersionUID = 1L;

    private String status = ExceptionResultEnum.OK.getCode();

    private String message= ExceptionResultEnum.OK.getName();

    private Object data;

    public AbstractBean(){
        super();
    }

    public AbstractBean(ExceptionResultEnum result){
        this.status = result.getCode();
        this.message = result.getName();
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
