package com.example.test;

import java.util.Comparator;

public class EmployeeNameSorting implements Comparator<Employee> {

    @Override
    public int compare(final Employee e1, final Employee e2) {
        return e1.geteName().compareTo(e2.geteName());
    }
}
