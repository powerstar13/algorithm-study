package com.example.study.hackkerrank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ClosestColorTest {
    @Autowired
    private ClosestColor closestColor;

    /*
    1. 각 픽셀에 대해, RGB 값을 추출합니다. 이는 24비트 이진 문자열에서 첫 8비트는 빨간색, 중간 8비트는 녹색, 마지막 8비트는 파란색을 나타냅니다.
    2. 각 픽셀에 대해, 주어진 RGB 값과 각 순수 색상 (빨강, 녹색, 파랑, 검정, 흰색) 사이의 유클리드 거리를 계산합니다.
    3. 각 픽셀에 대해, 가장 가까운 색상을 찾습니다. 만약 두 가지 이상의 색상이 동일한 거리를 가지면, 'Ambiguous'를 반환합니다.
     */
    @Test
    void sample() {
        List<String> pixels = Arrays.asList("101111010110011011100100", "110000010101011111101111", "100110101100111111101101", "010111011010010110000011", "000000001111111111111111");
        List<String> expected = Arrays.asList("White", "White", "White", "Green", "Ambiguous");
        List<String> result = closestColor.closestColor(pixels);

        assertEquals(expected, result);
    }
}