package com.example.study.coderpad;

import io.micrometer.common.util.StringUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
class Healingpaper {
    /**
     * list 배열과 count를 입력받아 count 만큼 요소들이 왼쪽 회전 이동된 배열을 반환하는 함수를 구현해주세요.
     * 단, 입력된 배열은 변하지 않아야 합니다.
     *
     * [조건]
     * 문제와 동일하거나 플랫폼 제공 기능을 사용하지 않아야 합니다.
     * 예: shift(), unshift(), push(), pop()
     *
     * 입력된 목록은 변하지 않아야 합니다.
     *
     * list의 크기보다 작은 0과 같거나 큰 count를 입력받아 회전된 값을 반환합니다.
     * input: list = [1, 2, 3, 4, 5], count = 2
     * output: [3, 4, 5, 1, 2]
     *
     * list의 크기보다 큰 count를 입력받아 회전된 값을 반환합니다.
     * input: list = [1, 2, 3, 4, 5], count = 8
     * output: [4, 5, 1, 2, 3]
     *
     * 0보다 작은 count를 입력받아 회전된 값을 반환합니다.
     * input: list = [1, 2, 3, 4, 5], count = -1
     * output: [5, 1, 2, 3, 4]
     */
    public List<Integer> rotateList(List<Integer> list, int count) {
        ArrayList<Integer> result = new ArrayList<>(list);
        int size = list.size();
        if (size < count) count = count - size;
        else if (count < 0) count = size + count;
        for (int i = 0; i < count; i++) {
            result.add(result.remove(0));
        }
        return result;
    }

    /**
     * 문자열로 표현된 정수를 정수값으로 변환하는 함수를 작성해주세요.
     *
     * [조건]
     * 문제와 동일하거나 유사한 플랫폼 제공 기능을 사용하지 않아야 합니다.
     * 예: Number(s), s * 1
     *
     * 문자열의 내용이 양의 정수인 경우, 정수값으로 변환한 값을 반환합니다.
     * 입력: "123"
     * 출력: 123
     *
     * 문자열의 내용이 정수가 아닌 경우는 null을 반환합니다.
     * 입력: "123.456"
     * 출력: null
     *
     * 문자열의 내용이 음의 정수인 경우, 정수값으로 변환한 값을 반환합니다.
     * 입력: "-123"
     * 출력: -123
     */
    public Integer stringToInteger(String s) {
        if (StringUtils.isBlank(s)) return null;
        int result = 0;
        int start = 0;
        int sign = 1;
        if (s.charAt(0) == '-') {
            sign = -1;
            start = 1;
        }
        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || '9' < c) return null;
            result = result * 10 + (c - '0');
        }
        return result * sign;
    }
}
