package io.turntabl.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question1 {

    // Todo: Create a new list
    // Todo: Loop through the list
    // Todo: keep track of the sum of the sub-groups and maximum
    // Todo: return the maximum or highest

    public int getHighestNumber(List<String> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new NullPointerException("No elements in the list");
        }
        List<Integer> subgroupSums = new ArrayList<>();

        int subTotal = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).isEmpty()) {
                subgroupSums.add(subTotal);
                subTotal = 0;
            } else {
                subTotal += Integer.parseInt(numbers.get(i));
            }
            if (i == numbers.size()-1) {
                subgroupSums.add(subTotal);
            }
        }
        Collections.sort(subgroupSums);
        return subgroupSums.get(subgroupSums.size()-1);
    }

    public int getHighestNumber2(List<String> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new NullPointerException("No elements in the list");
        }
        int subTotal = 0;
        int highest = Integer.MIN_VALUE;

        for (String number : numbers) {
            if (number.isEmpty()) {
                highest = Math.max(subTotal, highest);
                subTotal = 0;
            } else {
                subTotal += Integer.parseInt(number);
            }
        }
        highest = Math.max(subTotal, highest);
        return highest;
    }
}
