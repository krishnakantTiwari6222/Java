package LambdaExpression;
import java.util.stream.*;
import java.lang.Thread;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
public class Operation {
    public static void main(String[] args) {
        functionalIntergfaces sumOperation = (a,b) -> a+b;
        int res =  sumOperation.operate(1 , 2);
        System.out.println(res);

        functionalIntergfaces subOperation = (a,b) -> a-b;
        int res2 = subOperation.operate(10, 5);
        System.out.println(res2);
 

        functionalIntergfaces mulOperation = (a,b) -> a * b;
        int res3 = mulOperation.operate(10, 20);
        System.out.println(res3);

        Predicate<Integer> isEven = a -> a % 2 == 0;
        System.out.println(isEven.test(50));        // It always returns the boollean value in which the argument is passed;

        Function<Integer , Integer> square = x -> x * x;
        System.out.println( square.apply(5));       // It always return the some operation in thr same return tupe;

        Consumer<Integer> consume = x -> System.out.println(x);

        // It is a functional interface where single method is iplemented and it does not return anything . it only prints 

        List<String> list = Arrays.asList("java", "Python" , "html");

        list.stream().forEach(x -> System.out.println(x));

        // Output
        // java
        // Python
        // html



        // Also we can use method reference in this like
        // Method Reference :- using method without invoking & in place of lambda expression

        // So in this we are giving the method as a variable like below


        list.stream().forEach(System.out::println);
    }
}
