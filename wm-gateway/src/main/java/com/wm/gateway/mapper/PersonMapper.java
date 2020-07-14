package com.wm.gateway.mapper;

import com.wm.gateway.entity.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper {

    Person getPersonByName(String name);

    @Insert("insert into person(id,name,age,sex) value (#{id},#{name},#{age},#{sex})")
    int insert(Person person);
}
