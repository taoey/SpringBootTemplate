package com.tao.controller;


import com.tao.pojo.sys.Message;
import com.tao.pojo.sys.SimpleMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    @RequestMapping("/post_test")
    public Message postTest(@RequestBody SimpleMap params){
        return new Message(Message.STATUS_OK).setResult(params);
    }
}
