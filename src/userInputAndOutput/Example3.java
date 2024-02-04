package userInputAndOutput;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        String src  = "Hello 123 People 456";
        Scanner sc = new Scanner(src);

        while (sc.hasNext()){
            if(sc.hasNextInt()){
//                System.out.println(sc.nextInt());
                sc.next();
//                sc.nextInt();
            }else{
//                sc.next();
                System.out.println(sc.next());
            }
        }
    }
}
