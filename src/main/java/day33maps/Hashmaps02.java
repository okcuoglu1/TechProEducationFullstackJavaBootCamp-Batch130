package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class Hashmaps02 {

    public static void main(String[] args) {

        //Example 1: Size verilen bir cumledeki her bir kelimenin kacar kere kulanildigini gosteren kodu yazınız.
        //           "Java is easy. Java is OOP. OOP makes Java easy."

        HashMap<String, Integer> wordsMap = new HashMap<>();

        String sentence = "Java is easy. Java is OOP. OOP makes Java easy.";
        System.out.println(sentence);

        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence); //Java is easy Java is OOP OOP makes Java easy

        String[] wordsArray = sentence.split(" ");
        System.out.println(Arrays.toString(wordsArray)); //[Java, is, easy, Java, is, OOP, OOP, makes, Java, easy]


        for(String w : wordsArray){


          Integer numOfOccurrence =   wordsMap.get(w);

          if(numOfOccurrence==null){

              wordsMap.put(w,1);
          }else{
              wordsMap.put(w,numOfOccurrence+1);
          }

        }

        System.out.println(wordsMap);



    }


}
