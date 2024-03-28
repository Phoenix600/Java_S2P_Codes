package collectionInJava.map;

import com.mysql.cj.result.DefaultValueFactory;

import java.util.*;

// Implementation of map interface
public class Example2 {
    public static void main(String[] args) throws  Exception
    {
        Map<String,Integer>numbers = new HashMap<>();
        // Adding data in the map
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
        System.out.println("Content Of Map-1 : " + numbers);

        Map<String,Integer> numbers1 = new HashMap<>();
        numbers1.put("Pranay",17);
        System.out.println("Content Of Map-2 : " + numbers1);

        numbers.putAll(numbers1);
        System.out.println("Content Of Map-1 after adding the Map-2 : " + numbers);

        numbers.putIfAbsent("Pranay",12);
        System.out.println(numbers);

        Integer x = numbers.get("one");
        System.out.println("Key Associated With {'one' : " + x + "}");

        // if key value associated with one is present then its value is sent otherwise default value 2 is sent
       x =  numbers.getOrDefault("one",2);
       System.out.println(x);

       boolean result = numbers.containsKey("nine");
       System.out.println("'nine' key is present in hashMap : " + result);

       result = numbers.containsValue("Pranay");
       System.out.println("'Pranay' is present in hashMap : " + result);

       numbers.replace("one",1111);
        System.out.println("HashMap after replacing the key-value pair : " + numbers);

        numbers.replace("pranay",177,170);
        System.out.println("Content Of HashMap : " + numbers);

        numbers.remove("pranay");
        System.out.println("Content of HashMap after removal of 'Pranay' : " + numbers);

        numbers.remove("two",2);
        System.out.println("Content of hashMap after removal of 'two' : " + numbers);

        Set<String> keySet = numbers.keySet();
        System.out.println("Keys present in HashMap : " + keySet);

        Collection<Integer> values = numbers.values();
        System.out.println("Values present in hashMap : "+values);

        Set<Map.Entry<String,Integer>> keyvalue =  numbers.entrySet();
        System.out.println(keyvalue);
    }
}
