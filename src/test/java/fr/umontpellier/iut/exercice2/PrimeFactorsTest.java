package fr.umontpellier.iut.exercice2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class PrimeFactorsTest {
    private PrimeFactors primeFactors = new PrimeFactors();


    private ArrayList<Integer> list(int... ints) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : ints)
            list.add(i);
        return list;
    }



    @Test
    public void one_should_give_empty() {
        assertEquals(list(), primeFactors.computeFactors(1));
    }



    @Test
    public void two_should_give_2() {
        assertEquals(list(2), primeFactors.computeFactors(2));
    }



    @Test
    public void three_should_give_3() {
        assertEquals(list(3), primeFactors.computeFactors(3));
    }



    @Test
    public void four_should_give_2_and_2() {
        assertEquals(list(2, 2), primeFactors.computeFactors(4));
    }



    @Test
    public void five_should_give_5() {
        assertEquals(list(5), primeFactors.computeFactors(5));
    }



    @Test
    public void six_should_give_2_and_3() {
        assertEquals(list(2, 3), primeFactors.computeFactors(6));
    }


    @Test
    public void seven_should_give_7() {
        assertEquals(list(7), primeFactors.computeFactors(7));
    }



    @Test
    public void eight_should_give_2() {
        assertEquals(list(2, 2, 2), primeFactors.computeFactors(8));
    }


    @Test
    public void nine_should_give_3() {
        assertEquals(list(3, 3), primeFactors.computeFactors(9));
    }


    @Test
    public void ten_should_give_10() {
        assertEquals(list(2, 5), primeFactors.computeFactors(10));
    }


    @Test
    public void four_thousand_one_hundred_fifty_eight_should_give_2_3_3_3_7_11() {
        assertEquals(list(2, 3, 3, 3, 7, 11), primeFactors.computeFactors(4158));
    }

    @Test
    public void eight_thousand_three_hundred_twenty_six_should_give_2_23_181() {
        assertEquals(list(2, 23, 181), primeFactors.computeFactors(8326));
    }

    @Test
    public void thirty_thousand_forty_five_should_give_3_5_2003() {
        assertEquals(list(3, 5, 2003), primeFactors.computeFactors(30045));
    }

}