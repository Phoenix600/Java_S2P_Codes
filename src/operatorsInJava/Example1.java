package operatorsInJava;

import java.lang.*;

public class Example1 {

    static int count = 0;

    static  int logBase10Recursive(int targetValue)
    {

        if(targetValue == 1)
                return count;
        count++;
        return logBase10Recursive(targetValue/10);
    }

    static int logBase10(int targetValue)
    {
        int count = 0;
        while (targetValue != 1){
            targetValue = targetValue / 10;
            count ++;
        }

        return count;
    }

    public static void main(String args[]){
        // Arithmetic Expression
        double x = Math.log10(100);
        System.out.println(x);

        int y = logBase10(10);
        System.out.println(y);
        System.out.println(logBase10Recursive(100));
    }
}
