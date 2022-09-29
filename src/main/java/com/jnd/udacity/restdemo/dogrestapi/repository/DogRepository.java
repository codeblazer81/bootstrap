package com.jnd.udacity.restdemo.dogrestapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jnd.udacity.restdemo.dogrestapi.entity.Dog;

public interface DogRepository extends CrudRepository<Dog, Long> {

   /* 
    @Query("select id, breed from Dog")
    List<String> getBreed();

    @Query("select id, name from Dog")
    List<String> getName();
    
    @Query("select id, breed from Dog where id = :id")
    List<String> getBreedById(long id);

    @Query("delete from Dog where id = :id")
    boolean deleteDogBreed(long id);

    @Query("update Dog set name = :name where id=:id")
    List<String> updateDogName (String name, long id);

    */
    
}
