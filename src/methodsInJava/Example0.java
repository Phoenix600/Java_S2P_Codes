package methodsInJava;

public class Example0 {

    static int getMax(int x, int y){
        return x>y?x:y;
    }

    static int getMax(int x, int y, int z){
        return (x>y && x>z) ? x : (y>z)?y:z;
    }
    public static void main(String[] args) {
        int max1 = getMax(12,13);
        System.out.println(max1);
        int max2 = getMax(6,45,34);
        System.out.println(max2);
    }
}
