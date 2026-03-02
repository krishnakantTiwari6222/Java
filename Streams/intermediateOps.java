package Streams;

import java.util.stream.*;
import java.lang.Thread;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class intermediateOps {
    public static void main(String[] args) {

        //Intermediate Operations are transform a stream to another stream;
        // And also these must have a terminal Operation to execute the program;


        // filter()  its takes an agrguments as an Predicate

        List<String> list = Arrays.asList("Durgesh", "Naresh","Deepak", "Yogesh");
        System.out.println(list.stream().filter( x -> x.startsWith("D")).collect(Collectors.toList()));

        // map() 

        
        // Its takes an argument from a functional interface Functions which takes two arguments one is for input and another for the output


        // its takes a input and gives output after perfroming an operation

        
        System.out.println(list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList()));

        // Also we can use mathod reference 
        System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));

        // Output 
        // [DURGESH, NARESH, DEEPAK, YOGESH]


        // sorted 
         list.stream().sorted().forEach(x -> System.out.println(x));
        // Using Comparator

        Stream<String> sortedComparator = list.stream().sorted((a,b) -> a.length() - b.length());
        System.out.println(sortedComparator);


        // distint()

        // it always gives the distinct values for the somme operation is to be performed in the lambda function 

        System.out.println(list.stream().filter(x -> x.startsWith("D")).distinct().collect(Collectors.toList()));

        //limit()

        // it is only applicable when we iterate through the stream


        System.out.println(Stream.iterate(1, x -> x + 1).limit(100).count());

        //skip()

    }
}
