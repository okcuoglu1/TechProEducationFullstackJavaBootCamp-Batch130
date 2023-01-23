package day19listsvarargs;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {

    public static void main(String[] args) {

        //Example 1: Verilen bir list'teki elemanlari tekrarsiz olarak yazdiriniz.
        //          [2, 3, 2, 2, 3, 5] ==> [2, 3, 5]

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);

        List<Integer> newList = new ArrayList<>();

        for (int w : myList) {

            if(!newList.contains(w)){
                newList.add(w);
            }


        }
        System.out.println(newList);

        //Example 2: Müşteriden ürün ismini alınız
        //           Müşterinin ismini verdigi urun listede varsa urun isimini yazdırınız.
        //           Müşterinin ismini verdigi urun listede yoksa "out of stock" yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Urun arama sistemimize hoşgeldiniz....");
        System.out.println("Urun aramayi sonlandirmak icin Q'ya basınız...");


        List<String> products = new ArrayList<>();

        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobile Phone");


        do{
            System.out.println("Aradiginiz urunun ismini giriniz....");

            String product = input.nextLine();

            if(product.equalsIgnoreCase("Q")){
                break;
            }
            else if(products.contains(product + " is in stock")){
                System.out.println(product);
            }else {
                System.out.println( product + " is out of stock!....");
            }

        }while (true);
        System.out.println("Sitemizi kullandiginiz icin tesekkur eder, tekrar bekleriz..");







    }
}
