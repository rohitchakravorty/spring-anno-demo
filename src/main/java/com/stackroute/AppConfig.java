package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Movie movie()
    {
        Actor actor=new Actor();
        actor.setAge(21);
        actor.setGender("M");
        actor.setName("Rohit");

        return new Movie(actor);
    }

}
