package org.example;

import org.example.beans.Vehicle2;
import org.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle2 volkswara = new Vehicle2();
        volkswara.setName("volkswara");
        Supplier<Vehicle2>volswarasupplier =() -> volkswara;//lambda syntax

        Supplier<Vehicle2> audisupplier=()-> {
            Vehicle2 audi = new Vehicle2();
            audi.setName("audi");
            return audi;
        };
        Random random = new Random();
        int randomnumber = random.nextInt(10);
        System.out.println("Random number " + randomnumber);
        if ((randomnumber%2)==0){
            context.registerBean("volkswara",Vehicle2.class,volswarasupplier);
        }
        else {
            context.registerBean("audi",Vehicle2.class,audisupplier);

        }
        Vehicle2 volkswaraVehicle2=null;
        Vehicle2 audiVehicle2=null;
        try{
            volkswaraVehicle2= context.getBean("volkswara", Vehicle2.class);
        }
        catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("error while creating volkswara bean");
        }
        try{
            audiVehicle2= context.getBean("audi", Vehicle2.class);
        }
        catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("error while creating audi bean");
        }
        if (volkswaraVehicle2!=null){
            System.out.println("while programming it get from bean " + volkswaraVehicle2.getName());
        }
        else {
            System.out.println("while programming it get from bean " + audiVehicle2.getName());

        }
    }
}


