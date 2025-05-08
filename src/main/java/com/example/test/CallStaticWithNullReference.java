package com.example.test;

import java.util.Collections;
import java.util.HashMap;

public class CallStaticWithNullReference {

        public static void main(String args[]){
            System.out.println(Employee.getEmployeeDefaultData());
            Employee emp = null;
            System.out.println(emp.getEmployeeDefaultData());

            Collections.synchronizedMap(new HashMap<>());

        }
}
