package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.example")
@PropertySource(value = "classpath:application.properties")
public class Config {

    @Bean
    public Engine engine(){
        return new Engine();
    }

    @Bean
    public Transmission transmission(){
        return new Transmission();
    }



}
