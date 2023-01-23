package day25inheritiance;


//method çağırırken constructora bakıcaz ====== variable çağırırken data type'ına bakıcaz
public class Honda extends Car {

    private int price = 10000;

    public void engine(){
        System.out.println("Vehicle Engine");
    }

    public Honda(){

        System.out.println("Honda 1");
    }

    public Honda(String model, int year){

        System.out.println("Honda 2: " + model + " - " + year);
    }





}
