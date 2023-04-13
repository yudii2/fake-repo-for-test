package com.yujin.fakerepofortest;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

public class BaseEntity {

    @CreatedDate
    private LocalDateTime regDateTime;
    @LastModifiedDate
    private LocalDateTime updDateTime;
}
