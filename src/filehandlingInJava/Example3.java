package filehandlingInJava;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:/Users/root/Downloads/Java_S2P_Codes/src/filehandlingInJava/data/data2.ser");
        ByteArrayInputStream bis = new ByteArrayInputStream(fis.readAllBytes());

        int x;
        while ( (x = bis.read()) != -1){
            System.out.print((char)x);
        }
    }
}
