package com.cooperfiedler.brewery.services.v2;

import com.cooperfiedler.brewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);
    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2);
    void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2);
    void deleteById(UUID beerId);
}
