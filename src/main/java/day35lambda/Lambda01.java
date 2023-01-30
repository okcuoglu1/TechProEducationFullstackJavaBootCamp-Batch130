package day35lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    /*
        1)Lambda "Functional programming" dir, digeri "Structured Programming"
        2)"Functional programming" "Ne yapmak gerekir?(What to do?)" ile ilgilenir "Nasil yapmak gerekir?(How to do?)" ile ilgilenmez.
        3)"Functional programming" Collection'lar ve Array'lerde kullanilir.
        4)Lambda, Java'ya "Java 8"de eklendi.
        5)"Functional programming" hizli ve hatasiz calisir
    */

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

        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printSquareOfOddElements(nums);

    }

    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void printElements1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");
        }
    }

    //2)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Functional)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printElements2(List<Integer> nums) {
        //12 9 131 14 9 10 4 12 15
        nums.stream().forEach(t -> System.out.print(t + " "));
    }

    //3)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void printEvenElements1(List<Integer> nums) {

        for (Integer w : nums) {

            if (w % 2 == 0) {
                System.out.print(w + " ");  //12 14 10 4 12
            }
        }
    }


    //4)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printEvenElements2(List<Integer> nums) {

        nums.//12 9 131 14 9 10 4 12 15
                stream().//Burada dikey formata geldi
                filter(t->t%2==0).//Burada cift elemanlari aldik
                forEach(t-> System.out.print(t+" "));//Burada da herbir elemanin arasina bosluk koyduk==>12 14 10 4 12

    }


    //5)Create a method to print the square of odd list elements on the console
    // in the same line with a space between two consecutive elements.
    //5)Bir Listteki tek sayi olan elemanlarin karelerini ayni satirda aralarina bosluk koyarak yazdiran methodu olustur
    public static void printSquareOfOddElements(List<Integer> nums){

        nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t + " "));

    }

//6)Create a method to print the "cube" of "distinct" "odd" list elements on the console in the same line with a space between two consecutive elements.
//  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini tekrarsiz olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)





}