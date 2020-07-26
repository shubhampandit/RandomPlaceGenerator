package com.uselesstech.randomplacegenerator.db;

import com.uselesstech.randomplacegenerator.entity.Places;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlacesRepository extends JpaRepository<Places, Integer> {
    public List<Places> findAllBySubType(String subType, Pageable pageable);
}
