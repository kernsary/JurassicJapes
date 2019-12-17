package com.codeclan.example.JurassicJapes.repositories;

import com.codeclan.example.JurassicJapes.models.Species;
import com.codeclan.example.JurassicJapes.projections.EmbedAllFromSpecies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedAllFromSpecies.class)
public interface SpeciesRepository extends JpaRepository<Species, Long> {
}
