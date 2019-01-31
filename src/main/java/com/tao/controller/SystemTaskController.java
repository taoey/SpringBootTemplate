package com.tao.controller;


import com.tao.pojo.sys.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys_task/")
public class SystemTaskController {

    @RequestMapping("/add")
    public Message addOne(){
        return  new Message(Message.STATUS_OK);
    }


}
