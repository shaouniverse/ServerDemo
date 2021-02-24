package com.example.demo.service;

import com.example.demo.dao.DemoObject;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public DemoObject getDemo(){
        DemoObject demoObject = new DemoObject();
        demoObject.setName("悟天");
        demoObject.setAge(11);
        return demoObject;
    }
}
