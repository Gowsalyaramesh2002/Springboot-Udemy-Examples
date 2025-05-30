package org.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle2 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initalize(){
        this.name="honda";
    }
    @PreDestroy
    public void destory(){
        System.out.println("destory method executed");
    }
    public void hello(){
        System.out.println("hello world inside the component scan");
    }
}
