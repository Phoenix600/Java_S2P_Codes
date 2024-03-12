package multithreadingInJava;

class MyThread1 extends Thread{
    int count = 0;
    void display(){
        while (count != 100){
            System.out.println("Hello : " + (-count));
            count++;
        }

    }
    @Override
    public void run() {
        super.run();
        display();
    }
}



/**
 * Daemon Thread And Join
 */
public class Example2 {
    public static void main(String[] args) throws Exception {

    }
}
