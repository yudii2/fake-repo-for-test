package com.yujin.fakerepofortest.travel;

import com.yujin.fakerepofortest.travel.domain.Transport;
import com.yujin.fakerepofortest.travel.domain.TravelEntity;
import com.yujin.fakerepofortest.travel.domain.TravelRepository;

import java.util.HashMap;
import java.util.Optional;

public class FakeTravelRepository implements TravelRepository {

    HashMap<Long, TravelEntity> travelMap = new HashMap<>();

    @Override
    public Optional<TravelEntity> findById(Long id) {
        return Optional.ofNullable(travelMap.getOrDefault(id, ofDefault()));
    }

    @Override
    public TravelEntity save(TravelEntity travel) {
        return travelMap.put(travel.getId(), travel);
    }


    private TravelEntity ofDefault() {
        return TravelEntity.builder()
                .name("아무개")
                .phoneNumber("01011112222")
                .city("seoul")
                .nation("Korea")
                .goTransportTime(Transport.builder().build())
                .backTransportTime(Transport.builder().build())
                .build();
    }

}
