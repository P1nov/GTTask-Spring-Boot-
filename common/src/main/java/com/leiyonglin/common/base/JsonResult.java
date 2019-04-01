package com.leiyonglin.common.base;

import com.leiyonglin.common.token.GTTokenUtil;

import java.util.HashMap;
import java.util.Map;

public class JsonResult {

    private Integer code;
    private String message;
    private Object content;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public JsonResult(Integer code, String message, Object content) {
        this.code = code;
        this.message = message;
        this.content = content;
    }

    public JsonResult() {
        super();
    }

    public static JsonResult doSuccess(){

        return new JsonResult(0, "操作成功", null);

    }

    public static JsonResult doError(){

        return new JsonResult(500, "操作失败，请稍后再试", null);
    }

    public static JsonResult doLoginAcountOrPasswordError(){

        return new JsonResult(101, "账号密码错误！", null);
    }
}