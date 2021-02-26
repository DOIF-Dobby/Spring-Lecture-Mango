package com.tnc.lecture.spring.service.music;

import com.tnc.lecture.spring.entity.Music;

public interface MusicService {

    void addMusic(Music music);

    Music findMusic(Long musicId);
}
