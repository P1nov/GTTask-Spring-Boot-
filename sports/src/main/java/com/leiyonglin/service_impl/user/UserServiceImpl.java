package com.leiyonglin.service_impl.user;

import com.leiyonglin.common.MD5Util.MD5Util;
import com.leiyonglin.common.base.JsonResult;
import com.leiyonglin.common.token.GTTokenUtil;
import com.leiyonglin.dao.user.UserDao;
import com.leiyonglin.pojo.user.User;
import com.leiyonglin.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    /**
     * 用户数据DAO
     */
    @Autowired
    UserDao userDao;

    @Autowired
    GTTokenUtil tokenUtil;

    @Override
    public JsonResult doLogin(String username, String password) {

        String md5Pass = MD5Util.convertMd5String(password, username);

        try {

            Long time = new Date().getTime();

            User user = userDao.doLoginWith(username, md5Pass);

            if(user != null){

                userDao.updateLoginState(new Date(), user.getUserId());

                Map<String, Object> map = new HashMap<String, Object>();

                String token = tokenUtil.accessUserToken(user.getUserId(), user.getUsername());

                map.put("token", token);
                map.put("user", user);

                return new JsonResult(0, "登录成功", map);

            }else{

                return JsonResult.doLoginAcountOrPasswordError();
            }

        }catch (Exception e){


            return JsonResult.doError();
        }


    }

    @Override
    public JsonResult doRegist(String username, String password, String telephone) {

        try{

            Integer sameNum = userDao.judgeSameAccount(username, telephone);

            if(sameNum == 0){

                String md5Password = MD5Util.convertMd5String(password, username);

                Integer num = userDao.doRegistWith(username, md5Password, telephone);

                if(num == 1){

                    return JsonResult.doSuccess();
                }else{

                    return JsonResult.doError();
                }

            }else{

                return new JsonResult(1, "该用户已被注册", null);
            }

        }catch (Exception e){

            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getMessage());

            return new JsonResult(-1, e.getLocalizedMessage(), null);
        }
    }
}
