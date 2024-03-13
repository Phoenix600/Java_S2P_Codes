package multithreadingInJava;

import java.sql.SQLOutput;
import java.util.concurrent.ThreadFactory;

class BaseThread extends  Thread{
    @Override
    public void run(){

    }
}

class BaseThread1 implements  Runnable{
    int x = 100;
    @Override
    public void run() {

        while (x >= 0){
            try {
                Thread.sleep(300);
                System.out.println(x);
                x--;
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

/**
 * Example to demonstrate the methods in the thread class
 */
public class Example9 {
    public static void main(String[] args){
        BaseThread b1 = new BaseThread();
        // Generating the Java Thread from Extending class of Thread Class
        Thread b2 = new BaseThread();

        // Generating the Java Thread from Implementing class of Runnable interface

        BaseThread1 r = new BaseThread1();
        Thread t1 = new Thread(r); // Passing the runnable interface
        Thread t2 = new Thread(r,"thread-2"); // passing runnable interface & Setting the name of the thread

//         How To Start The Thread
        t2.start();

        System.out.println("Id : " + t2.getId());
        System.out.println("Name : " + t2.getName());
        System.out.println("Priority : " + t2.getPriority());
        System.out.println("State : " + t2.getState());
        System.out.println("ThreadGroup : " + t2.getThreadGroup());

//        Changing the properties of thread
        t2.setName("thread-ram");
        System.out.println("New Name Of Thread : " + t2.getName());

//       Set Priority from 1 to 10
//         10 is equivalent to Thread.MAX_PRIORITY
//        default priority of thread is 5
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("New Priority Of Thread : " + t2.getPriority());

//       Before running thread 1, making it daemon thread
        t1.setDaemon(true);
        t1.start();
        /**
         * Daemon thread is background thread with minimum priority, it works in the background.
         * Ex. Garbage Collector
         * Ex Auto-Save Feature in MS-Word
         */
        System.out.println(t2.getState());
        System.out.println("Thread 1 : " + t1.getState());

//        Enquiry Methods
        System.out.println("Is Alive : " + t1.isAlive());
        System.out.println("Id Daemon : " + t1.isDaemon());
        System.out.println("Is Interrupted : " + t1.isInterrupted());

        // instance method
        


    }
}
