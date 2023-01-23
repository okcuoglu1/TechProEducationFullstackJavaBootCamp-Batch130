package day27encapsulationabstraction;

public abstract class Courses {

   /*
   1)Bazen method body'sini yazmak gerekmez. bu durumlarda body'siz method oluşturmak gerekir.
     Body'si olmayan method'lara "abstract methodlar" denir.

   2)"abstract methodlar" child class'lar tarafından "override" edilmek zorundadirlar
       Bu yüzden, eğer bir fonksiyonun child class'lar tarafından kullanılmasını mecbur kılmak isterseniz
      o methodu abtract yapmak gerekir

   3)Bir methodun body'sini silmek o methodun abstract olması için yeterli değildir.
     "Access modifier" ile return type arasına "abstract" keyword koymak gerekir.

   4)"abstract method"lar sıradan class'ların içine yazılamazlar, "abstract method"ların içine yazıldıkları class'larda
     abstract olmak zorundadirlar.

   5)"abstract class"larda hem "abstract method"lar hemde "concrete method"lar kullanılabilir
   6)"concrete class"lar "abstract class"ların child'ı olabilirler.
     "abstract method"ların override edilme zorunluluğu concrete class'lar içindir.

*/

    public abstract void math();

    public  void art(){
        System.out.println("Painting...");
    }

    //final method'lar "override" edilemezler, halbuki "abstract" method'lar override edilmek icin olusturulurlar.
    //Bu çelişkidir, bu yüzden Java, abstract methodlarin final olmasina müsade etmez.
    // public final abstract void science();

    // Concrete Class'lar final oldugunda Child Class'a sahip olamazlar
   // Ama "Abstract Class" lar icin Child Class olmalidir,cunku Child Class'lar abstract parent classs'daki abstract method'lari kullanirlar.
  // Bu yuzden Java "Abstract Class"larin "final " olmasina musaade etmez.


    //"abstract method"lar "private" olamazlar , cunku Child Class'lar abstract method'lari kullanirlar,
    // private yapinca kullanima kapali olur.
   //Bu celiskidir , bu yuzden Java abstract method'larin "private" olmasina musaade etmez.

    //"abstract method" lar "static" olamazlar, cunku static method'lar override edilemez,
    // halbuki abstract method'lar override edilmek icin olusturulmustur.

}
