package multithreadingInJava;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

class SortList {
    static int count = 0;
    int id;
    SORT_METHOD method;

    public SortList(SORT_METHOD method){
        super();
        this.method = method;
        this.init();
        id = count;
        count++;
    }
    Random random = new Random();
    int x = random.nextInt(0,898);
    int A[] = new int[100000000];
    void init(){
        for (int i=0; i<A.length; i++){
            x = random.nextInt();
            A[i] = x;
        }
    }

    public void run() {
        long time1 = new Date().getTime();
        if(method == SORT_METHOD.SORT){
            Arrays.sort(A);
        }else{
            Arrays.parallelSort(A);
        }
        long time2 = new Date().getTime();
        System.out.println("Total Time for thread " + id + " : " +  (time2-time1));
    }
}

public class Example6 {
    public static void main(String[] args) {
        SortList s = new SortList(SORT_METHOD.SORT);
        SortList s1 = new SortList(SORT_METHOD.PARALLEL_SORT);
        long t1 = new Date().getTime();
        s.run();
        s1.run();
        long t2 = new Date().getTime();
        System.out.println("Total Time : " + (t2-t1));
    }
}
