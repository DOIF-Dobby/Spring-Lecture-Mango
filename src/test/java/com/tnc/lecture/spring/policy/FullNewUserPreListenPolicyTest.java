package com.tnc.lecture.spring.policy;

import com.tnc.lecture.spring.entity.Member;
import com.tnc.lecture.spring.entity.Music;
import com.tnc.lecture.spring.entity.constant.Membership;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class FullNewUserPreListenPolicyTest {
    NewUserPreListenPolicy newUserPreListenPolicy = new FullNewUserPreListenPolicy();

    @Test
    @DisplayName("음악의 playTime 만큼 스트리밍 되야한다.")
    public void fullStreamingTest() throws Exception {
        // given
        Member member = new Member(1L, "신규 유저", LocalDate.now(), Membership.NONE);
        Music music = new Music(1L, "Tell me", "원더걸스", 240);

        // when
        int preListenStreamingTime = newUserPreListenPolicy.getPreListenStreamingTime(member, music);

        // then
        Assertions.assertThat(preListenStreamingTime).isEqualTo(240);
    }
}