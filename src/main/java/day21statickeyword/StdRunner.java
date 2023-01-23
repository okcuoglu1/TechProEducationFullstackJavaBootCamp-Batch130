package day21statickeyword;


import java.util.List;

public class StdRunner {

    public static void main(String[] args) {


        //stdName static oldugundan, ona ulaşmak icin obje olusturmadım
        //sadece class ismini olusturmak yeterlidir.
        System.out.println(Student.stdName);

        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayız.
        Student std1 = new Student();
        System.out.println(std1.age);

        //Aynı classdan bir object daha olusturduk ve n-static olanlar hemen objeye geldi.
        Student std2 = new Student();
        System.out.println(std2.age);

        String initials = Student.getInitials("Sefa Eyer");
        System.out.println(initials);//SE

        int vowels = std1.countVowels("Tom Cruise");
        System.out.println(vowels);//4

        //static olanlari object ile cagirmak tavsiye edilmez.
        String s = std1.getInitials("Ali Can");
        System.out.println(s);

        //List olusturmada yeni bit isilti...
        List<String> names = List.of("Ali", "Veli", "Can", "Kemal");
        System.out.println(names);




    }
}
