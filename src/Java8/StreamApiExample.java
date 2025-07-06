package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExample {

    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,1,2,3);

        List<Integer> filterList = li.stream().filter(x->x%2==0).map(x->x/2).distinct().
                sorted((a,b)->b-a).limit(5).skip(1)
                .collect(Collectors.toList());
        System.out.println(filterList);

        Integer i = Stream.iterate(0,x->x+1).limit(101).map(x->x/2).max((a,b)->a-b).get();
        System.out.println(i);
    }
}
