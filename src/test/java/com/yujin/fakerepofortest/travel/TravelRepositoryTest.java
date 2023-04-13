package com.yujin.fakerepofortest.travel;

import com.yujin.fakerepofortest.travel.domain.Transport;
import com.yujin.fakerepofortest.travel.domain.TravelEntity;
import com.yujin.fakerepofortest.travel.domain.TravelRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TravelRepositoryTest {

    private final TravelRepository travelRepository = new FakeTravelRepository();

    @Test
    @DisplayName(value = "아이디로 travel 엔티티를 조회할 수 있다.")
    public void getTravelById() {
        TravelEntity save = travelRepository.save(TravelEntity.of("이름", "01012345678", "미국", "LA", null, null));
        TravelEntity target = travelRepository.findById(save.getId()).get();

        Assertions.assertEquals(save.getName(), target.getName());
    }


}
