package com.tnc.lecture.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Streaming {
    private Member member;
    private Music music;
    private int streamingTime;
}
