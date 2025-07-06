package Java8;

import java.util.function.*;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        //1. Predicate - test() is abstract method
        Predicate<Integer> p = x->x%2==0;
        System.out.println("Predicate answer->"+p.test(4));

        //2. Function - apply() is abstract method
        //accept argument and produce resulte
        Function<String,Integer> f=x->x.length();
        System.out.println("Functional answer->"+f.apply("Prashant"));

        //3. Consumer - void accept() abstract method
        Consumer<String> c = s-> System.out.println(s);
        c.accept("Prashant khamkar");

        //4. Supplier- get() is abstract method
        Supplier<Integer> sup = ()->100;
        System.out.println("Suplier answer:->"+sup.get());


        System.out.println("------------------");
        //Bipredicate,BiFunction, BiConsumer
        BiPredicate<String,String> bp = (x,y)->x.length()==y.length();
        System.out.println("Bipredicate answer->"+bp.test("Prashant","Samartha"));

        BiFunction<String,String,Integer> bf= (x,y)->x.length()+y.length();
        System.out.println("BiFunction answer->"+bf.apply("Prashant","Khamkar"));

        BiConsumer<Integer, Integer> bc= (x, y)-> System.out.println(x+y);
        bc.accept(5,5);


        //UnaryOperator- input and output datatype is same then we can use Unary oprator
        UnaryOperator<String> us=s->s.toLowerCase();
        System.out.println("UnaryOperator answer:->"+us.apply("PRASHANT"));

        //BinaryOperator- Bifunction having input and output datatype is same then we use BinaryOperator
        BinaryOperator<String> bo= (x,y)->x+y;
        System.out.println("Binary Operator answer:->"+bo.apply("Prashant"," Khamkar"));
    }
}
