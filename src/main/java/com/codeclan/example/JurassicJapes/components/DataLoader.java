package com.codeclan.example.JurassicJapes.components;

import com.codeclan.example.JurassicJapes.models.Dinosaur;
import com.codeclan.example.JurassicJapes.models.Paddock;
import com.codeclan.example.JurassicJapes.models.Species;
import com.codeclan.example.JurassicJapes.repositories.DinosaurRepository;
import com.codeclan.example.JurassicJapes.repositories.PaddockRepository;
import com.codeclan.example.JurassicJapes.repositories.SpeciesRepository;
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

    @Autowired
    SpeciesRepository speciesRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args) {

        Species tRex = new Species("T Rex", "meat");
        speciesRepository.save(tRex);

        Species raptor = new Species("Raptor", "meat");
        speciesRepository.save(raptor);

        Species bronto = new Species("Bronto", "plants");
        speciesRepository.save(bronto);

        Species steggy = new Species("Steggy", "plants");
        speciesRepository.save(steggy);

        Paddock swamp = new Paddock("Swamp");
        paddockRepository.save(swamp);

        Dinosaur roary = new Dinosaur(tRex, swamp);
        dinosaurRepository.save(roary);

        Dinosaur garry = new Dinosaur(bronto, swamp);
        dinosaurRepository.save(garry);

    }
}
