package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args){
        // Example of using map and flatMap in Java Streams
        List<String> names = Arrays.asList("John", "Jane", "Jack");

        // Using map to convert names to uppercase
        List<String> upperCaseNames = names.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
        System.out.println("Uppercase Names: " + upperCaseNames);

        // Using flatMap to flatten a list of lists
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("A", "B", "C","Z"),
            Arrays.asList("C", "W","D")
        );

        List<String> flattenedList = listOfLists.stream()
                                                .flatMap(List::stream)
                                                .collect(Collectors.toList());
        System.out.println("Flattened List: " + flattenedList);


        Optional<String> optionalValue = Optional.of("hello");

       String val=  optionalValue.map(String::toUpperCase).get();
       String val1=  optionalValue
               .flatMap(s -> Optional.of(s.toUpperCase()))
                       .get();

        System.out.println(val);
        System.out.println(val1);

    }
}
