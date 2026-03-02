package Streams;

import java.util.stream.*;
import java.lang.Thread;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;

public class terminalOps {
    public static void main(String[] args) {

        // collect()
        // it Collect all the values that satisfies the intermediate operations condition then it will add it to the deffined Collection


        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(list.stream().skip(1).collect(Collectors.toList()));

        // forEach()
        //it checks all the elements in the stream that stisfies the itntermediate condition then it will directly priint it because it is a Collector

        list.stream().forEach(x -> System.out.println(x));

        //reduce()
        // Combines elements to produce the single result 

        Optional<Integer> opetionalsum = list.stream().reduce((x,y) -> x + y);
        System.out.println(opetionalsum);

        System.out.println(list.stream().reduce((x,y) -> x + y));

        // anyMatch()
        // It returns the only boolean values  if a single element that matches the condition

        System.out.println(list.stream().anyMatch(x -> x % 2 == 0));

        // allMatch()

        //it also returns the boolean values. if all the elements fullfill the conditions then it gives true othervise false;

        System.out.println(list.stream().allMatch(x -> x % 2== 0));


        //Example 

        List<String> ll = Arrays.asList("Durru", "Yogesh", "Pawa");

        System.out.println(ll.stream().filter(x -> x.length() <= 5).collect(Collectors.toList()));

        //findFirst()
        // It always returns the first element 

        System.out.println(list.stream().findFirst().get());
    }
}
