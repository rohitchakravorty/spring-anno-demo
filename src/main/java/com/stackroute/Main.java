package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main  {
    public static void main(String[] args)  {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        context.scan("com.stackroute");
        Movie mv=context.getBean("movie", Movie.class);
        mv.printAboutMovieActor();
        Movie mv1=context.getBean("movie",Movie.class);

    }

}
