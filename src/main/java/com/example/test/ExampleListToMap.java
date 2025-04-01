package com.example.test;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExampleListToMap {

    public static void main(String args[]) {
        System.out.println("welcome Akhil Dornala");
        List<Employee> employeeList = Employee.getEmployeeDefaultData();
        System.out.println("printing list");
        System.out.println(employeeList);
        System.out.println("end of list");
        Map<String, Employee> employeeMap = employeeList.stream()
                .collect(Collectors.toMap(Employee::geteName, Function.identity()));
        System.out.println(employeeMap);
    }
}
