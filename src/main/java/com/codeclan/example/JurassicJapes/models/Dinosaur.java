package com.codeclan.example.JurassicJapes.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="dinosaurs")
public class Dinosaur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name="species")
    private String species;

    @Column(name="food_type")
    private String foodType;

    @JsonIgnoreProperties("dinosaurs")
    @ManyToOne
    @JoinColumn(name="paddock_id", nullable=false)
    private Paddock paddock;

    public Dinosaur(String species, String foodType, Paddock paddock) {
        this.species = species;
        this.foodType = foodType;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Paddock getPaddock() {
        return paddock;
    }

    public void setPaddock(Paddock paddock) {
        this.paddock = paddock;
    }
}
