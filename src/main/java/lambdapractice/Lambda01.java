package lambdapractice;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8)); //elemanlari bu sekilde ekledik icine

       ciftVePozitifLamExYazdir(sayi);
       System.out.println("\n******");

       ciftVePozitifMetRef(sayi);
       System.out.println("\n******");

       kareBul(sayi);
       System.out.println("\n******");

       kareTekrarsizYazdir(sayi);
       System.out.println("\n******");

       buyuktenKucugeSiralayarakYazdir(sayi);
       System.out.println("\n******");

       pozitifKupBirlerBas5(sayi);
       System.out.println("\n******");

       toplamMetRef(sayi);
       System.out.println("\n******");

       toplamLambdaEx(sayi);
       System.out.println("\n******");

       System.out.println(pozitifElCarpimLamEx(sayi));
       System.out.println("\n******");

        System.out.println(ciftElKareKucuktenBuyugeListReturn(sayi));
        System.out.println("\n******");

    }

        //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın.

    public static void ciftVePozitifLamExYazdir(List<Integer> sayi){
        sayi.stream().filter(t -> t %2 == 0 && t>0).forEach(t -> System.out.print(t + " ")); //12 6 8
    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitifMetRef(List<Integer> sayi){
        sayi.stream().filter(t -> t %2 == 0 && t>0).forEach(Utils :: yazdir); //12 6 8
    }

    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void kareBul(List<Integer> sayi){
        sayi.stream().map(Utils :: kareBul).forEach(Utils :: yazdir); //25 144 0 1 144 25 25 36 81 225 64
    }

    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void kareTekrarsizYazdir(List<Integer> sayi){
        sayi.stream().distinct().map(Utils :: kareBul).forEach(Utils :: yazdir); //25 144 0 1 144 25 36 81 225 64
    }

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyuktenKucugeSiralayarakYazdir(List<Integer> sayi) {
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir); //15 12 9 8 6 5 5 1 0 -5 -12
    }

    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void pozitifKupBirlerBas5 (List<Integer> sayi){
        sayi.
                stream().
                filter(t -> t>0).
                map(t -> t * t * t).
                filter(t->t%10==5).
                forEach(Utils::yazdir); //125 125 3375
    }

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static void toplamMetRef(List<Integer> sayi){
        Optional<Integer> sonuc = sayi.stream().reduce(Integer :: sum);
        System.out.println(sonuc); //Optional[44]
        //reduce tek bir deger sonucu dondurur toplamini aldi
        //reduce method terminal method'dur sonrasinda foreach gibi hicbir method kullanamayiz
        //optinal'a assign neden eder:null olma ihtimali var diye risk almak istemiyor, ya akista hicbir eleman yoksa diye hata verebilir
        //alttakinde her turlu bi deger verdigimiz icin ici bos(null) olma riski onda yok, bunda var, java null'u int kabul etmez
    }

    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    public static void toplamLambdaEx(List<Integer> sayi) {
        int sonuc = sayi.stream().reduce(0, (t, u) -> t + u);
        System.out.println(sonuc); //44
        //identity ilk degeri 0 olarak biz verdik
        //toplamada etkisiz eleman 0, ilk deger identity alir, ikinci deger akistan gelir
    }

    //SORU9 : Listin pozitif elemanlarının, carpımını Lambda Expression ile return ederek yazdırın
    public static int pozitifElCarpimLamEx(List<Integer> sayi) {
        int sonuc = sayi.stream().filter(t-> t>0).reduce(1, (t,u) -> t*u); //carpmanin etkisiz elemani 1
        return sonuc; //1944000
    }

    //SORU10 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız
    public static List<Integer> ciftElKareKucuktenBuyugeListReturn(List<Integer> sayi) {
        List<Integer> sonuc = sayi.stream().filter(t -> t %2 == 0).map(t -> t*t).sorted().collect(Collectors.toList());
        return sonuc; //[0, 36, 64, 144, 144]
    }


}