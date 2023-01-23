package day31collections;


import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

    /*

    1/*
1)interface'lerden object olusturulamaz cunku interface'lerin constructor'i yoktur.
2)Abtrack Class'lardan object olusturulamaz, constructor'ları vardir ama constructor object olusturmada
  kullanilamaz.
3)interface'larin constructor'lari olmadigindan collection olustururken interface isimleri "new" keyword'undan sonra
  kullanilamaz.
4)class---->class yaparken extends kullaniriz.
  class---->interface yaparken implements kullaniriz
  interface--->interface yapmak icin extends kullanmamiz gerekir.
  interface---->class mumkun degildir.
 5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar o yuzden eleman silme ve ekleme islemleri coklukla
   yapilacaksa ArrayList kullanmak tavsiye edilmez.
 6)LinkedList'lerde eleman yerine "Node" kelimesi kullanilir. En bastaki Node'a "Head", en sondaki Node'a "Tail" denir.
 7)LinkedList'ler yapiları dolayisiyla index kullanmadıklarından, eleman silmede ve eklemede re-index yapilmasına gerek yoktur.
   Bu da LinkedList'leri eleman ekleme ve silmede çok başarılı hale getirir, bu yüzden eleman ekleme ve silmenin çok yapılması
   gereken durumlarda LinkedList kullanmak tavsiye edilir.
8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.

      Note: ArrayLists'ler eleman ekleme ve eleman silme konusunda başarısızdırlar.
       Bu yüzden yapılacak application'da fazlaca eleman eklenip çıkarılacaksa ArrayList kullanılması tavsie edilmez.
       Java Bu tarz işlemler için LinkedList'i oluşturmuştur.
       LinkedList index kullanmadığı için eleman ekleme ve çıkarma işlemini oldukça kolay yapar.

       //LINLEDLIST ==> Eleman silme-ekleme cok basarilidir. Index kullanmaz.
      //LINKEDLIST lerde eleman kelimesi yerine "NODE" denir. LinkedList bas Node manasinda "HEAD", son Node "TAIL" denir.
        head'in pointerı ilk "node" u gösterir. tatil'in pointerı null
     */

    public static void main(String[] args) {

        List<String> cityNames = new LinkedList<>();

        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");
        System.out.println(names);// [Steve, Ajda, Raj, Megan, Brandon]

        names.addFirst("Cuneyt");
        System.out.println(names);// [Cuneyt, Steve, Ajda, Raj, Megan, Brandon]

        names.addLast("Ajda");// "addLast()" is equivalent to "add()"
        System.out.println(names);// [Cuneyt, Steve, Ajda, Raj, Megan, Brandon, Ajda]

        names.add(3, "Suleyman");
        System.out.println(names);// [Cuneyt, Steve, Ajda, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove("Ajda");//Ilk Ajda'yi siler ve loop'u kirar
        System.out.println(names);// [Cuneyt, Steve, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove(4);
        System.out.println(names);// [Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda]

        names.add("Suleyman");
        names.add("Suleyman");
        System.out.println(names);// [Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda, Suleyman, Suleyman]

        String r1 = names.remove();//Retrieves and removes the first element of this list.(Cut + Paste)
        //Ilk elemani siler ve size verir
        System.out.println(r1);//Cuneyt
        System.out.println(names);// [Steve, Suleyman, Raj, Brandon, Ajda, Suleyman, Suleyman]

        names.removeFirstOccurrence("Suleyman");
        System.out.println(names);// [Steve, Raj, Brandon, Ajda, Suleyman, Suleyman]

        names.removeLastOccurrence("Suleyman");
        System.out.println(names);// [Steve, Raj, Brandon, Ajda, Suleyman]


        //Retrieves, but does not remove, the first element of this list.(Copy + Paste)
        //Returns: the head of this list, or null if this list is empty
        //Ilk elemani silmeden size verir
        String r2 = names.peek();
        System.out.println(r2);//Steve
        System.out.println(names);// [Steve, Raj, Brandon, Ajda, Suleyman]


        //Retrieves and removes the head first element of this list.(Cut + Paste)
        //Returns:the head of this list, or null if this list is empty
        //remove() bos LinkedList'te kullanilirsa "hata verir", poll() bos LinkedList'te kullanilirsa "null" verir.
        names.poll();


        //Pop removes and returns the first element of this list.(Cut + Paste)
        //This method is equivalent to removeFirst().
        names.pop();
    }
}
