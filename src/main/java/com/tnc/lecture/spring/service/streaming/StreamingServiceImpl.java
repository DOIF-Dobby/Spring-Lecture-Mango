package com.tnc.lecture.spring.service.streaming;

import com.tnc.lecture.spring.entity.Member;
import com.tnc.lecture.spring.entity.Music;
import com.tnc.lecture.spring.entity.Streaming;
import com.tnc.lecture.spring.entity.constant.Membership;
import com.tnc.lecture.spring.policy.NewUserPreListenPolicy;
import com.tnc.lecture.spring.respository.member.MemberRepository;
import com.tnc.lecture.spring.respository.music.MusicRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StreamingServiceImpl implements StreamingService {

    private final MemberRepository memberRepository;
    private final MusicRepository musicRepository;
    private final NewUserPreListenPolicy newUserPreListenPolicy;

    @Override
    public Streaming createMusicStreaming(Long memberId, Long musicId) {
        Member member = memberRepository.findById(memberId);
        Music music = musicRepository.findById(musicId);

        // 음악 스트리밍 시간을 구해야 하는데,
        // 스트리밍 요청을 한 Member가 맴버십이 "NONE"이면 "신규유저 미리듣기 정책"에서 설정한 만큼 스트리밍하고
        // 그렇지 않으면 Music의 playTime 만큼 스트리밍한다.
        int preListenStreamingTime = member.getMembership().equals(Membership.NONE)
                ? newUserPreListenPolicy.getPreListenStreamingTime(member, music)
                : music.getPlayTime();

        return new Streaming(member, music, preListenStreamingTime);
    }
}
