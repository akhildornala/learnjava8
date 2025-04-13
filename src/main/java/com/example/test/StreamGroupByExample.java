package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamGroupByExample {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getEmployeeDefaultData();

        System.out.println(employeeList.stream()
                .collect(Collectors.groupingBy(Employee::geteSal, Collectors.counting())));

        System.out.println(employeeList.stream()
                .collect(Collectors.groupingBy(Employee::geteSal, Collectors.summingDouble(Employee::geteSal))));

        String str = "hello world";
        String[] arr = str.split("");
        List<String> ls = new ArrayList<>(Arrays.asList(arr));
        System.out.println(ls.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting())));


    }
}
