package com.tao.controller;


import com.tao.pojo.sys.Message;
import com.tao.service.SystemTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys_task/")
public class SystemTaskController {
    @Autowired
    private SystemTaskService systemTaskService;

    @RequestMapping("/add")
    public Message addOne(){
        return  new Message(Message.STATUS_OK);
    }


}
