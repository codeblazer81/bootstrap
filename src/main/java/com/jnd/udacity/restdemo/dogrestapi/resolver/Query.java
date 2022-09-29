package com.jnd.udacity.restdemo.dogrestapi.resolver;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.jnd.udacity.restdemo.dogrestapi.entity.Dog;
import com.jnd.udacity.restdemo.dogrestapi.repository.DogRepository;
import com.jnd.udacity.restdemo.dogrestapi.service.DogNotFoundException;

@Component
public class Query implements GraphQLQueryResolver {

    private DogRepository dogRepository;

    public Query (DogRepository dogRepository){
        this.dogRepository = dogRepository;
    }

    public Iterable<Dog> findAllDogs (){
        return dogRepository.findAll();
    }

    public Dog findDogById (long id){
        Optional<Dog> optionalDog = dogRepository.findById(id);

        if (optionalDog.isPresent()){
            return optionalDog.get();
        }
        else{
            throw new DogNotFoundException("Dog not found");
        }
    }
}
