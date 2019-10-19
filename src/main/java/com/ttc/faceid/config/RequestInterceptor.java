package com.ttc.faceid.config;

import org.apache.commons.lang.time.StopWatch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by tudv on 2019/09/23
 */
@Component
public class RequestInterceptor extends HandlerInterceptorAdapter {
    protected static final Logger requestLog = LogManager.getLogger("RequestLog");
    StopWatch stopWatch = new StopWatch();

    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler) {

        String fullRequestURI = request.getRequestURI();
        stopWatch = new StopWatch();
        if (request.getQueryString() != null) {
            fullRequestURI = fullRequestURI + "?" + request.getQueryString();
        }
        stopWatch.start();
        requestLog.info("[{}] start request [{}] {}", request.getRemoteAddr(), request.getMethod(), fullRequestURI);
        return true;
    }

    @Override
    public void afterCompletion(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler,
            Exception ex) {
        try {
            stopWatch.stop();
            String fullRequestURI = request.getRequestURI();
            if (request.getQueryString() != null) {
                fullRequestURI = fullRequestURI + "?" + request.getQueryString();
            }
            requestLog.info("[{}] finish request [{}] {} in {}ms", request.getRemoteAddr(), request.getMethod(), fullRequestURI, (float) stopWatch.getTime() / 1000);
            stopWatch.reset();
        } catch (Exception e) {

        }
    }
}
