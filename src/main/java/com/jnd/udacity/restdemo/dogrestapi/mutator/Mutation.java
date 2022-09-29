package com.jnd.udacity.restdemo.dogrestapi.mutator;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import com.jnd.udacity.restdemo.dogrestapi.entity.Dog;
import com.jnd.udacity.restdemo.dogrestapi.repository.DogRepository;
import com.jnd.udacity.restdemo.dogrestapi.service.DogNotFoundException;

@Component
public class Mutation implements GraphQLMutationResolver{
    private DogRepository dogRepository;

    public Mutation (DogRepository dogRepository){
        this.dogRepository = dogRepository;
    }

    /*public Dog newDog (String name, String breed, String origin){
        Dog newDog = new Dog(name, breed, origin);
        dogRepository.save(newDog);
        return newDog;
    }
    */

    public boolean deleteDogBreed(String breed) {
        boolean deleted = false;
        Iterable<Dog> allDogs = dogRepository.findAll();
        // Loop through all dogs to check their breed
        for (Dog d:allDogs) {
           if (d.getBreed().equals(breed)) {
               // Delete if the breed is found
               dogRepository.delete(d);
               deleted = true;
           }
        }
        // Throw an exception if the breed doesn't exist
        if (!deleted) {
            throw new DogNotFoundException("Breed Not Found");
        }
        return deleted;
    }

    public Dog updateDogName(String newName, long id){
        Optional<Dog> optionalDog = dogRepository.findById(id);
        if (optionalDog.isPresent()){
            Dog dog = optionalDog.get();
            dog.setName(newName);
            dogRepository.save(dog);
            return dog;
        }
        else{
            throw new DogNotFoundException("Dog not found");
        }

    }
}
