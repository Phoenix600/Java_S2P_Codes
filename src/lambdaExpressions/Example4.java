package lambdaExpressions;

import java.io.File;

@FunctionalInterface
interface  LambdaExpression{
   int add(int a, int b);
}


public class Example4 {
    public static void main(String[] args) {
        LambdaExpression e1 = (a,b)->a+b;
        LambdaExpression e2 = Integer::sum;

    }
}
