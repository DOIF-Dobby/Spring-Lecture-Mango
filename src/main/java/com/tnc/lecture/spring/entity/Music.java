package com.tnc.lecture.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.time.Period;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Music {
    private Long id;
    private String name;
    private String singer;
    private int playTime;
}
