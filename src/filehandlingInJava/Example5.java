package filehandlingInJava;

import java.io.File;
import java.util.Arrays;

/**
 * Example on File Object
 */
public class Example5 {
    public static void main(String[] args) {

        File file = new File("C:/Users/root/Downloads/Java_S2P_Codes/src/filehandlingInJava/data/");

//        Returns the list of folder and files present in current folder
        String[] listOfFiles = file.list();
        System.out.println(Arrays.deepToString(listOfFiles));

        System.out.println(file.canExecute());

//        Returns the parent directory path
        String parent = file.getParent();
        System.out.println(parent);

        boolean result = file.exists();
        System.out.println(result);

        result = file.isFile();
        System.out.println("File : "+ result);

//        Returns the available data-drives or simple file systems
        File[] filesList  = File.listRoots();
        System.out.println(Arrays.deepToString(filesList));

        result = file.canRead();
        System.out.println(result);

        result = file.canExecute();
        System.out.println(result);

//        file.delete();


        long size = file.getFreeSpace();
        size = file.getTotalSpace();
        System.out.println("Free Space : " + size/1000/1000000 +"Gb");

        result = file.isDirectory();
        System.out.println("Folder : " + result);

    }
}
