package day26overriding;

public class Cat extends Mammal {

    public void meow(){
        System.out.println("Cat's meow...");
    }

    @Override // Override Annotation(dipnot)'i denir.
    // Ne ise yarar?  Java tarafından override kurallari kontrol edilir.
   // Eger kurallar ihlal edilmis ise hata verir.
    //Override yaparken sadece method bodysi değiştirilebilir.
    public void eat() { //Child'daki override edilmis eat() method'una "Overriding Method" denir.
        System.out.println("Cat's eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cat's drink...");
    }

    @Override
    public Cat create() {
        //Overriding de return type olusturulan objenin aynısı olabilir
        //ya da parentları olabilir. Animal-> Mammal
        return new Cat();
    }


    //@Override
    //    public long add(int a, int b) {
    //        return a+b;
    //    }
    //Return type  primitive olursa overriding yaparken değiştiremeyiz.
    //Primitive'lerde Parent child iliskisi olmadıgından return typeı degistiremeyiz.
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }
}
