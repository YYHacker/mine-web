package com.main.web.contorller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginAccessInterceptor extends HandlerInterceptorAdapter {

	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler) throws Exception {
        String username = request.getParameter("username");
        if (username != null) {
            return true;
        }
        response.sendRedirect("jsp/hello.jsp");
        return false;
    }
}
