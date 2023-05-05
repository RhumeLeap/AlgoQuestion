package io.turntabl.day1;

import java.util.HashMap;
import java.util.Map;

public class Question3UsingMap {

    private final Map<Character, Integer> letterCountsMap = new HashMap<>();

    private String word;
    private char[] wordArray;

    public Question3UsingMap(String word) {
        if (!wordIsEmpty(word) && !wordIsNull(word)) {
            this.word = word.replace(" ", "").toLowerCase();
            this.wordArray = word.toCharArray();
            populateLetterCountsMap();
        }
    }

    private boolean wordIsNull(String word) {
        return word == null;
    }

    private boolean wordIsEmpty(String word) {
        return word.isEmpty();
    }
    private void populateLetterCountsMap() {
        for(int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (word.charAt(i) != ' ') {
                if (letterCountsMap.containsKey(letter)) {
                    letterCountsMap.put(letter, letterCountsMap.get(letter)+1);
                } else {
                    letterCountsMap.put(letter, 1);
                }
            }
        }
    }

    public boolean checkUnique() {
        if (this.word == null) {
            return false;
        }
        for(Map.Entry<Character, Integer> entry : letterCountsMap.entrySet()){
            if (entry.getValue() > 1)
                return false;
        }
        return true;
    }
}
