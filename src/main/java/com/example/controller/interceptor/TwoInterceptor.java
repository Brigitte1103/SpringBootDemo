package com.example.controller.interceptor;

import com.alibaba.druid.support.json.JSONUtils;
import com.example.pojo.JsonResult;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

public class TwoInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (true){
//            returnErrorResponse(response, JsonResult.errorMsg("被two拦截"));
        }
        System.out.println("被two拦截...");
        return false;
    }


    public void returnErrorResponse(HttpServletResponse response, JsonResult result) throws IOException {
        OutputStream outputStream = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/json");
        try {
            outputStream = response.getOutputStream();
            outputStream.write(JSONUtils.toJSONString(result).getBytes());
            outputStream.flush();
        } finally {
            if (outputStream != null){
                outputStream.close();
            }
        }

    }
}
