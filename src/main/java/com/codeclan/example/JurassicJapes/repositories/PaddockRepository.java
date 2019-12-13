package com.codeclan.example.JurassicJapes.repositories;

import com.codeclan.example.JurassicJapes.models.Paddock;
import com.codeclan.example.JurassicJapes.projections.EmbedAllFromPaddock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedAllFromPaddock.class)
public interface PaddockRepository extends JpaRepository<Paddock, Long> {
}
