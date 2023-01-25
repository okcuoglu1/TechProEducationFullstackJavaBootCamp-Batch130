package advanced_practice.practice11;

import java.io.*;

public class TextOkumaYazma {
    //Bir text dosyasındaki her satırın kelime sayısını o dosyada her satırın sonun yazdıran bir kod yazınız.
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("");
        BufferedReader br = new BufferedReader(fr);
        String satir = br.readLine();
        String yeniDosya = "";


        while (satir != null) {

            yeniDosya += satir + "==>Satır kelime sayısı: " + satir.split(" ").length + "\n";
            satir = br.readLine();
        }
        System.out.println("yeniDosya = " + yeniDosya);
        br.close();

        FileWriter writer = new FileWriter("");
        writer.write(yeniDosya);
        writer.close();

    }
}