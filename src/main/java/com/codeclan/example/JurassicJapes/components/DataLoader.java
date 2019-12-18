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

        Paddock desert = new Paddock("Desert");
        paddockRepository.save(desert);

        Paddock jungle = new Paddock("Jungle");
        paddockRepository.save(jungle);

        Dinosaur roary = new Dinosaur("T Rex", "meat", swamp);
        dinosaurRepository.save(roary);

        Dinosaur garry = new Dinosaur("Bronto", "plants", swamp);
        dinosaurRepository.save(garry);

        Dinosaur karen = new Dinosaur("Bronto", "plants", swamp);
        dinosaurRepository.save(karen);

        Dinosaur mike = new Dinosaur("Bronto", "plants", swamp);
        dinosaurRepository.save(mike);

        Dinosaur dot = new Dinosaur("Bronto", "plants", jungle);
        dinosaurRepository.save(dot);

        Dinosaur dave = new Dinosaur("Bronto", "plants", jungle);
        dinosaurRepository.save(dave);

        Dinosaur jenny = new Dinosaur("Bronto", "plants", jungle);
        dinosaurRepository.save(jenny);

        Dinosaur jake = new Dinosaur("Raptor", "meat", desert);
        dinosaurRepository.save(jake);

        Dinosaur sue = new Dinosaur("Raptor", "meat", desert);
        dinosaurRepository.save(sue);

    }
}
