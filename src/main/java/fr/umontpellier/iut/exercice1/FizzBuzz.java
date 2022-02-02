package fr.umontpellier.iut.exercice1;

public class FizzBuzz {

    public String getValue(int i) {
        String a = null;

            if(i % 3 == 0 && i % 5 ==0){
                a ="FizzBuzz";
            }
            else if(i % 5 == 0){
                a = "Buzz";
            }
            else if(i % 3 == 0){
                a ="Fizz";
            } else {
                a = i + "";
            }

        return a;
    }
    public String[] computeList(int i) {
        String[] fb = new String[i];
        for(int n = 0; n < i; n++){
            fb[n] = getValue(n+1);
        }
        return fb;
    }
}
