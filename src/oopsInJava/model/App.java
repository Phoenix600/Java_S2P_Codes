package oopsInJava.model;

public class App {
    public static void main(String[] args) {

        SmartPhone s1 = new SmartPhone();
        SmartPhone s2 = new SmartPhone("2334532GH","Mid Night Grey",16,"5G");

        Phone p1 = new Phone();
        Phone p2 = new Phone("36735236GH");

        Phone phone = new SmartPhone();
        phone.makeCall();
        phone.sendSMS();



    }
}
