package collectionInJava.map;

import java.io.*;
import java.util.*;

// Example Of MultiMaps
public class Example8 {

    public static String alphabetize(String word)
    {
        char[] alpha = word.toCharArray();
        Arrays.sort(alpha);
        return new String(alpha);
    }
    public static void main(String[] args) throws Exception{
        // Setup For Reading File Using Scanner and File Object
        File file = new File("C:/Users/root/IdeaProjects/Java_S2P_Codes/src/collectionInJava/map/data/data.ser");
        Scanner input = new Scanner(file);
        Integer minimumGroupSize =  5; // the minimum size of anagram group to print out.
        // Anagram groups containing fewer words than the specified minimumGroupSize are not printed.

        // Multi-Map Store the word and its anagram
        Map<String, List<String>> m = new HashMap<>();

        while (input.hasNext())
        { 
            String value = input.next();
            String key =  alphabetize(value);
            List<String> l = m.get(key);
            if(l == null)
            {
                l = new LinkedList<>();
                m.put(key,l);
            }
            l.add(value);
        }


        for(List<String> x : m.values())
        {
            if(x.size() >= minimumGroupSize)
            {
                System.out.println(x.size() + ":" + x);
            }
        }


    }
}
