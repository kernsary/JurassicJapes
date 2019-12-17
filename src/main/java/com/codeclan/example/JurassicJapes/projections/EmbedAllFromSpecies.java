package com.codeclan.example.JurassicJapes.projections;

import com.codeclan.example.JurassicJapes.models.Dinosaur;
import com.codeclan.example.JurassicJapes.models.Species;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="EmbedAllFromSpecies", types = Species.class)
public interface EmbedAllFromSpecies {
    Long getId();
    String getName();
    String getFoodType();
    List<Dinosaur> getDinosaurs();
}
