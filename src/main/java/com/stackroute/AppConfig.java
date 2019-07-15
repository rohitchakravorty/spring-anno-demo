package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Actor actor()
    {
        return new Actor("Rohit","M",42);
    }

    @Bean
    public Actor actor1()
    {
        return new Actor("Sabyasachi","M",32);
    }

    @Bean
    public Actor actor2() {
        return new Actor("Utkarsh", "M", 25);
    }


}
