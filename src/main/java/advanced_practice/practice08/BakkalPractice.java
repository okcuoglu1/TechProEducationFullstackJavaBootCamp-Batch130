package advanced_practice.practice08;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BakkalPractice {



    /*
        Bakkal günlük gelir programı yazınız.
     -Tüm günlerin gelirlerini gösteren bir method,
     -Haftalık gelir ortalamasını gösteren bir method,
     -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelire eşit olduğunu gösteren bir method oluşturunuz.

   */

    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));

    static List<Double> gunlukKazanclar = new ArrayList<>();


    static double toplamkazanc = 0;

    public static void main(String[] args) throws InterruptedException {


        gunlukKazancGirisi();
        gunlukKazancYazdir();
        yazdir();








    }//main

    public static void gunlukKazancGirisi(){
        Scanner input = new Scanner(System.in);


        int gun = 0;

        while(gun<7){

            System.out.print(gunler.get(gun) + " gününün kazancını giriniz : ");
            double kazanc = input.nextDouble();
            gunlukKazanclar.add(kazanc);
            toplamkazanc += kazanc;

            gun++;
        }


    }



    public static void gunlukKazancYazdir(){

        int gun = 0;
        int gunlukKazanclarIdx = 0;
        while(gun<7){

            System.out.println(gunler.get(gun) + " gününün kazancı : " + gunlukKazanclar.get(gunlukKazanclarIdx));

            gun++;
            gunlukKazanclarIdx++;

        }

    }



    public static void yazdir() throws InterruptedException {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Thread.sleep(30);

        System.out.println("Haftalık Toplam Kazanç : " + toplamkazanc);
        System.out.println("Haftalık ortalama gelir : " + decimalFormat.format(ortalamaGelir()));
        System.out.println("Ortalama Üstü Günler : " + ortalamaUstuGunler());
        System.out.println("Ortalama Altı Günler : " + ortalamaAltiGunler());

        if(ortalamaGunler().isEmpty()){
            System.out.println("Ortalamaya eşit bir gün yok");
        }else {
            System.out.println("Ortalamaya eşit olan günler : " + ortalamaGunler());
        }






    }



    static double ortalamaGelir(){
        return toplamkazanc/7;
    }

    static String ortalamaUstuGunler(){

        String ortalamaUstuGunler = "";
        for (int i=0; i<7; i++){

            if(gunlukKazanclar.get(i)>ortalamaGelir()){

                ortalamaUstuGunler += gunler.get(i) + " : " + gunlukKazanclar.get(i) + " | ";
            }
        }
        return ortalamaUstuGunler;
    }

    static String ortalamaAltiGunler(){

        String ortalamaAltiGunler = "";

        for (int i=0; i<7; i++){

            if(gunlukKazanclar.get(i)<ortalamaGelir()){

                ortalamaAltiGunler  += gunler.get(i) + " : " + gunlukKazanclar.get(i) + " | ";
            }
        }

        return ortalamaAltiGunler;
    }


    static String ortalamaGunler(){

        String ortalamGunler = "";


        for (int i=0; i<7; i++){

            if(gunlukKazanclar.get(i)==ortalamaGelir()){

                ortalamGunler  += gunler.get(i) + " : " + gunlukKazanclar.get(i) + " | ";
            }
        }

        return ortalamGunler;
    }


}
