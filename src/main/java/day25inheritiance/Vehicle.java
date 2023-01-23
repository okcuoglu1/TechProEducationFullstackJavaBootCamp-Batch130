package day25inheritiance;

public class Vehicle {

/*
      1)Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
        parent class'dan baslatilarak alta dogru calistirilir.
      2)Child Class'da ki constructor'dan Parent Class'da ki constructor'a gidebilmek icin "super()" kullanilir.
      3)Parent Class'da birden fazla constructor varsa istenilen constructor,"super()" ifadesinin icine yazilan
      parametreler yardimi ile secilebilir.
      4)Ayni class icindeki constructor'lari secmek icin "this()" kullanilir.
        Ayni Class'da birden fazla constructor varsa istenilen constructor,"this()" ifadesinin icine yazilan
        parametreler yardimi ile secilebilir.
      5)"super()" ifadesini yazmak istege baglidir, yazmasaniz da Java sanki "super()" varmis gibi davranir.
         Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
      6)"super()" ve "this()" ifadeleri constructor icinde her zaman ilk satirda olmalidir.

      7)Bir constructor'in icinde "super()" ve "this()" ifadeleri sadece bir kere kullanilabilir. Bakiniz 6.kural..

      8) Inheritance'da variable'lari ve method'lari cagirmak icin "this" veya "super" kullanılır. parantezsiz.
         "this" ayni class icindeki variable'lari ve method'lari cagirmak icin
         "super" parent class icindeki variable'lari ve method'lari cagirmak icin kullanılır.

       9) Inheritance'da Object kullanarak variable cagirirsanizi, Object'in data tipini temsil eden class'dan variable'i
          aramaya baslayiniz. O class da yoksa parent'lara bakiniz

       10) ***Inheritace'da Object kullanarak method cagirirsaniz Object'in constructor'ini temsil eden class'dan methodu aramaya baslayiniz
       o class'da yoksa parent'lara bakiniz.

       OOP Principals
       i)Inheritance +
      ii)Polymorphism: Method Overloading + Method Overriding +
      iii)Encapsulation +
      iv)Abstraction +

   */

    public int price = 12000;

    public void engine(){
        System.out.println("Vehicle Engine");
    }

    public Vehicle(){

        System.out.println("Vehicle 1");
    }

    public Vehicle(int price){
        System.out.println("Vehicle 2: " + price);

    }

}
