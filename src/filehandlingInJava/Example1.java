package filehandlingInJava;

import java.io.*;

/**
 * ByteArrayInputStream Example
 * @author  root
 * @since 06/3/24
 * @link www.oracle.docs.com/java17
 */
public class Example1 {
    /**
     * Driver method for demonstrating the usage of ByteArrayInputStream
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        byte B1[] = {1,2,3,4,32,97,98,99,65,66,67};

        ByteArrayInputStream bis = new ByteArrayInputStream(B1);

        ByteArrayInputStream bis1 = new ByteArrayInputStream(B1,5,4);
        byte b;

        while ((b= (byte) bis.read())!=-1){
            System.out.print((char)b);
        }

        System.out.println("Printing Another Stream");
        while ((b=(byte)bis1.read())!= -1){
            System.out.print((char)b);
        }
    }
}
