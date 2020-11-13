package com.pmprogramms;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("   "));
    }

    public static String reverseWords(final String original) {
        StringBuilder result = new StringBuilder();
        String[] words = original.split(" ");
        for (String w : words) {
            char[] characters = new char[w.length()];
            for (int i = 0; i < w.length(); i++)
                characters[i] = w.charAt(i);
            for (int j = 0; j < characters.length; j++)
                result.append(characters[characters.length - j - 1]);
            result.append(" ");
        }
        if (result.length() > 0)
            return result.substring(0, result.length() - 1);
        else
            return original;
    }
}