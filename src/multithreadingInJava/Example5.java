package multithreadingInJava;


import javax.naming.ldap.SortResponseControl;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

enum SORT_METHOD{
    SORT,
    PARALLEL_SORT
}

/**
 * Asynchronous Example
 */
class SortArrays implements Runnable{
    static int count = 0;
    int id;
    SORT_METHOD method;

    public SortArrays(SORT_METHOD method){
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
    @Override
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

public class Example5 {
    public static void main(String[] args) {

        Runnable r[] = new SortArrays[3];
        SORT_METHOD method = SORT_METHOD.PARALLEL_SORT;
        for (int i=0; i<3; i++){
            if(i%2 == 0) {
                method = SORT_METHOD.PARALLEL_SORT;
            }else{
                method = SORT_METHOD.SORT;
            }
            r[i] = new SortArrays(method);
        }
//        Runnable r = new SortArrays(SORT_METHOD.PARALLEL_SORT);
//        Runnable r1 = new SortArrays(SORT_METHOD.SORT);
//        Runnable r3 = new SortArrays(SORT_METHOD.PARALLEL_SORT);
        Thread[] t1 = new Thread[3];
        for (int i=0; i<3; i++)
        {
            t1[i] = new Thread(r[i]);
        }
        t1[0].start();
        t1[1].start();
        t1[2].start();
    }
}
