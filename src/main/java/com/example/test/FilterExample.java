package com.example.test;


import java.util.List;

public class FilterExample {
    public static void main(String args[]) {
        List<Employee> employeeList = Employee.getEmployeeDefaultData();

        employeeList.stream()
                .forEach(e -> {
                    System.out.println(e.geteName());
                });
    }
    
}
