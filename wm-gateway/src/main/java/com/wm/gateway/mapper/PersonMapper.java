package com.wm.gateway.mapper;

import com.wm.gateway.entity.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper {

    Person getPersonByName(String name);

}
