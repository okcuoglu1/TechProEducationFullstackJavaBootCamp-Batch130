package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {

        //Example 1: Time'i formatlayiniz
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);//21:41:00.954448

        //hh==> 12 lik saat sistemini kullanir.-Eger 24 luk saat sistemini kullanmak istiyorsaniz  HH==> 24 luk saaat sistemini kullanir.
        // hh kullandiginiz da AM veya PM demelisiniz, bunu demek icin "a" yazmaniz yeterlidir.Yani ;"hh:mm  a"

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a"); //a am pm yazdırır.
        System.out.println(dtf.format(myTime)); //09:49:25 PM



    }
}
