package com.udemy.Learning_Project_Lombok.controller;

import com.udemy.Learning_Project_Lombok.model.Beer;
import com.udemy.Learning_Project_Lombok.service.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@AllArgsConstructor
@Controller
@Slf4j
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerById(UUID id){
        log.debug("Get beer by id - in controller");
        return beerService.getBeerById(id);
    }
}
