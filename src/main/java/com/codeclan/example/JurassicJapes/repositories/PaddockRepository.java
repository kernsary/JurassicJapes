package com.codeclan.example.JurassicJapes.repositories;

import com.codeclan.example.JurassicJapes.models.Paddock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaddockRepository extends JpaRepository<Paddock, Long> {
}
