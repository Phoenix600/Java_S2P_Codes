package sortingAlgorithms;

import java.util.Random;

class CountingSort{
    private int size = 25;
    private Random random = new Random();
    private int[] inputArray;

    // constructor
    public CountingSort(){
        System.out.println("Creating the unsorted array array");
        createArray();
    }

    /**
     * To create the array with random elements from 0 to 100
     */
    void createArray(){
        int x;
        for(int i=0; i<size; i++){
            x = random.nextInt(0,100);
            inputArray[i] = x;
        }
    }

    public void countingSort(){

    }
}
public class Example1 {
    public static void main(String[] args) {
        
    }
}
