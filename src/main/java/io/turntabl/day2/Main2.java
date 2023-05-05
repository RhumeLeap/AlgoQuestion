package io.turntabl.day2;

import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<String> nums = List.of("1", "2", "", "40", "2", "", "2");

        Question1 question1 = new Question1();
        System.out.println(question1.getHighestNumber(nums));
    }
}
