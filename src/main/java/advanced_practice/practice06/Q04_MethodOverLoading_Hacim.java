package advanced_practice.practice06;

public class Q04_MethodOverLoading_Hacim {


    public static void main(String[] args) {
        
        Hacim obje = new Hacim();
       int kupHacmi =  obje.hacimHesapla(5);
        System.out.println("kupHacmi = " + kupHacmi);

        int karePrizmaHacmi = obje.hacimHesapla(5,4);
        System.out.println("karePrizmaHacmi = " + karePrizmaHacmi);

        int diktorgenPrizmaHacmi = obje.hacimHesapla(2,3,4);
        System.out.println("diktorgenPrizmaHacmi = " + diktorgenPrizmaHacmi);

        int kupunHacmi2 = obje.hacimHesapla(2);
        System.out.println("kupunHacmi2 = " + kupunHacmi2);
        
        
        

        
    }
    
}
