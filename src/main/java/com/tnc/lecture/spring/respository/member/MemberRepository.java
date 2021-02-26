package com.tnc.lecture.spring.respository.member;

import com.tnc.lecture.spring.entity.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
