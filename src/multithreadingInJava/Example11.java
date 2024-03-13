package multithreadingInJava;

class MyRun implements  Runnable{
    @Override
    public void run(){

    }
}

public class Example11 {
    Thread t1 = new Thread("my-process");
    Thread t2 = new Thread(new MyRun(),"My-Process-1");


    // Will add more codes on Multi-threading

}
