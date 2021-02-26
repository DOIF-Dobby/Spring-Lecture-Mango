package com.tnc.lecture.spring.entity;

import com.tnc.lecture.spring.AppConstant;
import com.tnc.lecture.spring.entity.constant.Membership;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Member {
    private Long id;
    private String name;
    private LocalDate joinDate;
    private Membership membership;

    public boolean isNewUser() {
        long between = ChronoUnit.DAYS.between(joinDate, LocalDate.now());
        return between <= AppConstant.DECIDE_NEW_USER_DAY;
    }
}
