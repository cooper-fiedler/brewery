package com.cooperfiedler.brewery.services;

import com.cooperfiedler.brewery.web.model.BeerDto;

import java.util.UUID;
public interface BeerService {
        BeerDto getBeerById(UUID beerId);
}
