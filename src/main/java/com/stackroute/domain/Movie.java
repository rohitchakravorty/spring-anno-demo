package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Movie {


    Actor actor;

    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor2) {
        this.actor = actor2;
    }

    public void printAboutMovieActor()
    {
        actor.printActor();
    }
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    public void setBeanName(String s) {
        System.out.println(s);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }
}
