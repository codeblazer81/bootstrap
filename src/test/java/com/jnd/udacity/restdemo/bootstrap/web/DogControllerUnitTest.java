package com.jnd.udacity.restdemo.bootstrap.web;

import org.apache.http.client.methods.HttpGet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.context.junit4.SpringRunner;

import com.jnd.udacity.restdemo.dogrestapi.service.DogService;
import com.jnd.udacity.restdemo.dogrestapi.web.DogController;

@WebMvcTest(DogController.class)

public class DogControllerUnitTest {

    @Autowired
    public MockMvc mockMvc;

    @MockBean 
    public DogService dogService;

 

    @Test
    public void getAllDogBreeds() throws Exception{
        //this.mockMvc.perform(get("/dogs/breeds/"))
        //.andExpect
            


    }

    
}
