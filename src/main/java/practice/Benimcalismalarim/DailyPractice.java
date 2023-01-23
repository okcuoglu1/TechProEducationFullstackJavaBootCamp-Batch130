package practice.Benimcalismalarim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DailyPractice {

    public static void main(String[] args) {


        char[] ch = {'a','b','c','d','e','f','g','h'};
        System.out.println(ch);


        reverseString(ch);


        }

    public static void reverseString(char[] s) {

        char[] ch1 = new char[s.length];
        int idx = 0;

        for(int i=s.length-1; i>=0; i--){

            ch1[idx] =s[i];
            idx++;
        }

        System.out.println(ch1);


    }
}
