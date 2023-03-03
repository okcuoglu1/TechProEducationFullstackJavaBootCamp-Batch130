/*
  SQL KOMUTLARI GRUPLARA AYRILIR :
  1.(Data Definition Language - DDL) Veri Tanimlama Dili
  CREATE: Tablo oluşturur.
  DROP: Tabloyu siler.
  ALTER: Tabloyu günceller.

  2.(Data Manipulation Language - DML) Veri Kullanma Dili
  INSERT:Tabloya veri ekler
  DELETE:Tablodaki verileri siler
  UPDATE:Tablodaki verileri günceller
  3.(Data Query Language - DQL) Veri Sorgulama Dili
  SELECT: Tablodaki verileri listeler.
*/
--talebeler isminde tablo olusturalım
create table talebeler(
ogrenci_tc char(11),            -- Uzunlugu belli olan String veriler icin char() data turu kullanılır
ogrenci_isim varchar(20),       -- Uzunlugu belli olmayan String veriler icin varchar() data turu kullanılır
not_ort real,                   -- Ondalıklı sayılar ıcın real data turu kullanılır
kayit_tarihi date               -- Tarih icin date data turu kullanılır
);
-- talebeler tablosundaki verileri listeleyelim
select * from talebeler;
-- talebeler tablosuna veri ekleyelim
insert into talebeler values('12345678912','Ahmet',72.5,'2020-02-14');
insert into talebeler values('12345678975','Mehmet',80.5,'2022-02-16');
insert into talebeler values('12345678965','Veli',86.4,'2021-05-25');
insert into talebeler values('12345678985','Hüseyin',90.6,'2023-02-27');
-- simdi tekrar talebeler tablosundaki verileri listeleyelim
select * from talebeler;
-- talebeler tablosunu silelim
drop table talebeler;
-- ogretmenler isminde tablo olusturalım
create table ogretmenler(
ogretmen_ismi varchar(15),
bransı varchar(25),
mezuniyet_derecesi varchar(20),
tel_nu char(11),
maas int
);
-- ogretmenler tablosuna veri girisi yapalım
insert into ogretmenler values('Ali','Matematik','Lisans','12345678945',15000);
insert into ogretmenler values('Erdem','Edebiyat','Lisans','12345678975',13000);
insert into ogretmenler values('Haşim','Tarih','Yüksek Lisans','12345678949',20000);
insert into ogretmenler values('Aylin','Geometri','Lisans','12345678925',18000);
-- ogretmenler tablosundaki verileri listeleyelim
select * from ogretmenler;
-- ogretmenler tablosunu silelim
drop table ogretmenler;
/*=====================================SELECT=======================================================
select * from tablo_adi ==> * Tüm sutunlardaki verileri listeler
DQL Grubundan ==> SELECT komutu ile 'Tablodaki İstedigimiz Sütundaki Verileri Listeleyebiliriz'
Syntax:
-------
select sutun_adi from tablo_adi; ==> Sadece belirtilen sutundaki verileri listeler
========================================================================================================*/
create table ogrenciler
(
id int,
isim varchar(40),
adres varchar(100),
sinav_notu int
);
insert into ogrenciler values(120, 'Ali Can', 'Ankara', 75);
insert into ogrenciler values(121, 'Veli Mert', 'Trabzon', 85);
insert into ogrenciler values(122, 'Ayşe Tan', 'Bursa', 65);
insert into ogrenciler values(123, 'Derya Soylu', 'Istanbul', 95);
insert into ogrenciler values(124, 'Yavuz Bal', 'Ankara', 85);
insert into ogrenciler values(125, 'Emre Gül', 'Hatay', 90);
insert into ogrenciler values(126, 'Harun Reşit', 'Isparta', 100);
-- SORU1: ogrenciler tablosunun tum sutunlarındaki verileri listeleyiniz
select * from ogrenciler;
-- SORU2: ogrenciler tablosundaki 'isim' sutunundaki verileri listeleyiniz
select isim from ogrenciler;
-- SORU3: ogrenciler tablosundaki 'adres' sutunundaki verileri listeleyiniz
select adres from ogrenciler;
--SORU4: ogrenciler tablosundaki 'sinav_notu' sutunundaki verileri listeleyiniz
select sinav_notu from ogrenciler;
--SORU5: ogrenciler tablosundaki 'isim' ve 'sinav_notu' sutunundaki verileri listeleyiniz
select isim, sinav_notu from ogrenciler;
/*
WHERE==> ŞART belirtmemiz gerektiginde kullanılır
*/
--SORU6: ogrenciler tablosundaki sinav_notu 80'den büyük olan öğrencilerin tüm bilgilerini listele
select * from ogrenciler where sinav_notu>80;
--SORU7: ogrenciler tablosundaki adres'i 'Ankara' olan ögrencilerin tüm bilgilerini listele
select * from ogrenciler where adres='Ankara';
--SORU8: ogrenciler tablosundaki sinav_notu 85 ve adres'i 'Ankara' olan öğrenci isim'ini listele
select isim from ogrenciler where sinav_notu=85 and adres='Ankara';
--SORU9: ogrenciler tablosundaki sinav_notu 65 veya 85 olan ogrencilerin tüm bilgilerini listele
select * from ogrenciler where sinav_notu=65 or sinav_notu=85;
-- 2 YOL
-- in ==> Birden fazla ifade ile tanımlayabilecegimiz durumları in komutuyla yazabiliriz.
select * from ogrenciler where sinav_notu in(65,85);
--SORU10: .ogrenciler tablosundaki sinav_notu 65 veya 85 olmayan ogrencilerin tüm bilgilerini listele
select * from ogrenciler where sinav_notu not in(65,85);
-- not in komutu yazdıgımız verilerin, dısındaki verileri listeler
--SORU11: ogrenciler tablosunda sinav_notu 65 ve 85 arasında olan ogrencilerin tüm bilgilerini listele
select * from ogrenciler where sinav_notu>=65 and sinav_notu<=85;
-- 2 YOL
select * from ogrenciler where sinav_notu between 65 and 85;
--SORU12:.ogrenciler tablosunda sinav_notu 75 ve 90 arasında olmayan ögrencilerin isim'ini ve sinav_notu listele
select isim, sinav_notu from ogrenciler where sinav_notu not between 75 and 90;
-- 2. YOL
select isim, sinav_notu from ogrenciler where sinav_notu<75 or sinav_notu>90;