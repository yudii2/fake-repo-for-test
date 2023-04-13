package com.yujin.fakerepofortest.travel.domain;

import com.yujin.fakerepofortest.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "travel")
@ToString
@EqualsAndHashCode
public class TravelEntity extends BaseEntity {

    public static TravelEntity EMPTY_TRAVEL_ENTITY = new TravelEntity();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phoneNumber;
    private String nation;
    private String city;

    @Convert(converter = TransportConverter.class)
    private Transport goTransportTime;
    @Convert(converter = TransportConverter.class)
    private Transport backTransportTime;

    @Builder
    public TravelEntity(String name, String phoneNumber, String nation, String city, Transport goTransportTime, Transport backTransportTime) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.nation = nation;
        this.city = city;
        this.goTransportTime = goTransportTime;
        this.backTransportTime = backTransportTime;
    }

    public static TravelEntity of(String name, String phoneNumber, String nation, String city, Transport goTransportTime, Transport backTransportTime) {
        return TravelEntity.builder()
                .name(name)
                .phoneNumber(phoneNumber)
                .nation(nation)
                .city(city)
                .goTransportTime(goTransportTime)
                .backTransportTime(backTransportTime)
                .build();
    }

}
