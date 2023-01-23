package day19listsvarargs.day23datetimestringbuilder;

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

        //String'i degistirdikten sonra ayni String assign ederseniz, Java yine yeni bir container olusturur,
        //degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren oku yeni container'a yonlendirir.
        //Dolayisiyla eski container adressiz kalir, ve "Garbage Collector" adressiz olan container'lari siler.
        String a = "Money";
        a = a + " More";

        //Mutable
        //StringBuilder kullanarak String uretmenin 1.Yolu:
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);//Python

        sb1.append("!").append("?").append(".");
        System.out.println(sb1);//Python!?.

        //StringBuilder kullanarak String uretmenin 2.Yolu:
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0
        //StringBuilder kullandiginizda baslangic kapasitesi 16 dir.
        //Kapasite asildiginda varolan kapasite nin iki fazlasi kadar varolan kapasiteye ekleme yapilir,
        // 16 ==> 16*2+2       -       34 ==> 34*2+2
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34 = 16*2+2

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//34*2+2 ==> 70

        //StringBuilder kullanarak String uretmenin 3.Yolu:
        StringBuilder sb3 = new StringBuilder(2);

        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6

        sb3.insert(2,"XXXXXX");
        System.out.println(sb3.length());//9
        System.out.println(sb3);//FlXXXXXXo

        //toString() method'u StringBuilder'i String'e cevirir.
        //String Class'da var olan ama StringBuilder Class var olmayan split() method gibi
        //method'lara ihtiyac duydugumuzda toString() method'unu kullanarak String Class gecer ve o method'lari kullaniriz.
        sb3.toString().split("l");

        //String'i tekrar StringBuilder'a cevirebilirsiniz
        StringBuilder sb4 = new StringBuilder(sb3);

        //reverse() method'u String'leri ters cevirir.
        sb3.reverse();
        System.out.println(sb3);//oXXXXXXlF

        //deleteCharAt(1); index 1 deki character'i siler.
        sb3.deleteCharAt(1);
        System.out.println(sb3);//oXXXXXlF

        //delete(1, 6); index 1 deki character'den index 5(6 dahil olmadigi icin 5 yazdim) deki
        //character'e kadar tum characterleri siler.
        sb3.delete(1, 6);
        System.out.println(sb3);//olF

        StringBuilder sb5 = new StringBuilder("Kava");
        StringBuilder sb6 = new StringBuilder("Java");

        //sb5.compareTo(sb6) method'u sb5 ile sb6 yi alphabetic siralama olarak karsilastirir.
        //sb5 alphabetic siralamada once ise sonuc negative olur, sonra ise sonuc positive olur.
        System.out.println(sb5.compareTo(sb6));//-1

        //setCharAt(2, 'm'); index 2 deki character'i 'm' ye cevirir
        sb6.setCharAt(2, 'm');
        System.out.println(sb6);//Jama

        sb6.replace(1, 3, "xyz");
        System.out.println(sb6);//Jxyza

        //StringBuilder Class'da kullanmamiza izin verilen substring() method gibi bazi String Class method'lari vardir,
        //bu method'lari StringBuilder ustunde kullaninca StringBuilder'in orijinal degeri degismez
        String s7 = sb6.substring(1, 3);
        System.out.println(s7);//xy
        System.out.println(sb6);//Jxyza
    }
}
