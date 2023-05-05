package io.turntabl.day1;

import java.util.*;
import java.util.stream.Collectors;

public class Question1 {

    public List<String> mostCommonWords(ArrayList<String> words) {

        if (words.size() == 0 || words == null) {return null;}
        if (words.size() < 2) {return words;}

        List<String> top3CommonWords = new ArrayList<>();
        List<String> least3CommonWords = new ArrayList<>();

        ArrayList<String> newWords = words;
        Collections.sort(newWords);

        Map<String, Integer> wordMap = new HashMap<>();

        for(int i = 0; i < newWords.size(); ) {
            String aWord = newWords.get(i);
            int lastIndex = newWords.lastIndexOf(aWord);
            int freqOfWord = lastIndex - i + 1;
            wordMap.put(aWord, freqOfWord);
            i = lastIndex+1;
        }

        top3CommonWords = getTopThreeWords(wordMap).stream().toList();

        return top3CommonWords;
    }

    private Set<String> getTopThreeWords(Map<String, Integer> wordMap) {
        Set<String> top3CommonWords = new HashSet<>();
        List<Integer> freqs = wordMap.values().stream().sorted().collect(Collectors.toList());
        int first = freqs.get(freqs.size()-1);
        int second = freqs.get(freqs.size()-2);
        int third = freqs.get(freqs.size()-3);
        int counter = 0;

        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() == first || entry.getValue() == second || entry.getValue() == third) {
                top3CommonWords.add(entry.getKey());
                counter++;
            }
            if (counter == 3) break;
        }
        return top3CommonWords;
    }
}
