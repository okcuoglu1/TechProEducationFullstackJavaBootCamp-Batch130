package day27encapsulationabstraction;

public class Student {

    //Encapsulation yapilmis data'yi okuyabilir miyiz?

//get method'lar(getter) encapsule edilmis(saklanmis) data'yi okumamiza yarar
//get method'lar(getter) her zaman "public" olur
//get method'larin(getter) return type'i variable'in data type'i ile ayni olur.
//get method'larin(getter) isimleri "get + variable name" seklinde olur.
//get method'larin(getter) isimleri variable boolean ise
// "is + variable name" seklinde olur.
//get method'lar(getter) parametre kullanmazlar.


        private String stdId="AC123";
        private double gpa = 3.99;
        private boolean poor = true;



        public String getStdId() {
                return stdId;
        }

    public double getGpa() {
        return gpa;
    }


    public boolean isPoor() {
        return poor;
    }

    //Encapsulation yapilmis data'larin degeri degistirilebilir mi?
    //set method'lar(setter) encapsule edilmis data'larin degerlerini degistirmemize(update) yarar.
    //set method'lar(setter) her zaman "public" olur.
    //set method'lar(setter) return type'i her zaman void olur.
    //set method'lar(setter) isimleri "set + variable name" seklinde olur.
    //set method'lar(setter) variable ile aynı data type'inda parametre kullanirlar.

    //Encapsulation faydalarindan biri de tek bir obje olusturup set methodu ile istedigimiz objeye cevirebiliriz.

    //getter ve setter'larin ikisine birden "Java beans" denir.



    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
}
