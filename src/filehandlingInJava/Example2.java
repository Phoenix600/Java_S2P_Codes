package filehandlingInJava;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) throws IOException {
        byte B[] = "Java Programming Is Funnn".getBytes();
        byte B1[] = {56,78,89,45,65,97};

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        FileOutputStream fos = new FileOutputStream("C:/Users/root/Downloads/Java_S2P_Codes/src/filehandlingInJava/data/data1.ser");
        FileOutputStream fos1 = new FileOutputStream("C:/Users/root/Downloads/Java_S2P_Codes/src/filehandlingInJava/data/data2.ser");


        bos.write(B[0]);
        bos.writeTo(fos);
        bos.reset();
        bos.write(B);
        bos.writeTo(fos1);

    }
}
