package com.example.exception;

import com.example.pojo.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@RestControllerAdvice
public class GenericAjaxExceptionHandler {

//    @ExceptionHandler(value = Exception.class)
    public JsonResult defaultErrorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) {
        e.printStackTrace();
        return JsonResult.errorException(e.getMessage());
    }
}
