package com.uselesstech.randomplacegenerator.service;

import com.uselesstech.randomplacegenerator.entity.Places;

import java.util.List;

public interface PlacesService {
    public List<Places> getAllPlacesBySubType(String subType, int page);

}
