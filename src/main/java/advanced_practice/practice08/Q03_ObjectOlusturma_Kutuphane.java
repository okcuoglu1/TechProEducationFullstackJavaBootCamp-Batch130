package advanced_practice.practice08;

public class Q03_ObjectOlusturma_Kutuphane {
    //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.

    public static void main(String[] args) {

        Kutuphane kitap1 = new Kutuphane("Mağaradakiler", "Cemil Meriç",285);

        Kutuphane kitap2 = new Kutuphane("Kırlangıç Çığlığı","Ahmet Ümit",400);
        kitap2.sayfaSayisi=405; //kitap sayisini degistirdik ve tekrar yazdırdık o zaman degisti.
        kitap2.kitapBilgileri();




    }
}
