package be.ehb.mathapp.utilities;

import java.util.Scanner;

public class StringUtils {

    public static boolean isPalindrome(String original) {
        String reverse = "";
        int length = original.length();
        for (int i = length - 1; i >=  0; i--)
        reverse = reverse + original.charAt(i);

        if (original.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }
}
