package com.example.streams;

import com.example.test.Employee;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Top3SalaryList {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getEmployeeDefaultData();
        List<Double> top3SalList = employeeList.stream()
                .map(Employee::geteSal)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(top3SalList);

        Map<String, Employee> employeeMap = employeeList.stream()
                .collect(Collectors.toMap(Employee::geteName, Function.identity(), (oldVal, newVal) -> newVal));
        System.out.println(employeeMap);

        /*
        Map<String,List<Dish>> dishMap = menu.stream().collect(Collectors.groupingBy(
            Dish::getType,
            LinkedHashMap::new, Collectors.toList()));
         */


        Map<String, List<Employee>> employeeMap2 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::geteName, LinkedHashMap::new, Collectors.toList()));
        System.out.println(employeeMap2);


    }
}
