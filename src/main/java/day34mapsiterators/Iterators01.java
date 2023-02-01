package day34mapsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators01 {

    /*

    Iterator'lar Loop'larin yaptığı işi yapar.
    Iterator'lar tıpkı loop'larda olduğu gibi elemanı alarak işleme sokar.
    Java'nın Iterator'lari ortaya cıkarma sebebi Infinite loop riskini bitirmektir.
    Iterator'larda sonsuz loop yoktur.
    Iterator'lar sonradan oluşturmuşlardır ve loopların yaptıkları bütün işlemleri yapabilirler.
    Loop'lar ile Iterator'larin performans farkı yoktur ama Iterator'lar eleman silme ve update etmede daha basarılıdırlar.
    Collection'larda eleman silme ya da update islemlerinde Iterator kullanırız.

    Iki tip Iterator vardır;
    i) Iterator: Sadece elemanlari remove edebilirsiniz.
                 Sadece soldan saga calısır yani tek yonludur.
    ii) ListIterator: Elemani remove etme ve update etme yapabilirsiniz.
                      Hem soldan saga hem de sagdan sola calisabilir. Yani çift yönlüdür.



     */


    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");

        Iterator<String> itr1 = list1.iterator();

        while (itr1.hasNext()){

            itr1.next();

          itr1.remove();

        }





    }


}
