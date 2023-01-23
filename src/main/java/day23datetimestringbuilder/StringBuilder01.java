package day23datetimestringbuilder;

import java.sql.SQLOutput;

public class StringBuilder01 {


    /*
        Java'da String, "String Class" kullanilarak veya "StringBuilder Class" kullanilarak olusturulabilir.
        "String Class" kullanarak urettiginiz String'ler "Immutable"(Degistirilemez) dir.
        "StringBuilder Class" kullanarak urettiginiz String'ler "Mutable"(Degistirilebilir) dir.
         */
    public static void main(String[] args) {
        //Immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";
        //String'i degistirdikten sonra ayni String'e assign ederseniz Java yine yeni bir container olusturur,
        //degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren oku yeni container'a yonlendirir.
        //Dolayisiyla eski container adressiz kalir ve "Garbage Collector" adressiz ola container'lari siler.
        String a = "Money";
        a = a + " More";

        //Mutable
        //StringBuilder kullanarak String uretmenin 1. Yolu:
        StringBuilder sb1 = new StringBuilder("Phyton");
        System.out.println(sb1);//Phyton
        sb1.append("!").append("?").append(".");
        System.out.println(sb1);//Phyton!?.

        //StringBuilder kullanarak String uretmenin 2. Yolu:
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0

        //StringBuilder kullandiginizda baslangic kapasitesi 16'dir.
        // Kapasite asildginda varolan kapasitenin iki fazlasi kadar varolan kapasiyete ekleme yapilir,
        //16==> 16*2+2      -       34==>34*2+2
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34 = 16*2+2

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//70 34*2+2

        //StringBuilder kullanarak String uretmenin 3. Yolu:
        StringBuilder sb3 = new StringBuilder(2);
        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6 2*2+2

        sb3.insert(2, "xxxxxx"); //Araya eklemek demek istedigimiz lengthden sonra araya ekler.
        System.out.println(sb3);//Flxxxxxxo


        //toString() methodu String Builderi String'e cevirir.
        //String Class'da var olan ama StringBuilder Class da var olmayan split() method gibi
        //method'lara ihtiyac duydugumuzda toString() method'unu kullanarak String Class gecer ve o method'lari kullaniriz.
        sb3.toString().split("l");

        StringBuilder sb4 = new StringBuilder(sb3); // Stringi tekrar StringBuilder a geri çevirdik.

        //reverse() methodu String'leri ters cervirir.
        sb3.reverse();
        System.out.println(sb3);//oxxxxxxlF

        sb3.deleteCharAt(1); //indexe git karakteri sil.
        System.out.println(sb3); //oxxxxxlF

        //delete(1,6); index 1 deki karakterden index 5(6 dahil degil) deki karakter'e kadar tum karakterleri siler.
        sb3.delete(1, 6);
        System.out.println(sb3); //olF

        StringBuilder sb5 = new StringBuilder("Java");
        StringBuilder sb6 = new StringBuilder("Java");

        //compareTo() methodu StringBuilder'lari alfabetik olarak karsilastirir
        //alfabetik olarak karsılaştırır. Aynı ise 0 verir.Ascii deger kullanır. Farklı olan ilk karaktere bakar.
        //sb5 alphabetic siralamada önce ise sonuc negative olur, sonra ise sonuc positive olur.
        System.out.println(sb5.compareTo(sb6));

        //setCharAt(2, 'm'); index 2 deki karakter'i 'm' ye cevirir.
        sb6.setCharAt(2, 'm');
        System.out.println(sb6); //Jama


        sb6.replace(1, 3, "xyz");
        System.out.println(sb6); //Jxyza

        //StringBuilder Class'da kullanmamiza izin verilen substring() gibi bazı String Class method'lari vardir.
        //bu method'lari StringBuilder ustunde kullaninca StringBuilder'in orjinal degeri degismez.
        String s7 = sb6.substring(1, 3);
        System.out.println(s7); //xy baska bi konteynıre koyabiliriz. Ama orjinal degeri degismez.
        System.out.println(sb6); //Jxyza


    }
}