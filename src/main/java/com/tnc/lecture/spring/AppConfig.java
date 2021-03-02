package com.tnc.lecture.spring;

import com.tnc.lecture.spring.policy.FullNewUserPreListenPolicy;
import com.tnc.lecture.spring.policy.NewUserPreListenPolicy;
import com.tnc.lecture.spring.respository.member.MemberRepository;
import com.tnc.lecture.spring.respository.member.MemoryMemberRepository;
import com.tnc.lecture.spring.respository.music.MemoryMusicRepository;
import com.tnc.lecture.spring.respository.music.MusicRepository;
import com.tnc.lecture.spring.service.member.MemberService;
import com.tnc.lecture.spring.service.member.MemberServiceImpl;
import com.tnc.lecture.spring.service.music.MusicService;
import com.tnc.lecture.spring.service.music.MusicServiceImpl;
import com.tnc.lecture.spring.service.streaming.StreamingService;
import com.tnc.lecture.spring.service.streaming.StreamingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public MusicService musicService() {
        return new MusicServiceImpl(musicRepository());
    }

    @Bean
    public MusicRepository musicRepository() {
        return new MemoryMusicRepository();
    }

    @Bean
    public StreamingService streamingService() {
        return new StreamingServiceImpl(memberRepository(), musicRepository(), newUserPreListenPolicy());
    }

    @Bean
    public NewUserPreListenPolicy newUserPreListenPolicy() {
        return new FullNewUserPreListenPolicy();
    }
}
