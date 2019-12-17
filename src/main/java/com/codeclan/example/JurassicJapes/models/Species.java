package com.codeclan.example.JurassicJapes.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="species")
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="food_type")
    private String foodType;

//    @JsonIgnoreProperties("species")
    @OneToMany(mappedBy = "species", fetch=FetchType.LAZY)
    private List<Dinosaur> dinosaurs;

    public Species(String name, String foodType) {
        this.name = name;
        this.foodType = foodType;
        this.dinosaurs = new ArrayList<Dinosaur>();
    }

    public Species(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Dinosaur> getDinosaurs() {
        return dinosaurs;
    }

    public void setDinosaurs(List<Dinosaur> dinosaurs) {
        this.dinosaurs = dinosaurs;
    }


    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}
