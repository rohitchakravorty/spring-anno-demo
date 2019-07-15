package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
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
}
