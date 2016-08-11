package lesson10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Created by Student on 11.08.2016.
 */
public class LTest {
    public static void main(String[] args){
        BiPredicate<Apple, Apple> p = (o1, o2) -> o1.getSize().equals(o2.getSize());
        //Comparator.comparing(Apple::getSize).reversed().thenComparing(Apple::getSize);
        List <Integer>  list = Arrays.asList(1,2,3,4,5);
       int sum = list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
