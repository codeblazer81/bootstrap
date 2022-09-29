package com.jnd.udacity.restdemo.dogrestapi.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;


import com.google.common.base.Predicate;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2

public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis((Predicate<RequestHandler>) RequestHandlerSelectors.any())
            .paths((Predicate<String>) PathSelectors.any())
            .build();
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Dog REST API",
                "This API returns a list of dogs.",
                "1.0",
                "http://www.udacity.com/tos",
                new Contact("Udacious Student", "www.udacity.com", "myeaddress@udacity.com"),
                "License of API", "http://www.udacity.com/license", Collections.emptyList());
    }
}
