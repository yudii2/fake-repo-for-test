package com.yujin.fakerepofortest.travel.domain;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TravelRepository {
    Optional<TravelEntity> findById(Long id);
    TravelEntity save(TravelEntity travel);
}
