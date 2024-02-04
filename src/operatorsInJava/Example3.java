package operatorsInJava;

public class Example3 {
    public static  double logBase10(int x){
            return Math.log10(x);
    }


    public static void main(String[] args) {
        int x = 100;
        double result = (logBase10(x) + (200* x) + x)/((100*x*x) + (64*x) + 25);
        System.out.println(result);
    }
}
