package io.turntabl.day1;

import java.util.HashMap;
import java.util.Map;

public class Question5 {

    public boolean permissionOfAPalindrome(String str) {
        Map<Character, Integer> letterMap = new HashMap<>();
        String newStr = str.replace(" ", "");

        for(int i = 0; i < newStr.length(); i++) {
            char letter = newStr.charAt(i);
            if (letterMap.containsKey(letter)) {
                letterMap.put(letter, letterMap.get(letter)-1);
            } else {
                letterMap.put(letter, 1);
            }
        }

        char[] strArray = str.toCharArray();



        return false;
    }
}
