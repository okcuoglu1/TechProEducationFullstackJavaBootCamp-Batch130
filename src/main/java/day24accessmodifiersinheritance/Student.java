package day24accessmodifiersinheritance;

public class Student {

    //Öğrenci ismine herkes ulasabilir. O yuzden public
    public String name = "Tom Hanks";
    //Student id default olsun herkes ulasamasın. Okul yönetimindeki insanlar
    String stdId = "TH2023HU12001"; //package private
    //Hesap numarasını oğlu bilebilir eşi bilebilir. Bir grup ve cocukları tarafından görülür.
    protected int accountNum = 76512345;
    //Hesaptaki para miktarını sadece sen görebilirsin. Bu yüzden private yaptık
    private int balance = 123000;


   /*
                1)Access modifier'lar genis'den dara; public > protected > default > private
                2)Class'lar protected ve private olamazlar, sadece public ve default olabilirler
                3)Access Modifier'lar ne ise yarar?
                        Variablelara methodlara classlara ulasmayi duzenler.
                4)Kac tane access modifier var ?
                        public > protected > default > private
                        i) "public"ler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
                        ii) "protected" ayni package'in icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
                        iii) "default" sadece ayni packageden ulasilabilir. Bu yuzden "default"larin diger adi "package private"dir
                        iv) "private"  sadece class icinden ulasilabilir, class disina cikildiginda ulasilamaz.
                        v) "protected" ile "default"un farki nedir ?
                           Package disina ciktigimizda childlardan "protected"lara ulasabiliriz. "default"lara ulasamayiz.
         */


}
