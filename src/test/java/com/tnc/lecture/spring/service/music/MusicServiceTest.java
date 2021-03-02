package com.tnc.lecture.spring.service.music;

import com.tnc.lecture.spring.AppConfig;
import com.tnc.lecture.spring.entity.Music;
import com.tnc.lecture.spring.service.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicServiceTest {
//    MusicService musicService = new MusicServiceImpl();
    AppConfig appConfig = new AppConfig();
    MusicService musicService = appConfig.musicService();

    @Test
    @DisplayName("음악 추가 테스트")
    public void addMusicTest() throws Exception {
        // given
        Music music = new Music(1L, "Tell Me", "원더걸스", 240);

        // when
        musicService.addMusic(music);
        Music findMusic = musicService.findMusic(1L);

        // then
        Assertions.assertThat(music).isEqualTo(findMusic);
    }
}