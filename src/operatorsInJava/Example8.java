package operatorsInJava;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        int x = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("[+]Enter the number of left shifting : ");
        int n = input.nextInt();
        System.out.println(x);
        System.out.println("After shifting : " + (x<<n));

        for (int i=0; i<5; i++)
        {
            x = (x<<1);
        }


        // 0 0 0 1
        // 0 0 1 0   <--- (x << 1)

        // 0 0 0 1
        // 0 1 0 0  <-----(x << 2)



    }
}
