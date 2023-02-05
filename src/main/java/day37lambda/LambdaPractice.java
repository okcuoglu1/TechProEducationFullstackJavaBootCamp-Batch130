package day37lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaPractice {

    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        //1)Tum "averageScore" larin 91 den buyuk olup olmadigini kontrol eden kodu yaziniz.
        boolean result1 = coursesList.stream().allMatch(t->t.getAverageScore()>91);
        System.out.println(result1);

        //2)Kurs isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol eden kodu yaziniz.
        boolean result2 = coursesList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println(result2);

        //3)Average score'u en yuksek olan kursun ismini console'a yazdiran kodu yaziniz.
        String name1 = coursesList.stream().
                sorted(Comparator.comparing(Course::getAverageScore).
                        reversed()).
                findFirst().
                get().
                getCourseName();



    }


}
