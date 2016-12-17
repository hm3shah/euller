package java8;

import java.util.function.Function;

public class TestJava8 {


    public static void main(String[] args) {
        Function<Integer, Integer> add1 = x -> {
            int y = x;
            return y + 1;
        };

        Function<Integer, Integer> add = x -> x + 1;
        System.out.println(add1.apply(1));

        Thread t = new Thread(()->{
            System.out.println("Runnable implemented by using Lambda Expression");
        });

    }

}