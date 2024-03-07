package filehandlingInJava;

import java.io.*;

public class Example8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("C:/Users/root/Downloads/Java_S2P_Codes/src/filehandlingInJava/data/data2.ser");
        FileInputStream fis = new FileInputStream("C:/Users/root/Downloads/Java_S2P_Codes/src/filehandlingInJava/data/data2.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int data = ois.available();
        System.out.println(data);
    }
}