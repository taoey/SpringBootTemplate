package com.tao.config;

import com.tao.pojo.sys.Message;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class DefaultExceptionHandler {
    @ExceptionHandler
    //如果不配置@ResponseBody，仍然是返回某个页面
    @ResponseBody
    public Message exceptionHandler(HttpServletRequest request , Exception e){
        String message = "对不起，发生了异常";
        return new Message(Message.SERVER_ERROR,message);
    }
}
