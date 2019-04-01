package com.leiyonglin.service.user;

import com.leiyonglin.common.base.JsonResult;

public interface UserService {

    JsonResult doLogin(String username, String password);

    JsonResult doRegist(String username, String password, String telephone);
}
