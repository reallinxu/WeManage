package com.wm.gateway.service.impl;

import com.wm.gateway.entity.Person;
import com.wm.gateway.mapper.PersonMapper;
import com.wm.gateway.service.TestMyBatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestMyBatisServiceImpl implements TestMyBatisService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public Person getPersonByName(String name) {
        return personMapper.getPersonByName(name);
    }

    @Override
    public void insert(Person person) {
        personMapper.insert(person);
    }
}
