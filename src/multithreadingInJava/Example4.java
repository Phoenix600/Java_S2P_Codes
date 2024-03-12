package multithreadingInJava;

import java.util.Date;

class MyThread extends Thread{
    private String word;
    public MyThread(String word){
        super();
        this.word = word;
    }

    @Override
    public void run(){
        Date d  = new Date();
        long time1 = d.getTime();

        for (int i=0; i<10000000; i++)
        {
            int x = 12+13;
//            System.out.println(word);
        }

        long time2 = new Date().getTime();
        System.out.println("Time-Taken : " + (time2-time1));
    }

}
public class Example4 {
    public static void main(String[] args) {
     MyThread t1 = new MyThread("Java");

     Thread t2 = new MyThread("Java");
     Thread t3 = new MyThread("Python");

     t2.start();
     t3.start();

    }
}
