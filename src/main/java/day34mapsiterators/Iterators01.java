package day34mapsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

        /*
            Iterator'lar Loop'ların yaptığı işi yapar.
            Iterator's'lar tıpkı loop'larda olduğu gibi elemanı alarak işleme sokar.
            Java'nın Iterator'ları ortaya çıkarma sebebi Infinite Loop riskini bitirmektir.
            Iterator'larda sonsuz loop yoktur.
            Iterator'lar Java tarafından sonradan oluşturulmuşlardır be loop'ların yaptıkları bütün işlemleri yapabilirler.
            Loop'lar ile Iterator'larin performance farki yoktur ama Iterator'lar eleman silme ve update etmede daha basrilidirlar.

            Iki tip Iterator var;
            i)Iterator: Sadece eleman'lari remove edebilirsiniz
                        Sadece sol'dan sag'a calisir yani tek yonludur.
            ii)ListIterator: Elemani "remove etme", "update etme", ve "add" yapabilirsiniz.
                             Hem sol'dan saga hem de sag'dan sola calisabilir yani cift yonludur.
         */

    public static void main(String[] args) {

        //Iterator
        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        System.out.println(list1);

        Iterator<String> itr1 = list1.iterator();

        while(itr1.hasNext()){
            itr1.next();
            itr1.remove();
        }
        System.out.println(list1);// []

        //ListIterator
        //Example 1:
        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");
        System.out.println(list2);

        ListIterator<String> listItr = list2.listIterator();

        while(listItr.hasNext()){
            String el = listItr.next();
            listItr.set(el + "!");
        }
        System.out.println(list2);// [ Ali!, Can!, Aliye! ]


        //Example 2:
        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);

        ListIterator<String> lisItr2 = list3.listIterator();

        //Asagidaki loop "pointer" i en saga almak icin yazildi
        while(lisItr2.hasNext()){
            lisItr2.next();
        }

        //Asagidaki loop elemanlari en sondan en basa dogru yazdirmak icin yazildi.
        while(lisItr2.hasPrevious()){
            String el = lisItr2.previous();
            System.out.println(el + " <==");
        }
    }

}