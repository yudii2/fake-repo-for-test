package com.yujin.fakerepofortest.travel.service;

import com.yujin.fakerepofortest.travel.domain.TravelEntity;
import com.yujin.fakerepofortest.travel.domain.TravelRepository;
import org.springframework.stereotype.Service;

import static com.yujin.fakerepofortest.travel.domain.TravelEntity.EMPTY_TRAVEL_ENTITY;

@Service
public class TravelService {

    private final TravelRepository travelRepository;

    public TravelService(TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }

    public TravelEntity getTravelEntityById(Long id) {
        return travelRepository.findById(id).orElseGet(() -> EMPTY_TRAVEL_ENTITY);
    }
}
