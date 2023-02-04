package day37lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSumOfAllElements(myList));
        System.out.println(getSumFromSevenToSeventy());
        System.out.println(getMultiplicationFromThreeToNine());
        System.out.println(getMultiplicationFromThreeToNine2());
        System.out.println(getFactorial(5));

    }

    //Example 1: Verilen list'teki tum sayilarin toplamini veren method'u olusturunuz.

    public static int getSumOfAllElements(List<Integer> myList){

        //Math::addExact :Matematik Class'ina git, tamamını topla.

       return myList.stream().reduce(Math::addExact).get();

    }

    //Example 2: 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.

    public static int getSumFromSevenToSeventy(){

        //IntStream integerları yukardan asagıya dizer.
        //rangeClosed==> baslangis ve bitis dahil olarak size int aralıgı veriyor.
      return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();

    }

    //Example 3: 3'den 9' a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    public static int getMultiplicationFromThreeToNine(){
        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();
    }


    public static int getMultiplicationFromThreeToNine2(){

        //range methodu ilki dahil sonuncuyu dahil olarak vermez o yüzden 1 fazlası.
        return IntStream.range(3,10).reduce(Math::multiplyExact).getAsInt();
    }

    //4) Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.
    public static int getFactorial(int x){
        if(x==0){
            return 1; //0 ın faktöriyeli 1 dir.
        }else if(x<0){
            System.out.println("Faktoriyel islemi negatif sayılarla yapılamaz");
            return -1; //hata mesajı olarak java -1 verdigi icin biz de -1 yazdık.
        }
        return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();

    }







}
