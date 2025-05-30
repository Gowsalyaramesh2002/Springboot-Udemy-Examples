package org.example;

import org.example.beans.Vehicle2;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle2 veh = context.getBean("vehicle2",Vehicle2.class);
        System.out.println("inside context " + veh.getName());

        Vehicle2 veh1 = context.getBean("audibean",Vehicle2.class);
        System.out.println("inside context access with bean name own customization " + veh1.getName());

        Vehicle2 veh3 = context.getBean(Vehicle2.class);
        System.out.println("inside context access with primary bean" + veh3.getName());

    }
}


