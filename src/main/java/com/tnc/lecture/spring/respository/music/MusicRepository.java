package com.tnc.lecture.spring.respository.music;

import com.tnc.lecture.spring.entity.Music;

public interface MusicRepository {

    void save(Music music);

    Music findById(Long musicId);
}
