package LiskovSubstitutionPrinciple;

public class BMW extends Araba2{
    @Override
    public void go() {
        System.out.println("BMW gidiyor");
    }

    @Override
    public void stop() {
        System.out.println("BMW durdu");
    }

    @Override
    public void sendSMS() {

    }

}
