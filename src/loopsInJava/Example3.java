package loopsInJava;

public class Example3 {

    public static int logBase2(int n){
        int count = 0;
        if(n==0)
            return 0;
        while (n!=1){
            n = n/2;
            count++;
        }

        return count;
    }
    public static void main(String[] args) {

    }
}
