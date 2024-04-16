package collectionInJava.streamAPI;

import java.util.List;
import java.util.function.Consumer;

public class Example12 {
    public static void main(String[] args) {
        List<Integer> bigList =  List.of(12,13,14,15,16);
        bigList.stream().forEach(i-> System.out.println(Thread.currentThread().getName() + ":" + i));
        System.out.println("ForkJoin Pool");
        bigList.parallelStream().forEach(i-> System.out.println(Thread.currentThread().getName() + ":" + i));

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        bigList.stream().forEach(consumer);
        bigList.forEach(consumer);
    }
}
