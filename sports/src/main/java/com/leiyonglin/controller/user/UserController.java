package com.leiyonglin.controller.user;

import com.leiyonglin.common.base.JsonResult;
import com.leiyonglin.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public JsonResult userLogin(String username, String password) {

        JsonResult result = userService.doLogin(username, password);


        return result;
    }

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult userRegist(@org.jetbrains.annotations.NotNull @RequestBody Map<String, String> resultMap, HttpServletRequest request, HttpServletResponse response) {

        String username = resultMap.get("username");
        String password = resultMap.get("password");
        String telephone = resultMap.get("telephone");


        return userService.doRegist(username, password, telephone);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){

        return "hello world";
    }

}
