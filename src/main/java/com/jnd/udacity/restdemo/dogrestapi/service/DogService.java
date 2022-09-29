package com.jnd.udacity.restdemo.dogrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jnd.udacity.restdemo.dogrestapi.entity.Dog;
import com.jnd.udacity.restdemo.dogrestapi.repository.DogRepository;

@Service
public class DogService {
    
    @Autowired
    DogRepository dogs;

    public DogService(DogRepository dogs) {
        this.dogs = dogs;
    }

    
    public Iterable<Dog> retrievDogBreed(){

        return dogs.findAll();

    }

    public Dog retrievDogBreedById(long id){

        Optional<Dog> optionalBreed = dogs.findById(id);
        Dog breed = optionalBreed.orElseThrow(DogNotFoundException::new);
        return breed;

    }

    public Iterable<Dog> retrievDogNames(){

        return dogs.findAll();

    }
    

}
