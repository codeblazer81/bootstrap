package com.jnd.udacity.restdemo.dogrestapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)

    private long id;
    private String name;
    private String breed;
    private String origin;


    public Dog() {
    }

    public Dog(String name, String breed, String origin) {
        this.name = name;
        this.breed = breed;
        this.origin = origin;
    }

    public Dog(long id, String name, String breed, String origin) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.origin = origin;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
}
