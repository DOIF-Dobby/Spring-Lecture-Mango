package com.tnc.lecture.spring.service.streaming;

import com.tnc.lecture.spring.entity.Streaming;

public interface StreamingService {

    Streaming createMusicStreaming(Long memberId, Long musicId);
}
