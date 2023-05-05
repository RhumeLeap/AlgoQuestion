package io.turntabl.day1;

import java.util.Arrays;

/**
 * 4) Given an array of characters, replace all of the spaces with '%20'.
 * You can assume the array is large enough to hold the modified string.
 */

public class Question4 {

    public char[] replaceAllSpaceWith1(char[] arr) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                sb.append("%20");
            } else {
                sb.append(arr[i]);
            }
        }
        return sb.toString().toCharArray();
    }

    public char[] replaceAllSpaceWith2(char[] array) {
        String str = String.copyValueOf(array);
        str = str.replace(" ", "%20");
        return str.toCharArray();
    }

}
