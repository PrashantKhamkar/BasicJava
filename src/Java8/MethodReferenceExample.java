package Java8;

import java.util.function.Function;

public class MethodReferenceExample {
    public static int square(int num){
        return num*num;
    }

    public static void main(String[] args) {

        MethodReferenceExample m = new MethodReferenceExample();
        Function<Integer,Integer> fun = MethodReferenceExample::square;
        System.out.println(fun.apply(5));
    }
}
