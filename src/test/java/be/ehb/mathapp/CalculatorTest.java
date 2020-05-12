package be.ehb.mathapp;

import be.ehb.mathapp.utilities.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void shouldAdd(){
        assertEquals(25, Calculator.sum(15,10));
    }

    @Test
    public void shouldAddNegative() {
        assertEquals(5, Calculator.sum(7,-2));
    }

    @ParameterizedTest
    @ValueSource(ints = {42,-8,0,756845})
    public void shouldBeAbsolute(int param) {
        assertTrue(Calculator.absoluteValue(param) >= 0);
    }

    //Oef 1
    @Test
    public void checkPow() {
        assertEquals(4, Calculator.power(2,2));
    }

    //Oef 2
    @Test
    public void checkDivide() {
        assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Calculator.divide(1,0);
            }
        });
    }

    //Oef 3
    @Test
    public void checkFactorial() {
        assertEquals(720, Calculator.factorial(6));
    }
}
