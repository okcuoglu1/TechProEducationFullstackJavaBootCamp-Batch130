package day31collections;

import java.util.HashSet;

public class HashSet01 {
    /*
    "Hash" bir tekniktir biz bu tekniği kullanarak Java benzersiz datalar üretir.
            "Set" demek tekrarsız data demektir.ArrayList ve LinkedListlerde tekrar mümkündür.
    Ancak Set tekrar kabul etmez. Yani tekrarsız veriler için kullanılır.

    Collections'lari coklu eleman depolamak icin kullaniriz
Hash bir tekniktir biz bu teknigi kullanarak unique data'lar uretiriz (Benzersiz)
Mesela universitenin olusturdugu ogrenci numarasi olusturma islemine hash code islemi denir
IT de set kelimesini duyarsaniz tekrar yok demektir
Mesela e-mail depolayan bir DB icin HashSet en iyisidir


/*
 1)"Hash" bir tekniktir, Java bu teknigi kullanarak benzersiz datalar uretir.
 2)"Set" tekrarsiz data depolamak icin kullanilam bir Collection'dir.
 3)Set tekrar kabul etmez. Yani;tekrarsiz verileri depolamak icin kullanilir.
 "Set" ler 3'e ayrilir;
  i)HashSet: a)Super hizlidir,cunku HashSet'ler verdiginiz elemanlari siralamak icin zaman kaybetmez
             yani HashSet'lere eklenen elemanlar rastgele siralanirlar.
             b)HashSet'ler tekrarli elemana musaade etmezler
             c)HashSet'ler sadece bir tane "null" i eleman olarak kabul ederler.
  ii)LinkedHashSet: a)LinkedHashSet elemanlari "insertion order" a gore dizer.
                    b)LinkedHashSet elemanlari siralamakta zaman kaybettigi icini HashSet' e gore yavastir.
  iii)TreeSet: a)TreeSet elemanlari "natural order"(kucukten buyuge || alfabetik sıraya gore) a gore dizer.
               b)TreeSet "natural order" yaparken cok zaman harcar o yuzden en yavas "Set" dir.
               c)TreeSet 'ler tekrarli elemana musaade etmezler
     */
    public static void main(String[] args) {


        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);











    }

}
