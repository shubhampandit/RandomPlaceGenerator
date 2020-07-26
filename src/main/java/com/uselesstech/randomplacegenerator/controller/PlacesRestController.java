package com.uselesstech.randomplacegenerator.controller;

import com.uselesstech.randomplacegenerator.entity.Places;
import com.uselesstech.randomplacegenerator.service.PlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlacesRestController {

    @Autowired
    private PlacesService placesService;

    @GetMapping("/places/{subType}")
    private List<Places> getAllPlacesBySubType(@PathVariable String subType
            , @RequestParam(required = false) Integer page) {
        return placesService.getAllPlacesBySubType(subType, page);
    }
}
