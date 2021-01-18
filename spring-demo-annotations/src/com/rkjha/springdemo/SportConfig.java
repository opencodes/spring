package com.rkjha.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.rkjha.springdemo")
@PropertySource("classpath:app.properties")
public class SportConfig {
    // Define a bean for sad fortune service
    @Bean
    public Fortune sadFortuneService(){
        return new SadFortuneService();
    }
    // Define a bean for our swim coach and inject dependency
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
