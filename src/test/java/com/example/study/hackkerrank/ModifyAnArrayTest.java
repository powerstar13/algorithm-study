package com.example.study.hackkerrank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ModifyAnArrayTest {
    @Autowired
    private ModifyAnArray modifyAnArray;

    /*
    1. 먼저, 배열을 오름차순으로 정렬하는 데 필요한 최소 비용을 계산합니다. 이를 위해 배열을 순회하면서 현재 요소가 이전 요소보다 작은 경우, 이전 요소와 같거나 크게 만들기 위해 필요한 비용을 누적합니다.
    2. 다음으로, 배열을 내림차순으로 정렬하는 데 필요한 최소 비용을 계산합니다. 이를 위해 배열을 순회하면서 현재 요소가 이전 요소보다 큰 경우, 이전 요소와 같거나 작게 만들기 위해 필요한 비용을 누적합니다.
    3. 마지막으로, 오름차순 정렬과 내림차순 정렬에 필요한 비용 중 작은 값을 반환합니다.
     */
    @Test
    void sample1() {
        List<Integer> arr = List.of(0, 1, 2, 5, 6, 5, 7);
        int output = 1;
        assertEquals(output, modifyAnArray.modifyArray(arr));
    }

    @Test
    void sample2() {
        List<Integer> arr = List.of(9, 8, 7, 2, 3, 3);
        int output = 1;
        assertEquals(output, modifyAnArray.modifyArray(arr));
    }
}