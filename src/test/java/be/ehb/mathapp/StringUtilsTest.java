package be.ehb.mathapp;

import be.ehb.mathapp.utilities.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void checkPalindrome() {
        assertEquals(true, StringUtils.isPalindrome("racecar"));
    }
}
