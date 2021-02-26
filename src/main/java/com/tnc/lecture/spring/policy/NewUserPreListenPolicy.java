package com.tnc.lecture.spring.policy;

import com.tnc.lecture.spring.entity.Member;
import com.tnc.lecture.spring.entity.Music;

public interface NewUserPreListenPolicy {

    int getPreListenStreamingTime(Member member, Music music);
}
