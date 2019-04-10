package com.study.attendance.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 静态方法获取当前的request和response
 * @author fanqilong_moli@163.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class ServletUtil {
    public static HttpServletResponse currentResponse() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
    }
    public static HttpServletRequest currentRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

}
