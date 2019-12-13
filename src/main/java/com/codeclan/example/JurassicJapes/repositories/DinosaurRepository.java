package com.codeclan.example.JurassicJapes.repositories;

import com.codeclan.example.JurassicJapes.models.Dinosaur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DinosaurRepository extends JpaRepository<Dinosaur, Long> {
}
