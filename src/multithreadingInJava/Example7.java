package multithreadingInJava;

class MyThreadClass extends Thread{
    void display(){
        while (true){
            System.out.println("Java");
        }
    }

    @Override
    public void run(){
        display();
    }
}

public class Example7 {
    public static void main(String[] args) {
      Thread main_thread =   Thread.currentThread();
        System.out.println("Id : " + main_thread.getId());
        System.out.println("Name : " + main_thread.getName());
        System.out.println("State :" + main_thread.getState().name());
        System.out.println("Priority : " + main_thread.getPriority());
        main_thread.setPriority(10);
        System.out.println("Priority : " + main_thread.getPriority());
        System.out.println("Daemon : "  + main_thread.isDaemon());

        Thread t1 = new MyThreadClass();
        System.out.println("Id : " +t1.getId());
        System.out.println("Name: " + t1.getName() );
        t1.setName("MyThread");
        System.out.println("Name: " + t1.getName() );
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Priority : " + t1.getPriority());

    }

}
