package day35lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01Practice {


    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printSquareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);

    }

    public static void printElements(List<Integer> nums){

        nums.stream().forEach(t -> System.out.print(t + " "));
    }

    public static void printEvenElements2(List<Integer> nums){

        nums.
                stream().
                filter(t->t%2==0).
                forEach(t-> System.out.print(t + " "));
    }
    public static void printSquareOfOddElements(List<Integer> nums){

        nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t + " "));
    }

    public static void printCubeOfDistinctOddElements(List<Integer> nums){


        nums.
                stream().
                distinct().
                filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.print(t + " "));



    }


}
