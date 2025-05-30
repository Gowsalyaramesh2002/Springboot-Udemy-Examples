package org.ownconcept.config;

import org.ownconcept.beans.pets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetConfig {

    @Bean
    pets pet(){
        var animal = new pets();
        animal.setName("dog");
        animal.setAge(3);
        animal.setBreed("pomerian");
        return animal;

}
}
