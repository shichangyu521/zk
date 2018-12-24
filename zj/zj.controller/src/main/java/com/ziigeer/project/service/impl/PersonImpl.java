package com.ziigeer.project.service.impl;


import com.ziigeer.project.service.Person;

public class PersonImpl implements Person {

    @Override
    public void consume(Float money) {
        System.out.println("消费"+ money + "元");

    }

}
