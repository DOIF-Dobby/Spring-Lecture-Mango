package com.tnc.lecture.spring;

import com.tnc.lecture.spring.entity.Member;
import com.tnc.lecture.spring.entity.constant.Membership;
import com.tnc.lecture.spring.service.member.MemberServiceImpl;

import java.time.LocalDate;

public class MemberApp {

    public static void main(String[] args) {
        MemberServiceImpl memberService = new MemberServiceImpl();
        Member memberA = new Member(1L, "memberA", LocalDate.now(), Membership.NONE);
        memberService.join(memberA);

        Member findMember = memberService.findMember(1L);
        System.out.println("findMember = " + findMember);
        System.out.println("findMember.isNewUser() = " + findMember.isNewUser());
    }
}
