package com.tnc.lecture.spring.service.music;

import com.tnc.lecture.spring.entity.Music;
import com.tnc.lecture.spring.respository.music.MemoryMusicRepository;
import com.tnc.lecture.spring.respository.music.MusicRepository;

public class MusicServiceImpl implements MusicService{
    private final MusicRepository musicRepository = new MemoryMusicRepository();

    @Override
    public void addMusic(Music music) {
        musicRepository.save(music);
    }

    @Override
    public Music findMusic(Long musicId) {
        return musicRepository.findById(musicId);
    }
}
