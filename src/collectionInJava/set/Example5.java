package collectionInJava.set;

import java.util.HashSet;

// Finding Duplicates
public class Example5 {
    public static void main(String[] args) {
        // Finding the duplicate elements
        String words[] = "Programmer Came Programmer Saw Programmer Left".split(" ");
        HashSet<String> uniqueWordsSet = new HashSet<>();
        for (String word : words)
        {
               if(uniqueWordsSet.contains(word))
               {
                   System.out.println("Duplicate Found " + word);
               }else{
                   uniqueWordsSet.add(word);
               }
        }
    }
}
