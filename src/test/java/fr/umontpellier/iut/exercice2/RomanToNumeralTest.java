package fr.umontpellier.iut.exercice2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RomanToNumeralTest {
    private RomanToNumeral romanToNumeral = new RomanToNumeral();

    @Disabled
    @Test
    public void string_I_should_return_1() {
        int number = romanToNumeral.getNumeral("I");
        assertEquals(number,1);
    }

    @Disabled
    @Test
    public void string_V_should_return_5() {
        int number = romanToNumeral.getNumeral("V");
        assertEquals(number,5);
    }

    @Disabled
    @Test
    public void string_X_should_return_10() {
        int number = romanToNumeral.getNumeral("X");
        assertEquals(number,10);
    }

    @Disabled
    @Test
    public void string_II_should_return_2() {
        int number = romanToNumeral.getNumeral("II");
        assertEquals(number,2);
    }

    @Disabled
    @Test
    public void string_III_should_return_3() {
        int number = romanToNumeral.getNumeral("III");
        assertEquals(number,3);
    }

    @Disabled
    @Test
    public void string_IV_should_return_4() {
        int number = romanToNumeral.getNumeral("IV");
        assertEquals(number,4);
    }

    @Disabled
    @Test
    public void string_VI_should_return_6() {
        int number = romanToNumeral.getNumeral("VI");
        assertEquals(number,6);
    }

}