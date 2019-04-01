package com.leiyonglin.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SportInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        if(request.getHeader("SportToken") != null){

            return true;

        }else{

            request.getRequestDispatcher("/auth/noToken").forward(request, response);

            return false;
        }
    }
}
