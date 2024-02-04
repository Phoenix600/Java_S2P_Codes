package operatorsInJava;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
import java.lang.*;

public class Example6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("[+]Enter the range of even number to find");
        int n = input.nextInt();

        for (int i=0; i <=n; i++)
        {
            if((i&1)==0){
                System.out.println("Even : " + i);
            }
        }

    }
}
