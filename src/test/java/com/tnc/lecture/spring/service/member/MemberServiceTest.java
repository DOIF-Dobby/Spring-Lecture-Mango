package com.tnc.lecture.spring.service.member;

import com.tnc.lecture.spring.entity.Member;
import com.tnc.lecture.spring.entity.constant.Membership;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    @DisplayName("회원가입 테스트")
    public void join() throws Exception {
        // given
        Member memberA = new Member(1L, "memberA", LocalDate.now(), Membership.NONE);

        // when
        memberService.join(memberA);
        Member findMember = memberService.findMember(1L);

        // then
        assertThat(findMember.getName()).isEqualTo("memberA");
        assertThat(memberA).isEqualTo(findMember);
    }
}