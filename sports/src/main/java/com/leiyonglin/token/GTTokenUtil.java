package com.leiyonglin.token;

import com.leiyonglin.MD5Util.MD5Util;
import com.leiyonglin.redis.service.RedisService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
public class GTTokenUtil {

    @Resource
    RedisService redisService;

    public String accessUserToken(Integer userId, String username){

        String token = MD5Util.convertMd5String(userId.toString(), username+new Date().toString());

        redisService.set(userId.toString(), token);

        return token;

    }

    public GTTokenUtil() {

    }
}
