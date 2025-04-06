package com.example.test;

import java.util.List;
import java.util.stream.Collectors;

public class Test3FlatMap {

    public static void main(String args[]){
        List<Employee> employeeList = Employee.getEmployeeDefaultData();
        System.out.println(employeeList.stream()
                .map(Employee::getSkills)
                .toList());
        System.out.println(employeeList.stream()
                .flatMap(e-> e.getSkills().stream())
                .toList());

    }
}
