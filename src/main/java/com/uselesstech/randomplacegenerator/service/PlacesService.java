package com.uselesstech.randomplacegenerator.service;

import com.uselesstech.randomplacegenerator.entity.Places;

import java.util.List;

public interface PlacesService {
    public List<Places> getAllPlaces(int page);
    public List<Places> getAllPlacesBySubType(String subType, int page);
    public List<Places> getAllPlacesByPlaceNum(int placeNum, int page);
    public void insertOrSavePlace(Places places);
    public void deletePlace(int placeId);
}
