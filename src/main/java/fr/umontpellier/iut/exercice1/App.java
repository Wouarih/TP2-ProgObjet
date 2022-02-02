package fr.umontpellier.iut.exercice1;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        FizzBuzz fb1;
        fb1 = new FizzBuzz();

        System.out.println(Arrays.toString(fb1.computeList(40)));
        System.out.println(fb1.getValue(3));

    }
}
