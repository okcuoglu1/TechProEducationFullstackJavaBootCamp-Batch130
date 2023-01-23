package day17arraylists.day20passbyvaluemethodoverloading;

public class MethodOverloading01 {
    /*
        1)Method Overloading yaparken method ismi degistirilmez
        2)Method Overloading yaparken parametreler degistirilir.
            i)Parametre degistiriken, parametrelerin data type'lari degistirilebilir.
            ii)Parametre degistiriken, "parameterlerin data type'lari farkli ise" yerleri degistirilebilir.
            iii)Parametre degistiriken, parametrelerin sayisi degistirilebilir.
        3)Java icin "ismi" ve "parametreleri" ayni olan iki method tamamiyla aynidir.
          Bu yuzden "ismi" ve "parametre" "Method Signature" olarak adlandirilir.
        4)Method Overloading olustururken return type'i degistirmenin hicbir etkisi yoktur.
          Method Overloading olustururken access modifier'i degistirmenin hicbir etkisi yoktur.
          Method Overloading olustururken method'u static veya non-static yapmanin hicbir etkisi yoktur.
          Method Overloading olustururken method body'i degistirmenin hicbir etkisi yoktur.

        5)"private" method'lar overload edilebilir. Cunku method overloading sadece bir class'in icinde olur.
          "private" olmak ise baska class'lara gidildiginde problem olusturur.

        6)"static" method'lar overload edilebilirler.

     */
    public static void main(String[] args) {
        add(3, 5);
    }

    private static void add(int a, int b){
        System.out.println(a+b);
    }
    private static void add(double a, double b){
        System.out.println(a+b);
    }
    private static void add(double a, int b){
        System.out.println(a+b);
    }
    private static void add(int a, double b){
        System.out.println(a+b);
    }
    private static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }











}
