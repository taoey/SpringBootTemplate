package com.tao.service;

import com.tao.dao.SystemTaskMapper;
import com.tao.pojo.db.SystemTask;
import com.tao.pojo.db.SystemTaskExample;
import com.tao.pojo.sys.SimpleMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemTaskServiceImpl implements SystemTaskService{

    @Autowired
    private SystemTaskMapper systemTaskMapper;

    @Override
    public void test() {
        SystemTaskExample example = new SystemTaskExample();
        List<SystemTask> systemTasks = systemTaskMapper.selectByExample(example);
        System.out.println(systemTasks);
    }

    @Override
    public Integer addOne(SimpleMap params) {
        
        return null;
    }


}
