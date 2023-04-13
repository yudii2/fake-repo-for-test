package com.yujin.fakerepofortest.travel.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@EqualsAndHashCode
public class Transport {
    private Transportation transportation;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
}
