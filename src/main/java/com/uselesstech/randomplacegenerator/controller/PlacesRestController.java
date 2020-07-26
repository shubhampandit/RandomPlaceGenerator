package com.uselesstech.randomplacegenerator.controller;

import com.uselesstech.randomplacegenerator.entity.Places;
import com.uselesstech.randomplacegenerator.service.PlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlacesRestController {

    @Autowired
    private PlacesService placesService;

    @GetMapping("/")
    private String getHelloWorld(){
        return "Hello World!!";
    }

    @GetMapping("/places/{subType}")
    private List<Places> getAllPlacesBySubType(@PathVariable String subType
            , @RequestParam(required = false) Integer page) {
        return placesService.getAllPlacesBySubType(subType, page);
    }

    @PostMapping("/places")
    private void insertPlace(@RequestBody Places places){
        places.setId(0);
        placesService.insertOrSavePlace(places);
    }

    @PutMapping("/places")
    private void updatePlace(@RequestBody Places places){
        placesService.insertOrSavePlace(places);
    }

    @DeleteMapping("/places/{placeId}")
    private void deletePlace(@PathVariable int placeId){
        placesService.deletePlace(placeId);
    }
}
