package com.udemy.Learning_Project_Lombok.service;

import com.udemy.Learning_Project_Lombok.model.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID id);

    List<Beer> listBeers();
}
