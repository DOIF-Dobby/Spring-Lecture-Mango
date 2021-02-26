package com.tnc.lecture.spring.respository.music;

import com.tnc.lecture.spring.entity.Music;

import java.util.HashMap;
import java.util.Map;

public class MemoryMusicRepository implements MusicRepository {
    private static final Map<Long, Music> store = new HashMap<>();

    @Override
    public void save(Music music) {
        store.put(music.getId(), music);
    }

    @Override
    public Music findById(Long musicId) {
        return store.get(musicId);
    }
}
