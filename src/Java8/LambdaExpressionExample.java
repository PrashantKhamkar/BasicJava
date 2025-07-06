package Java8;

import java.util.Comparator;

@FunctionalInterface
interface Employee{
    String getName(); //Abstract method
}


public class LambdaExpressionExample {

    public static void main(String[] args) {

        Employee e =()->"Software Engineering"; //Interface reference can be used to hold the lambda expression
        System.out.println(e.getName());
    }
}


