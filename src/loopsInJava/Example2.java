package loopsInJava;

public class Example2 {
    // 2^0
    public static int twoBaseTox(int x){
        int i=1;
        int result = 1;
        if(x==0){
            return result;
        }
        while (i<=x){
            result = 2 * result;
            i++;
        }

        return result;
    }
    public static void main(String[] args){
        int n = 10;
        int i=0;
        while (i<=n){
            System.out.println(twoBaseTox(i));
            i++;
        }
    }
}
