package com.leiyonglin.dao.user;

import com.leiyonglin.pojo.user.User;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public interface UserDao {

    User doLoginWith(String username, String md5Password);

    Integer updateLoginState(Date login_time, Integer userId);

    Integer doRegistWith(String username, String md5Password, String telephone);

    Integer judgeSameAccount(String username, String telephone);

}
