package day22staticblocksconstructors;

public class StaticBlocks01Practice {


    static double pi;
    static String shape;



    static{
        pi = 3.14;
        System.out.println("Static block 1"); //1.calısır
    }

    static {

        shape = "Circle";
        System.out.println("Static block 2"); //2. calısır

    }

    public static void main(String[] args) {
        System.out.println(pi);

        System.out.println("main method"); //3.calısır

    }




}
