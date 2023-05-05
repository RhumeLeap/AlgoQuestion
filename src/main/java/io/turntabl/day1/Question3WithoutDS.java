package io.turntabl.day1;

import java.util.Arrays;

public class Question3WithoutDS {

    public Question3WithoutDS(String word) {}

    /** Running time is O(n). */
    public boolean checkUnique(String word) {
        if (word.isEmpty()) return false;
        if (word == null) return false;

        word = word.replace(" ", "").toLowerCase();
        char[] letterChar = word.toCharArray();

        Arrays.sort(letterChar);

        for(int i = 1; i < letterChar.length; i++) {
            if (letterChar[i-1] == letterChar[i]) {
                return false;
            }
        }
        return true;
    }
}
