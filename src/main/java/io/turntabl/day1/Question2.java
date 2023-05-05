package io.turntabl.day1;

public class Question2 {

    /** Compare the start and end letter while incrementing the start
     * and decrementing the stop and comparing until the middle letter is reached.
     * Running time is O(n/2) */
    public boolean isPalindrome1(String string) {
        if (string.isEmpty() || string == null) return false;

        int start = 0, stop = string.length()-1;
        int mid = (stop - start)/2;

        for (int i = 0, j = stop; i <= mid; i++, j--) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    /** Using recursion
     * Running time is O(n/2). */
    public boolean isPalindrome2(String str) {
        if (str.isEmpty() || str == null) return false;

        int start = 0, stop = str.length()-1;

        if (str.charAt(start) != str.charAt(stop)) {
            return false;
        } else {
            return str.charAt(0) == str.charAt(str.length() - 1) &&
                    isPalindrome2(str.substring(start + 1, stop - 1));
        }
    }

    /** Using string reversal.
     * Running time is O(n). */
    public boolean isPalindrome3(String string) {
        if (string.isEmpty() || string == null) return false;

        StringBuilder newString = new StringBuilder();
        for (int i = string.length()-1; i >= 0; i--) {
            newString.append(string.charAt(i));
        }
        return string.equals(newString);
    }
}
