package com.codeclan.example.JurassicJapes.repositories;

import com.codeclan.example.JurassicJapes.models.Dinosaur;
import com.codeclan.example.JurassicJapes.projections.EmbedAllFromDinosaur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedAllFromDinosaur.class)
public interface DinosaurRepository extends JpaRepository<Dinosaur, Long> {
}
