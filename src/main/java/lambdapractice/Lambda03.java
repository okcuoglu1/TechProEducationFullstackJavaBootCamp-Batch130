package lambdapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda03 {

    public static void main(String[] args) {


        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));
        ciftVePozitifYazdir(sayi);
        System.out.println("\n***********");
        ciftVePozitifYazdirMethRef(sayi);
        System.out.println("\n***********");
        kareYazdir(sayi);
        System.out.println("\n***********");
        descendingOrder(sayi);
        System.out.println("\n***********");
        pozitifKupBirlerBas(sayi);

    }


    //1-List elemanlarinin çift ve pozitif olanlarını, Lambda expression kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitifYazdir(List<Integer> sayi){

        sayi.stream().filter(t->t%2==0 && t>0).forEach(t-> System.out.print(t + " "));

    }

    //2-List elemanlarinin çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitifYazdirMethRef(List<Integer> sayi){
        sayi.stream().filter(t->t%2==0 && t>0).forEach(LambdaUtils03::boslukluYazdir);
    }

    //3-List elemanlarinin karelerini, aralarinda bosluk olacak sekilde yazdırın
    public static void kareYazdir(List<Integer> sayi){

        sayi.stream().map(t->t*t).forEach(t-> System.out.print(t + " "));

    }

    //4-List elemanlarini büyükten kücüge sıralayarak yazdırın
    public static void descendingOrder(List<Integer> sayi){

        sayi.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t + " "));

    }

    //5-List elemanlarinin pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız.
    public static void pozitifKupBirlerBas(List<Integer> sayi){

        sayi.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).forEach(t-> System.out.print(t + " "));


    }











}
