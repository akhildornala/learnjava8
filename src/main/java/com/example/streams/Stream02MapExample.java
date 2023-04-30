package com.example.streams;

import java.util.List;

public class Stream02MapExample {
    public static void main(String args[]) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        courses.stream().forEach(Stream02MapExample::printElement);

        System.out.println("################# stream of elements with length");
        courses.stream()
                .map(e -> e + "=>" + e.length())
                .forEach(Stream02MapExample::printElement);


        System.out.println("################# stream of elements filtered with spring");
        courses.stream()
                .filter(e -> e.contains("Spring"))
                .forEach(Stream02MapExample::printElement);
    }

    public static void printElement(String element) {
        System.out.println(element);
    }
}
