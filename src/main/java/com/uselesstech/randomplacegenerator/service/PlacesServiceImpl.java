package com.uselesstech.randomplacegenerator.service;

import com.uselesstech.randomplacegenerator.db.PlacesRepository;
import com.uselesstech.randomplacegenerator.entity.Places;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlacesServiceImpl implements PlacesService {

    @Autowired
    private PlacesRepository placesRepository;

    String[] subTypes = {"Rock", "Country", "Pop", "Forest", "Beach", "Park", "Desert", "Mountain"};

    @Override
    public List<Places> getAllPlaces(int page) {
        List<Places> placeList = new ArrayList<>();
        for (String subType : subTypes) {
            List<Places> tempList = getAllPlacesBySubType(subType, page);
            placeList.addAll(tempList);
        }
        return placeList;
    }

    @Override
    public Optional<Places> getPlaceByID(int id) {
        return placesRepository.findById(id);
    }

    @Override
    public List<Places> getAllPlacesBySubType(String subType, int page) {
        Pageable firstFiveElements = PageRequest.of(page, 5);
        return placesRepository.findAllBySubType(subType, firstFiveElements);
    }

    @Override
    public List<Places> getAllPlacesByPlaceNum(int placeNum, int page) {
        Pageable firstFiveElements = PageRequest.of(page, 5);
        String subType = "";
        switch (placeNum){
            case 0:
                subType = "Rock";
                break;
            case 1:
                subType = "Country";
                break;
            case 2:
                subType = "Pop";
                break;
            case 3:
                subType = "EDM";
                break;
            case 4:
                subType = "Beach";
                break;
            case 5:
                subType = "Mountain";
                break;
            case 6:
                subType = "Forest";
                break;
            case 7:
                subType = "Park";
                break;
            case 8:
                subType = "Desert";
                break;
            case 9:
                subType = "India";
                break;
            case 10:
                subType = "America";
                break;
            case 11:
                subType = "Russia";
                break;
            case 12:
                subType = "Japan";
                break;
            case 13:
                subType = "Brazil";
                break;
            case 14:
                subType = "Bloodlines";
                break;
            case 15:
                subType = "Gor";
                break;
            case 16:
                subType = "Gangster";
                break;
            case 17:
                subType = "Temple";
                break;
            case 18:
                subType = "Church";
                break;
            case 19:
                subType = "Mosque";
                break;
            case 20:
                subType = "Male";
                break;
            case 21:
                subType = "Female";
                break;
        }
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
