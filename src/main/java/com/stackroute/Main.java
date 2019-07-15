package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main  {
    public static void main(String[] args)  {

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Movie mv=context.getBean("movie1", Movie.class);
        mv.printAboutMovieActor();
        Movie mv1=context.getBean("movie2",Movie.class);
        System.out.println(mv==mv1);
    }

}
