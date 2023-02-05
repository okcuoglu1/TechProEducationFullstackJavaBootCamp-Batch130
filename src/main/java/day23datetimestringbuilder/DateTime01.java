package day23datetimestringbuilder;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {
        Date myDate = new Date();
        System.out.println(myDate); //Sat Jan 07 23:26:55 TRT 2023

        System.out.println(myDate.getTime()); //1673123325942 ==> 1 ocak 1970den su ana kadarki mili saniye

        //Icınde bulundugumuz an nasıl alınır?
        System.out.println(LocalDate.now()); //2023-01-07

        System.out.println(LocalTime.now()); //23:35:01.843407


        System.out.println(LocalDateTime.now()); //2023-01-07T23:35:59.807469

        //Dunyanın herhangi bir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo"))); //2023-01-08T05:44:29.970573
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Istanbul"))); //2023-01-08T05:44:29.970573
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow"))); //2023-01-08T05:44:29.970573

        //Ileriki tarihe nasıl gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-12

        //Geriye bir tarihe nasıl gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2)); //2018-10-05

        //Ileriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3)); //02:57:26.722089

        //Geriki bir zamana nasıl gidilir?
        System.out.println(LocalTime.now().minusMinutes(45)); //23:13:11.720543

        //Zaman'da belli bir bolumu nasil aliriz?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute()); //0:2

        //Tarihte belli bir zamani nasıl alırız?
        System.out.println(LocalDate.now().getMonth() + ":" + LocalDate.now().getDayOfMonth());//JANUARY:8

        //Ikı tarih nasıl karsılastırılır?
        //02/13/2005 - 03/01/2007
        boolean result = LocalDate.of(2005, 02, 13).isBefore(LocalDate.of(2007,03,01));
        System.out.println(result);


        //Tarih'lerin formatlari nasil degistirilir?

        // M--> Tek arakamla ay nosu yazar - MM--> Ikı rakamla ay nosunu yazar-MMM-->Ay ismini ilk uc ısmını yazar
        //MMMM--> ay ısımının tamamını yazar.

        //d--> Tek rakamla gün nosunu yazar  -- dd--> Iki rakamla gun nosunu yazar
        //yy--> Yilin son iki rakamini yazar-- yyyy Yilin tamamini yazar

        DateTimeFormatter dtf1 =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 =  DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        DateTimeFormatter dtf3 =  DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        DateTimeFormatter dtf4 =  DateTimeFormatter.ofPattern("dd/M/yyyy");

        System.out.println(dtf1.format(LocalDate.now())); //08/01/2023
        System.out.println(dtf2.format(LocalDate.now())); //08/Jan/2023
        System.out.println(dtf3.format(LocalDate.now())); //08/January/2023
        System.out.println(dtf4.format(LocalDate.now())); //08/1/2023

    }






}
