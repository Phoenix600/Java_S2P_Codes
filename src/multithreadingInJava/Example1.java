package multithreadingInJava;

class MyClass1 implements Runnable{

    @Override
    public void run() {
        int count = 0;
        while (count != 100){
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello");
            count++;
        }
    }
}


class MyClass2 extends Thread{

    public MyClass2(String name){
        super(name);
        setPriority(MAX_PRIORITY);
    }
    @Override
    public void run() {
        int count = 99;
        super.run();
        while (count != 0){
            System.out.println("Java");
            count--;
        }
    }
}
public class Example1{
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyClass1());
        Thread t2 = new MyClass2("Thread-1");

    }

}