package com.example.leetcode;

public class Lc14LongestCommonPrefix {
    public static void main(String args[]) {
        String[] arr = {"flower", "flow", "flight"};
        String longPrefix = findLongestCommonPrefix(arr);
        System.out.println(longPrefix);

    }

    private static String findLongestCommonPrefix(String[] strs) {
        String longPrefix = "";
        String searchrefix = "";
        String firstWord = strs[0];
        int firstWordLen = firstWord.length();
        outerloop:
        {
            for (int i = 0; i < firstWordLen; i++) {
                searchrefix = searchrefix + firstWord.charAt(i);
                for (String str : strs) {
                    if (str.startsWith(searchrefix)) {

                    } else {
                        break outerloop;
                    }

                }
                longPrefix = longPrefix + firstWord.charAt(i);
            }
        }

        return longPrefix;
    }
}
