package filehandlingInJava;

import java.io.*;

public class Example7 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/root/Downloads/Java_S2P_Codes/src/filehandlingInJava/data/data2.ser");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write("Java May Be Good, But C is Better".getBytes());
        fos.flush();

        byte b[] = {65,66,67};
        fos.write(b);

        fos.close();

    }

    public static class Example8 {
        public static void main(String[] args) throws IOException, ClassNotFoundException {
            File file = new File("C:/Users/root/Downloads/Java_S2P_Codes/src/filehandlingInJava/data/data2.ser");
            FileInputStream fis = new FileInputStream("C:/Users/root/Downloads/Java_S2P_Codes/src/filehandlingInJava/data/data2.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int data = ois.available();
            System.out.println(data);
        }
    }
}
