package com.uselesstech.randomplacegenerator.service;

import com.uselesstech.randomplacegenerator.entity.Places;

import java.util.List;
import java.util.Optional;

public interface PlacesService {
    public List<Places> getAllPlaces(int page);
    public Optional<Places> getPlaceByID(int id);
    public List<Places> getAllPlacesBySubType(String subType, int page);
    public List<Places> getAllPlacesByPlaceNum(int placeNum, int page);
    public void insertOrSavePlace(Places places);
    public void deletePlace(int placeId);
}
