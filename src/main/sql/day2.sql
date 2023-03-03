--students isimli bir table oluşturunuz
​
CREATE TABLE students
(
	id SMALLINT,
	isim VARCHAR(50),
	adres VARCHAR(100),
	sinav_notu SMALLINT
);
​
​
--INSERT: Veritabanına yeni veri ekler
​
INSERT INTO students VALUES(120, 'Ali Can', 'Ankara', 70);
INSERT INTO students VALUES('121', 'Veli Han', 'Trabzon', 75);
--Integer sütunlara yalın yada tek tırnak içinde değer girilebilir.
INSERT INTO students VALUES(122, 'Ayşe Tan', 'Bursa', 85);
INSERT INTO students VALUES('123', 'Mary Star', 'İstanbul', 95);
--Varchar sütunlara tek tırnak içinde veri girilir.
INSERT INTO students VALUES(124, 'Terry Star', 'Ankara', 95);
INSERT INTO students VALUES('125', 'Herry Star', 'Hatay', 95);
INSERT INTO students VALUES('126', 'Sally Otar', 'İzmir', 100);
​
--Soru 1: students tablosundaki id ve isim sütunlarını çağırınız.
SELECT id, isim FROM students;
​
--Soru 2: Notu 85 üzeri olan öğrenci bilgilerinin tamamını çağırınız.
SELECT * FROM students WHERE sinav_notu > 85;
​
--Soru 3: Adresi Ankara olan öğrencilerin isimlerini çağırınız
SELECT isim, adres FROM students
WHERE adres = 'Ankara';

--Soru 4: Notu 85 üzeri ve adresi Ankara olan öğrenci isimlerini çağırınız.
SELECT isim, adres, sinav_notu FROM students
WHERE sinav_notu > 85 AND adres = 'Ankara';

--Soru 5: sinav_notu 95 veya 70 olan üğrencilerin tüm bilgilerini çağırınız.
--1. Yol:
SELECT * FROM students
WHERE sinav_notu = 95 OR sinav_notu = 70;

--2. Yol:
SELECT * FROM students
WHERE sinav_notu IN(95,70);

--Soru 6: sinav_notu 75 ve 95 arasında olan öğrencilerin isimlerini çağırınız.
--1. Yol:
SELECT isim  FROM students
WHERE sinav_notu >= 75 AND sinav_notu<=95;

--2. Yol: BETWEEN
SELECT isim, sinav_notu FROM students
WHERE sinav_notu BETWEEN 75 AND 95;--Sınırlar dahil

--Soru 7: id'si 122 ve 125 arasında olmayan öğrencilerin adreslerini yazdırınız.
--1. Yol:
SELECT adres FROM students
WHERE id < 122 OR id > 125;

--2. Yol: NOT BETWEEN
SELECT adres FROM students
WHERE id NOT BETWEEN 122 AND 125;--Sınırlar hariç

--3. Yol: NOT IN
SELECT adres FROM students
WHERE id NOT IN(122,123,124,125);

--Soru 8: adres'i 'Hatay' olan satırı siliniz
DELETE FROM students
WHERE adres = 'Hatay';

--Soru 9: isim'i 'Ali Can' ve 'Veli Han' olan satırları(record/row) siliniz.
--1. Yol:
DELETE FROM students
WHERE isim = 'Ali Can' OR isim = 'Veli Han';

--2. Yol
DELETE FROM students
WHERE isim IN('Ali Can','Veli Han','Sally Otar');

--Tüm satırları sil
DELETE FROM students;--Tüm satırları siler ama table kalır.

--Soru 10: id'si 123'ten büyük olan satırları siliniz.
DELETE FROM students
WHERE id > 123;

TRUNCATE students;--Tüm satırları geri getirilemeyecek şekilde siler. Wehere ile kullanılamaz.

--student table'ını siliniz
DROP TABLE students;

SELECT * FROM students;