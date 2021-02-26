package com.tnc.lecture.spring.policy;

import com.tnc.lecture.spring.entity.Member;
import com.tnc.lecture.spring.entity.Music;
import com.tnc.lecture.spring.AppConstant;

public class HalfNewUserPreListenPolicy implements NewUserPreListenPolicy {
    @Override
    public int getPreListenStreamingTime(Member member, Music music) {
        // 신규유저 혜택
        if(member.isNewUser()) {
            return music.getPlayTime() / 2;
        }

        // 맴버십이 없고 신규유저가 아니면 default 시간 스트리밍
        return AppConstant.OLD_USER_PRE_LISTEN_STREAMING_TIME;
    }
}
