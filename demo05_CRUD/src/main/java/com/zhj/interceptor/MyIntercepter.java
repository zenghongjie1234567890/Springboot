package com.zhj.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-10 18:34
 **/

public class MyIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("=================="+"before");
        String uri = request.getRequestURI();  //  注意:uri自带/
        // 如果请求路径是/404，就无法访问
        if (uri.equals("/40411")){
            // 如果是false,就执行不下去了,是true,就执行到Controller里面的网页路径
            return false;
        }else {
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("=================="+"posting");

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("=================="+"after");
    }
}
