package filehandlingInJava;

import java.io.FileInputStream;
import java.io.IOException;

public class Example4 {
    public static void main(String[] args) throws IOException {
        // Doesn't support mark() and reset() mechanism
        FileInputStream fis = new FileInputStream("C:/Users/root/Downloads/Java_S2P_Codes/src/filehandlingInJava/data/data2.ser");
        int x;

        while ((x= fis.read())!= -1)
        {
            System.out.print((char)x);
        }


        while ((x=fis.read())!=-1){
            System.out.print((char)x);
            fis.skip(2);
        }

        fis.close();
    }
}
