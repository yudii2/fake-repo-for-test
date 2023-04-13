package com.yujin.fakerepofortest.travel.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTravelRepository extends TravelRepository, JpaRepository<TravelEntity, Long> {
}
