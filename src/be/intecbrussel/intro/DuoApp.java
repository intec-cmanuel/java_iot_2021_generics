package be.intecbrussel.intro;

import java.util.Arrays;
import java.util.Random;

public class DuoApp {
    public static void main(String[] args) {
        String s1 = "Jambon";
        String s2 = "Jean";

        int i1 = 30;
        int i2 = 15;

        Random r1 = new Random();

//        Duo<String> duo = new Duo<>(s1, s2);
//        Duo<Integer> duo2 = new Duo<>(i1, i2);
        Duo<String, Integer> duo3 = new Duo<>(s1, i1);


//        String firstString = duo.getS1();
    }
}
