package org.example.config;

import org.example.beans.Vehicle2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "audibean")
    Vehicle2 vehicle1(){
        var veh = new Vehicle2();
        veh.setName("audi 8");
        return veh;
    }
    @Primary
    @Bean
    Vehicle2 vehicle2(){
        var veh = new Vehicle2();
        veh.setName("honda");
        return veh;
    }
    @Bean
    Vehicle2 vehicle3(){
        var veh = new Vehicle2();
        veh.setName("audi");
        return veh;
    }

}
