package com.udemy.Learning_Project_Lombok.controller;

import com.udemy.Learning_Project_Lombok.model.Beer;
import com.udemy.Learning_Project_Lombok.service.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@Slf4j
@RequestMapping("/api/v1/beer")
public class BeerController {
    private final BeerService beerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Beer> listBeers(){
        return beerService.listBeers();
    }

    @RequestMapping(value ="/{beerId}", method = RequestMethod.GET)
    public Beer getBeerById(@PathVariable UUID beerId){
        log.debug("Get beer by id - in controller");
        return beerService.getBeerById(beerId);
    }
}
