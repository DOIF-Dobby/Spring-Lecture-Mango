package com.tnc.lecture.spring.service.streaming;

import com.tnc.lecture.spring.entity.Member;
import com.tnc.lecture.spring.entity.Music;
import com.tnc.lecture.spring.entity.Streaming;
import com.tnc.lecture.spring.entity.constant.Membership;
import com.tnc.lecture.spring.service.member.MemberService;
import com.tnc.lecture.spring.service.member.MemberServiceImpl;
import com.tnc.lecture.spring.service.music.MusicService;
import com.tnc.lecture.spring.service.music.MusicServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StreamingServiceTest {

    MemberService memberService = new MemberServiceImpl();
    MusicService musicService = new MusicServiceImpl();
    StreamingService streamingService = new StreamingServiceImpl();

    @BeforeEach
    public void createInitData() {
        Member member = new Member(1L, "신규 유저", LocalDate.now(), Membership.NONE);
        Music music = new Music(1L, "Tell me", "원더걸스", 240);

        memberService.join(member);
        musicService.addMusic(music);
    }

    @Test
    public void createStreamingTest() throws Exception {
        // given

        // when
        Streaming musicStreaming = streamingService.createMusicStreaming(1L, 1L);

        // then
        System.out.println("musicStreaming = " + musicStreaming);
    }

}