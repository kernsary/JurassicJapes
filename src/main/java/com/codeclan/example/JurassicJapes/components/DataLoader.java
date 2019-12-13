package com.codeclan.example.JurassicJapes.components;

import com.codeclan.example.JurassicJapes.models.Dinosaur;
import com.codeclan.example.JurassicJapes.models.Paddock;
import com.codeclan.example.JurassicJapes.repositories.DinosaurRepository;
import com.codeclan.example.JurassicJapes.repositories.PaddockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    DinosaurRepository dinosaurRepository;

    @Autowired
    PaddockRepository paddockRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args) {

        Paddock swamp = new Paddock("Swamp");
        paddockRepository.save(swamp);

        Dinosaur roary = new Dinosaur("T Rex", "meat", swamp);
        dinosaurRepository.save(roary);

        Dinosaur garry = new Dinosaur("T Rex", "meat", swamp);
        dinosaurRepository.save(garry);

    }
}
