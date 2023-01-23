package day30exceptionsinterface.interfacee;

import java.sql.SQLOutput;

public class Accord implements Ac, Engine, Security {



    @Override
    public void cool() {
        System.out.println("Accord cools super");
    }

    @Override
    public void run() {
        System.out.println("Engine runs super");
    }
}
