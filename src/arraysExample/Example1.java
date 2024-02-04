package arraysExample;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        Integer A[] = {1,2,12,11,99};

        int B[][] = new int[3][];

        for (int i=0; i<3; i++)
        {
            B[i] = new int[3];
        }

        int firstMax = A[0];
        int secondMax = A[0];

        System.out.println(Arrays.deepToString(A));


        for (int i=0;  i< A.length; i++)
        {
            if(firstMax < A[i]){
                secondMax = firstMax;
                firstMax = A[i];
            }else if(secondMax < A[i]){
                secondMax = A[i];
            }
        }

        System.out.println(Arrays.deepToString(A));
        System.out.println(firstMax);
        System.out.println(secondMax);

    }
}
