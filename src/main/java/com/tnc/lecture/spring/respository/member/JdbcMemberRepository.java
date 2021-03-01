package com.tnc.lecture.spring.respository.member;

import com.tnc.lecture.spring.entity.Member;

public class JdbcMemberRepository implements MemberRepository {
    @Override
    public void save(Member member) {

    }

    @Override
    public Member findById(Long memberId) {
        return null;
    }
}
