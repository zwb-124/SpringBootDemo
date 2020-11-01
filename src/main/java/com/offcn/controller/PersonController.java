package com.offcn.controller;

import com.offcn.pojo.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @RequestMapping("/findOne")
    public Person findOne(){
        return new Person("xiaobai",19);
    }

    @RequestMapping("/findAll")
    public List<Person> findAll(){
        List<Person> list = new ArrayList<>();
        list.add(new Person("asd",32));
        list.add(new Person("asdgse",33));
        list.add(new Person("asdf",34));
        return list;
    }

}
