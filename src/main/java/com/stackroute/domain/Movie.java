package com.stackroute.domain;
public class Movie {


    Actor actor;
    public Movie(Actor actor)
    {
        this.actor = actor;
    }
    public void printAboutMovieActor()
    {
        actor.printActor();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
