package fr.umontpellier.iut.exercice2;

import java.util.ArrayList;

public class PrimeFactors {
    public ArrayList<Integer> computeFactors(int number) {
        ArrayList<Integer> tab1 = new ArrayList<>();

        int i = 2;
            while(i <= number){
                if(number == i){
                    number = number / i;
                    tab1.add(i);
                }
                else if(number % i ==0){
                    number = number/i;
                    tab1.add(i);
                    if(number > i && number % 2 ==0){
                        number = number/ i;
                        tab1.add(i);
                    } else {
                        i = number;
                    }
                    tab1.add(i);
                }

                i++;
            }

        return tab1;

    }
}
