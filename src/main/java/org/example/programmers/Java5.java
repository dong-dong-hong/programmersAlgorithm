package org.example.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// https://school.programmers.co.kr/learn/courses/30/lessons/181870
// ad 제거하기
public class Java5 {
   static class Solution {
       public String[] solution(String[] strArr) {
           List<String> resultList = new ArrayList<>();

           for (String str : strArr) {
               if (!str.contains("ad")) {
                   resultList.add(str);
               }
           }

           return resultList.toArray(new String[0]);
       }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(new String[]{"and", "notad", "abcd"})));
        // ["and", "abcd"]

        System.out.println(Arrays.toString(solution.solution(new String[]{"there", "are", "no", "a", "ds"})));
        // ["there", "are", "no", "a", "ds"]
    }
}
