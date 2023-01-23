package advanced_practice.practice06;

import java.util.Scanner;

public class Q01_Ascii_Karakterler {
    //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.karakteri giriniz..");
        char ch1 = scan.next().charAt(0);
        System.out.println("2.karakteri giriniz..");
        char ch2 = scan.next().charAt(0);


       int ilk = Math.min(ch1,ch2);
       int ikinci = Math.max(ch1,ch2);

        System.out.println((char) ilk);

        for (int i=ilk; i<=ikinci; i++){

            System.out.print((char)i+" "); //typecasting yaptık yapmazsak ascii degerlerini veriyor.

        }
    }
}
