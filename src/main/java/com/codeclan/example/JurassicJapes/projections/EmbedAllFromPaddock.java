package com.codeclan.example.JurassicJapes.projections;

import com.codeclan.example.JurassicJapes.models.Dinosaur;
import com.codeclan.example.JurassicJapes.models.Paddock;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="EmbedAllFromPaddock", types = Paddock.class)
public interface EmbedAllFromPaddock {
    Long getId();
    String getName();
    List<Dinosaur> getDinosaurs();
}
