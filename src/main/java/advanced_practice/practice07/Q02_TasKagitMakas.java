package advanced_practice.practice07;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q02_TasKagitMakas {

    /*
    Taş-Kağıt-Makas oyunu yazınız.
        -Oyuncudan tahmin alınız.
        -Bilgisayarın tahmini ile karşılaştırınız.
        -3'e ilk ulaşan kazanır
        -3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor, 1 farkla kazanan Bronz Skor ile kazanır.

     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int oyuncununKazanmaSayisi = 0;
        int bilgisayarinKazanmaSayisi = 0;
        int sayac = 0;

        while (oyuncununKazanmaSayisi < 3 && bilgisayarinKazanmaSayisi < 3) {
            sayac++;
            System.out.println(sayac + ". seçimi giriniz: \nTas \nKagit \nMakas");
            String oyuncuTahmini = input.next().toLowerCase().trim();
            if (!(oyuncuTahmini.equals("tas") || oyuncuTahmini.equals("kagit") || oyuncuTahmini.equals("makas"))) {
                System.out.println("Geçerli bir tahmin giriniz");
                sayac--;
                continue;
            }


            //Bilgisayarın tahmini
            String[] arrTasKagitMakas = {"tas", "kagit", "makas"};
            int rastgeleIdx = (int) (Math.random() * 3);//0,1,2
            String bilgisayarTahmini = arrTasKagitMakas[rastgeleIdx];
            System.out.println("bilgisayarTahmini = " + bilgisayarTahmini);


            if (oyuncuTahmini.equals(bilgisayarTahmini)) {

                System.out.println("\nBerabere! Skor: " + oyuncununKazanmaSayisi + "==" + bilgisayarinKazanmaSayisi);

            } else if (oyuncuTahmini.equals("tas") && bilgisayarTahmini.equals("makas") || oyuncuTahmini.equals("kagit") && bilgisayarTahmini.equals("tas") || oyuncuTahmini.equals("makas") && bilgisayarTahmini.equals("kagit")) {
                oyuncununKazanmaSayisi++;
                System.out.println("\nKazandınız! Skor: " + oyuncununKazanmaSayisi + "==" + bilgisayarinKazanmaSayisi);


            } else {
                bilgisayarinKazanmaSayisi++;
                System.out.println("\nBilgisayar kazandı! Skor: " + oyuncununKazanmaSayisi + "==" + bilgisayarinKazanmaSayisi);

            }
        }
        System.out.println("===Oyun Bitti===");
        String skor;

        if (oyuncununKazanmaSayisi == 3) {
            if (bilgisayarinKazanmaSayisi == 0) {
                skor = "Altın";
            } else if (bilgisayarinKazanmaSayisi == 1) {
                skor = "Gümüş";
            } else {
                skor = "Bronz";
            }
            System.out.println(skor + " skor ile kazandınız! TEBRİKLER!!!");
        } else {
            if (oyuncununKazanmaSayisi == 0) {
                skor = "Altın";
            } else if (oyuncununKazanmaSayisi == 1) {
                skor = "Gümüş";
            } else {
                skor = "Bronz";
            }
            System.out.println("Bilgisayar " + skor + " skorla kazandı!!!");
        }





    }

}
