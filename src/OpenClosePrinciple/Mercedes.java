package OpenClosePrinciple;

public class Mercedes implements Araba{

    String model ="Mercedes";
    int tripKm=50;//kaç km yaptığını tutan değişken
    int dolarPerKm = 3;

    public void go(){
        System.out.println("Mercedes gidiyor");
    }

    public void stop(){
        System.out.println("Mercedes duruyor");
    }
}
