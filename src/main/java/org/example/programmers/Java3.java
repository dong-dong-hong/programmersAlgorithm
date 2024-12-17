package org.example.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/120878
// 유한소수 판별하기
public class Java3 {
    public int solution(int a, int b) {
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }

        return b == 1 ? 1 : 2;
    }

    public static void main(String[] args) {
        Java3 java3 = new Java3();

        // 테스트
        System.out.println(java3.solution(7, 20));  // 1(유한소수)
        System.out.println(java3.solution(11, 22)); // 1(유한소수)
        System.out.println(java3.solution(12, 21)); // 2(무한소수)
    }
}
