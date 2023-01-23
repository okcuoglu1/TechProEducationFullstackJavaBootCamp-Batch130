package advanced_practice.practice07;

import java.time.LocalDate;

public class Market {


    String urunAdi;
    Double urunfiyati;
    String sonKullanmaTarihi;

    // Degisken isimleri ayni ise this keyword'unu kullaniriz.
// Karisiklik olmasin diye this diyerek bu classtaki degisken  oldugunu belirtiyoruz.
// Degisken isimleri farkli ise this keyword'unu kullnamaya gerek yok
    Market(String isim, double fiyat, int aySonra){
    urunAdi=isim;
    if(fiyat>99){
       fiyat = fiyat*0.9;
    }
    urunfiyati=fiyat;
   sonKullanmaTarihi =  LocalDate.now().plusMonths(aySonra).toString();


    }

    Market(String isim, double fiyat){
        urunAdi=isim;
        if(fiyat>99){
            fiyat = fiyat*0.9;
        }
        urunfiyati=fiyat;
        sonKullanmaTarihi = "Bu ürünün son kullanma tarihi yoktur..";


    }

    Market(){}


    @Override
    public String toString() {
        return "Market{" +
                "urunAdi='" + urunAdi + '\'' +
                ", urunfiyati=" + urunfiyati +
                ", sonKullanmaTarihi='" + sonKullanmaTarihi + '\'' +
                '}';
    }
}