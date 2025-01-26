package org.example.programmers.java;

import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/120812?language=java
// 최빈값 구하기
public class Java2 {
    public static int solution(int[] array) {
//        HashMap<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            // key와 맵핑된 value값을 반환하고 없으면 defaultValue값을 반환
        }

        int maxCount = 0; // 최빈값 카운트
        int mode = -1; // 최빈값
        int checkMode = 0; // 최빈값 체크

        for (int frequency : map.values()) {
            if (frequency > maxCount) {
                maxCount = frequency;
                checkMode = 1;
            } else if (frequency == maxCount) {
                checkMode++; // 같은 값 있으면 또 증가
            }
        }

        // 최빈값이 두개이상인 경우
        if (checkMode > 1) {
            return -1;
        }
        // 최빈값 결과
        for (int key : map.keySet()) { // 모든 key 값을 가진 Set 데이터를 반환
            if (map.get(key) == maxCount) {
                mode = key;
                break;
            }
        }
        return mode;
    }
    public static void main(String[] args) {
        // 테스트
        int[] array1 = {1, 2, 3, 3, 3, 4};
        System.out.println(solution(array1)); // 3
        int[] array2 = {1, 1, 2, 2};
        System.out.println(solution(array2)); // -1
        int[] array3 = {1};
        System.out.println(solution(array3)); // 1
    }
}
