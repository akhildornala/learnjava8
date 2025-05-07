package com.example.test;

public class StringAnagram {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    private static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[256]; // Assuming ASCII

        for (int i = 0; i < str1.length(); i++) {
//            System.out.println(str1.charAt(i));
            System.out.println(charCount[str1.charAt(i)]);
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
