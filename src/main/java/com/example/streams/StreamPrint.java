package com.example.streams;

import java.util.List;
import java.util.function.Consumer;

public class StreamPrint {
    public static void main(String args[]) {
        List<String> ls = List.of("one", "two", "three", "four", "six", "seven", "eight");
        System.out.println("###############################enhanced for loop");
        for (String element : ls) {
            System.out.println(element);
        }

        System.out.println("###############################stream input to other function");
        ls.stream().forEach(StreamPrint::printElement);

        System.out.println("###############################stream input to System class");
        ls.stream().forEach(System.out::println);

        System.out.println("###############################stream input to consumer function interface");
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        ls.stream().forEach(e -> consumer1.accept(e));

        System.out.println("###############################stream input to consumer lamda expression");
        Consumer<String> consumer2 = a -> System.out.println(a);
        ls.stream().forEach(x -> consumer2.accept(x));
    }

    public static int printElement(String element) {
        System.out.println(element);
        return 1;
    }
}
