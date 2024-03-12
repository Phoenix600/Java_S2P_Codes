package multithreadingInJava;

class Process extends Thread{
    int count = 100;
    int priority;
    String name;

    Process(String name, int priority){
        this.name = name;
        this.priority = priority;
        setPriority(this.priority);
    }

    void display(){
        while (count!=0){
            System.out.println(name);
            count--;
        }
    }

    @Override
    public void run(){
        display();
    }
}

public class Example8 {
    public static void main(String[] args) {
        System.out.println("Start of main thread.....");

        Thread t1 = new Process("Java",10);
        Thread t2 = new Process("Python",1);
        t1.start();
        t2.start();

        System.out.println("End of main thread...");
    }
}
