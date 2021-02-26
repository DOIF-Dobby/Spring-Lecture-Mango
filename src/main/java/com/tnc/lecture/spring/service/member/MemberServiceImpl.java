package com.tnc.lecture.spring.service.member;

import com.tnc.lecture.spring.entity.Member;
import com.tnc.lecture.spring.respository.member.MemberRepository;
import com.tnc.lecture.spring.respository.member.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
