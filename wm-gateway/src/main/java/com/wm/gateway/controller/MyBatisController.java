package com.wm.gateway.controller;

import com.wm.gateway.entity.Person;
import com.wm.gateway.service.TestMyBatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyBatisController {

    @Autowired
    private TestMyBatisService testMyBatisService;

    @RequestMapping("test/mybatis")
    public String testMyBatis(@RequestParam String name){
        Person personByName = testMyBatisService.getPersonByName(name);
        return personByName.toString();
    }

}
