package filehandlingInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream
 */
public class Example6 {
    public static void main(String[] args) {
        try {

            File file = new File("C:/Users/root/Downloads/Java_S2P_Codes/src/filehandlingInJava/data/data2.ser");
            FileInputStream fis = new FileInputStream(file);
            int x;
            while ( (x = fis.read()) != -1){
                System.out.print((char)x);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
