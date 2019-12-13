package com.codeclan.example.JurassicJapes.projections;

import com.codeclan.example.JurassicJapes.models.Dinosaur;
import com.codeclan.example.JurassicJapes.models.Paddock;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="EmbedAllFromDinosaur", types = Dinosaur.class)
public interface EmbedAllFromDinosaur {
    Long getId();
    String getSpecies();
    String getFoodType();
    Paddock getPaddock();
}
