package com.tnc.lecture.spring.respository.music;

import com.tnc.lecture.spring.entity.Music;

public class JdbcMusicRepository implements MusicRepository {
    @Override
    public void save(Music music) {

    }

    @Override
    public Music findById(Long musicId) {
        return null;
    }
}
