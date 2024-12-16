package org.example.programmers;

import java.util.HashSet;
import java.util.Set;
// https://school.programmers.co.kr/learn/courses/30/lessons/120866
// 안전지대 문제
public class Java1 {
    public static class Solution {
        public int solution(int[][] board) {
            int n = board.length; // 세로 크기
            int m = board[0].length; //가로 크기
            int answer = 0;

            Set<String> dangerZone = new HashSet<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (board[i][j] == 1) {  // 지뢰o
                        for (int dx = -1; dx <= 1; dx++) {
                            for (int dy = -1; dy <= 1; dy++) {
                                int newX = i + dx;
                                int newY = j + dy;
                                if (newX >= 0 && newX < n && newY >= 0 && newY < m) {
                                    if (board[newX][newY] == 0) {
                                        dangerZone.add(newX + "," + newY);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) { // 지뢰x
                    if (board[i][j] == 0 && !dangerZone.contains(i + "," + j)) {
                        answer++;
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Java1 instance = new Java1();
        Solution solution = new Solution();

        // 테스트1
        int[][] board1 = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        };
        System.out.println(solution.solution(board1)); // 16

        // 테스트2
        int[][] board2 = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0}
        };
        System.out.println(solution.solution(board2)); // 7

        // 테스트3
        int[][] board3 = {
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}
        };
        System.out.println(solution.solution(board3)); // 0
    }
}
