package org.example;

import org.example.beans.Vehicle2;
import org.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle2 vehicle2 = context.getBean(Vehicle2.class);
        System.out.println("vehicle name of the xml class " + vehicle2.getName());
    }
}


