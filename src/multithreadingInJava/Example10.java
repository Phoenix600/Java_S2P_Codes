package multithreadingInJava;

class KThread extends Thread{
    @Override
    public void run(){
        while (true){
            try {
                System.out.println("Running a thread " + this.getId());
                Thread.sleep(300);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
public class Example10 {
    public static void main(String[] args) throws Exception{
        Thread t1 = new KThread();
        Thread t2 = new KThread();

        t1.start();
        t2.start();

        System.out.println("Start of main program.....");
        Thread t3 = Thread.currentThread();

        // main method should join other threads, to complete execution
        // Termination of one thread may not cause the termination of main thread,
        // so to handle this, we join the main thread with other thread.
        t3.join(1000);

        System.out.println("End of main program.....");

        // Static Methods
        System.out.println( "Total Active Threads In Pool  : " + Thread.activeCount());

        Thread.yield(); // TO avoid starvation
        Thread.dumpStack();

    }
}
