package com.tnc.lecture.spring;

/**
 * 보통 데이터베이스에서 시스템 설정으로 관리하는 값들을 임의로 설정
 */
public class AppConstant {
    // 신규유저가 아닌 유저들의 미리듣기 시간(초)
    public static final int OLD_USER_PRE_LISTEN_STREAMING_TIME = 60;

    // 신규 유저를 판단하는 기준 일자 (일)
    public static final int DECIDE_NEW_USER_DAY = 30;
}
