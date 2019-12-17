package com.codeclan.example.JurassicJapes.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="dinosaurs")
public class Dinosaur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @JsonIgnoreProperties("dinosaurs")
    @ManyToOne
    @JoinColumn(name="species_id", nullable=false)
    private Species species;



    @JsonIgnoreProperties("dinosaurs")
    @ManyToOne
    @JoinColumn(name="paddock_id", nullable=false)
    private Paddock paddock;

    public Dinosaur(Species species, Paddock paddock) {
        this.species = species;
        this.paddock = paddock;
    }

    public Dinosaur(){
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Paddock getPaddock() {
        return paddock;
    }

    public void setPaddock(Paddock paddock) {
        this.paddock = paddock;
    }
}
