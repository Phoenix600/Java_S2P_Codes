package oopsInJava.model.abstractClasses.entity;

public class Tesla extends Car {
    @Override
    public void startEngine(){
        System.out.println("Electric engine started....");
    }

    public void selfDrive(){
        System.out.println("Self Driving Feature is Bluff");
    }
}
