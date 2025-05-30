package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("audi 8");
        return veh;
    }
    @Bean
    String hello(){
        return "hello world";
    }
    @Bean
    Integer number(){
        return 16;
    }
}
