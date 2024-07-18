package com.example.study.hackkerrank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SignInSignOutLogsTest {
    @Autowired
    private SignInSignOutLogs signInSignOutLogs;

    /*
    1. 로그를 파싱하여 사용자 ID, 타임스탬프, 액션을 추출합니다.
    2. 사용자 ID를 키로 하고, 로그인 및 로그아웃 타임스탬프를 값으로 하는 맵을 생성합니다.
    3. 맵을 순회하면서 로그아웃 타임스탬프와 로그인 타임스탬프의 차이가 maxSpan 이하인 사용자 ID를 찾습니다.
    4. 찾은 사용자 ID를 정렬하여 반환합니다.
     */
    @Test
    void sample() {
        List<String> logs = List.of(
                "99 1 sign-in",
                "100 10 sign-in",
                "50 20 sign-in",
                "100 15 sign-out",
                "50 26 sign-out",
                "99 2 sign-out"
        );
        int maxSpan = 5;
        List<String> expect = List.of("99", "100");
        List<String> output = signInSignOutLogs.processLogs(logs, maxSpan);
        assertEquals(expect, output);
    }

}