package org.ownconcept;

import org.ownconcept.beans.pets;
import org.ownconcept.config.PetConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            pets pet = new pets();
            pet.setBreed("cat");
            pet.setAge(5);
            pet.setName("puppsch");
        System.out.println("outside the context pets list");
        System.out.println(pet.getAge()+pet.getBreed()+pet.getName());

        var context = new AnnotationConfigApplicationContext(PetConfig.class);
        pets animal = context.getBean(pets.class);
        System.out.println("inside the context pets list ");
        System.out.println(animal.getAge()+animal.getBreed()+animal.getName());



    }
}