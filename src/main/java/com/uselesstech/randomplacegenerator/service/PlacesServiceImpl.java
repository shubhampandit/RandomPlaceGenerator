package com.uselesstech.randomplacegenerator.service;

import com.uselesstech.randomplacegenerator.db.PlacesRepository;
import com.uselesstech.randomplacegenerator.entity.Places;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlacesServiceImpl implements PlacesService {

    @Autowired
    private PlacesRepository placesRepository;

    String[] subTypes = {/*"Rock", "Country", "Pop",*/ "Forest", "Beach", "Park", "Desert", "Mountain"};

    @Override
    public List<Places> getAllPlaces(int page) {
        List<Places> placeList = new ArrayList<>();
        for (int i = 0; i < subTypes.length; i++) {
            List<Places> tempList = getAllPlacesBySubType(subTypes[i], page);
            placeList.addAll(tempList);
        }
        return placeList;
    }

    @Override
    public List<Places> getAllPlacesBySubType(String subType, int page) {
        Pageable firstFiveElements = PageRequest.of(page, 5);
        return placesRepository.findAllBySubType(subType, firstFiveElements);
    }

    @Override
    public void insertOrSavePlace(Places places) {
        placesRepository.save(places);
    }

    @Override
    public void deletePlace(int placeId) {
        placesRepository.deleteById(placeId);
    }
}
