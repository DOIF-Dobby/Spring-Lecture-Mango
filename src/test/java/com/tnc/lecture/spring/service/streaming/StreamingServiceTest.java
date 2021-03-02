package com.tnc.lecture.spring.service.streaming;

import com.tnc.lecture.spring.AppConfig;
import com.tnc.lecture.spring.entity.Member;
import com.tnc.lecture.spring.entity.Music;
import com.tnc.lecture.spring.entity.Streaming;
import com.tnc.lecture.spring.entity.constant.Membership;
import com.tnc.lecture.spring.service.member.MemberService;
import com.tnc.lecture.spring.service.member.MemberServiceImpl;
import com.tnc.lecture.spring.service.music.MusicService;
import com.tnc.lecture.spring.service.music.MusicServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StreamingServiceTest {

    AppConfig appConfig = new AppConfig();
    MusicService musicService = appConfig.musicService();
    MemberService memberService = appConfig.memberService();
    StreamingService streamingService = appConfig.streamingService();

    @BeforeEach
    public void createInitData() {
        Member member = new Member(1L, "신규 유저", LocalDate.now(), Membership.NONE);
        Music music = new Music(1L, "Tell me", "원더걸스", 240);

        memberService.join(member);
        musicService.addMusic(music);
    }

    @Test
    @DisplayName("신규 유저 스트리밍 시간 테스트")
    public void createStreamingTest() throws Exception {
        // given

        // when
        Streaming musicStreaming = streamingService.createMusicStreaming(1L, 1L);

        // then
        Assertions.assertThat(musicStreaming.getStreamingTime()).isEqualTo(240);
    }
}