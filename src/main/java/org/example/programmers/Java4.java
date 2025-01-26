package org.example.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/181934?language=java
// 조건 문자열
public class Java4 {
    static class Solution {
        public int solution(String ineq, String eq, int n, int m) {
            if (ineq.equals("<")) {
                if (eq.equals("=")) {
                    return n <= m ? 1 : 0;
                } else {
                    return n < m ? 1 : 0;
                }
            } else if (ineq.equals(">")) {
                if (eq.equals("=")) {
                    return n >= m ? 1 : 0;
                } else {
                    return n > m ? 1 : 0;
                }
            }
            return 0;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();

            System.out.println(solution.solution("<", "=", 20, 50));
            System.out.println(solution.solution(">", "!", 41, 78));
            System.out.println(solution.solution("<", "!", 10, 30));
            System.out.println(solution.solution(">", "=", 100, 99));
            System.out.println(solution.solution("<", "!", 50, 50));
        }
    }
}

