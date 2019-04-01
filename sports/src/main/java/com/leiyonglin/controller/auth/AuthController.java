package com.leiyonglin.controller.auth;

import com.leiyonglin.common.base.Constant;
import com.leiyonglin.common.base.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @RequestMapping(value = "/noToken")
    public JsonResult noToken(){

        return new JsonResult(Constant.INVALID_TOKEN, "登陆失效", null);
    }
}
