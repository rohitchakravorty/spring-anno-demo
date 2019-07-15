package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Actor {

    private String name;
    private String gender;
    private int age;

    public Actor() {

    }

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    

    public void printActor()
    {
        System.out.println("Actor's Name:"+name+"\n"+"Gender:"+gender+"\n"+"Age:"+age);
    }

}
