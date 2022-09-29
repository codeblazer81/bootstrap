package com.jnd.udacity.restdemo.dogrestapi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jnd.udacity.restdemo.dogrestapi.entity.Dog;
import com.jnd.udacity.restdemo.dogrestapi.service.DogService;

@RestController
public class DogController {

    private DogService dogs;


    @Autowired
    public DogController(DogService dogs) {
        this.dogs = dogs;
    }


    @GetMapping("/dogs/breeds")
    public ResponseEntity< Iterable<Dog> > getDogBreeds(){

        Iterable<Dog>  dogBreedList = dogs.retrievDogBreed();
        
        
            return new ResponseEntity<Iterable<Dog> >(dogBreedList, HttpStatus.OK);
        
    }

    @GetMapping("/dogs/names")
    public ResponseEntity< Iterable<Dog>> getDogNames(){

        Iterable<Dog> dogNamesList = dogs.retrievDogNames();
      
        return new ResponseEntity<Iterable<Dog>>(dogNamesList, HttpStatus.OK);

        

    }

    @GetMapping("/breeds/{id}")
    public ResponseEntity< Dog> getDogNames(@PathVariable long id){

        Dog dogBreedsById = dogs.retrievDogBreedById(id);

      
        return new ResponseEntity<Dog>(dogBreedsById, HttpStatus.OK);

        
    }
    
}
