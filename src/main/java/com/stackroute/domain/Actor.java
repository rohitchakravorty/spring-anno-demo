package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Actor {
    String name;
    String gender;
    int age;

    @Autowired
    public void setName(String name) {
        this.name = name;
    }
    @Autowired
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Autowired
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String   toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
