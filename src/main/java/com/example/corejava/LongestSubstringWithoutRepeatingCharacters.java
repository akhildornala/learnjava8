package com.example.corejava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String input = "abcdabcefgbbe";
        int max = longestUniqueSubstring(input);
        System.out.println(max);
        String res = solution(input);
        System.out.println(res);
    }

    private static String solution(String input) {
        List<String> ls = Arrays.asList(input.split(""));
        int len = ls.size();
        String longest = "";
        for (int i = 0; i < len; i++) {
            String first = ls.get(i);
            for (int j = i + 1; j < len; j++) {
                if(first.contains(ls.get(j))){
                 break;
                }
                first = first + ls.get(j);
//                System.out.println(first);
            }
            if(first.length()>longest.length()){
                longest = first;
            }
        }

        return longest;
    }

    public static int longestUniqueSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0, i = 0, j = 0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
