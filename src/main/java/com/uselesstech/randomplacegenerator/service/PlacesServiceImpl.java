package com.uselesstech.randomplacegenerator.service;

import com.uselesstech.randomplacegenerator.db.PlacesRepository;
import com.uselesstech.randomplacegenerator.entity.Places;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacesServiceImpl implements PlacesService {

    @Autowired
    private PlacesRepository placesRepository;

    @Override
    public List<Places> getAllPlacesBySubType(String subType, int page) {
        Pageable firstFiveElements = PageRequest.of(page, 5);
        return placesRepository.findAllBySubType(subType, firstFiveElements);
    }
}
