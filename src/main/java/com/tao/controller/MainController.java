package com.tao.controller;


import com.tao.pojo.entity.Student;
import com.tao.pojo.sys.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
class MainController {
    @RequestMapping("/index")
    public String index(){
        return "hello";
    }

    @GetMapping("/studentInfo.json")
    public Message getStudentInfo(){
        List<Student> stus = new ArrayList<>();
        stus.add(new Student("tao",12,new Date()));
        stus.add(new Student("黄为涛",20,new Date()));
        stus.add(new Student("黄为涛",20,new Date()));
        return  new Message(Message.STATUS_OK).setResult(stus);
    }


}
