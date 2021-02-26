package com.tnc.lecture.spring.service.member;

import com.tnc.lecture.spring.entity.Member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
