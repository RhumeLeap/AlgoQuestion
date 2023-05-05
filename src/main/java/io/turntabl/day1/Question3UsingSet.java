package io.turntabl.day1;

import java.util.HashSet;
import java.util.Set;

public class Question3UsingSet {

    private Set<Character> letterSet = new HashSet<>();
    private String word;
    private char[] letterChar;

    public Question3UsingSet(String word) {
        if (!word.isEmpty() && word != null) {
            this.word = word.replace(" ", "").toLowerCase();
            letterChar = word.toCharArray();
            populateSet();
        }
    }

    private void populateSet() {
        for(char letter : letterChar) {
            letterSet.add(letter);
        }
    }

    public boolean checkUnique() {
        if (this.word == null) return false;
        return letterSet.size() == word.length();
    }

    private String removeWhiteSpacesInWord(String word) {
        String newStr = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                newStr += word.charAt(i);
            }
        }
        return newStr;
    }
}
