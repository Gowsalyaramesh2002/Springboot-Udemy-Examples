package org.example;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("honda");
        System.out.println("vechicle from no context " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("inside context " + veh.getName());

        String hello = context.getBean(String.class);
        System.out.println("string value " + hello);

        Integer number = context.getBean(Integer.class);
        System.out.println("number value " + number);
    }
}


