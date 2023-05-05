package io.turntabl.day1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main1(String[] args) {
        List<String> words = List.of("we", "glad", "are", "happy", "we", "glad", "glad",
                "sal", "are", "are", "sal", "glad", "are", "sal", "happy", "glad");
        ArrayList<String> wordList = new ArrayList<>();
        wordList.addAll(words);
        System.out.println(wordList);

        Question1 question1 = new Question1();
        List<String> ans = question1.mostCommonWords(wordList);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Question4 question4 = new Question4();
        char[] array1 = {'a', ' ', 'r', 'e', ' ', 'f'};
        System.out.println(question4.replaceAllSpaceWith1(array1));
    }
}
