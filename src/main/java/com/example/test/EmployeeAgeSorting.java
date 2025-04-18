package com.example.test;

import java.util.Comparator;

public class EmployeeAgeSorting implements Comparator<Employee> {

    @Override
    public int compare(final Employee e1, final Employee e2) {
        return e1.geteAge() - e2.geteAge();
    }

}
