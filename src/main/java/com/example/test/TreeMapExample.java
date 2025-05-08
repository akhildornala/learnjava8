package com.example.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TreeMapExample {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(Employee.getEmployeeDefaultData());


        Map<String, Employee> treeMap = new TreeMap<>();
        treeMap = employeeList.stream()
                .collect(Collectors.toMap(Employee::geteName, v -> v, (v1, v2) -> v1, TreeMap::new));
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::geteName, TreeMap::new, Collectors.toList()));
        treeMap.entrySet()
                .stream()
                .forEach(System.out::println);
        System.out.println("#######################################");
        for (Map.Entry<String, Employee> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        // Convert the list to a TreeMap where keys are names and values are also names
        TreeMap<String, String> nameMap = convertListToTreeMap(names, name -> name);
        System.out.println(nameMap);

        List<Integer> numbers = List.of(5, 2, 8, 1, 9);

        // Convert the list to a TreeMap where keys are numbers and values are their squares
        TreeMap<Integer, Integer> numberMap = convertListToTreeMap(numbers, number -> number);
        System.out.println(numberMap);

        TreeMap<String, Employee> employeeTreeMap = convertListToTreeMap(employeeList, Employee::geteName);
        System.out.println(employeeTreeMap);

        Map<String, Employee> customTreeMap = generateTreeMap(employeeList);
        System.out.println("custom");
        System.out.println(customTreeMap);

        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.geteName().compareTo(o2.geteName());
            }
        };

        TreeMap<Employee, String> treeMap1 = new TreeMap<>(comparator);
        treeMap1 = employeeList.stream()
                .collect(Collectors.toMap(Function.identity(), Employee::geteName, (v1, v2) -> v1, TreeMap::new));
        System.out.println("sorting");
        System.out.println(treeMap1);
        System.out.println("############################");
        employeeList.sort(new EmployeeNameSorting());
        System.out.println(employeeTreeMap);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        employeeList.sort(new EmployeeAgeSorting());
        System.out.println(employeeList);
        System.out.println("end");



    }

    public static <K, V> TreeMap<K, V> convertListToTreeMap(List<V> list, java.util.function.Function<V, K> keyMapper) {
        return list.stream().collect(Collectors.toMap(keyMapper, v -> v, (v1, v2) -> v1, TreeMap::new));
    }

    public static TreeMap<String, Employee> generateTreeMap(List<Employee> employeeList) {
        TreeMap<String, Employee> treeMap = employeeList.stream().collect(Collectors.toMap(Employee::geteName, v -> v, (v1, v2) -> v1, TreeMap::new));
        employeeList.stream().collect(Collectors.toMap(Employee::geteName, v->v, (v1,v2)->v1, LinkedHashMap::new));
        return treeMap;
    }
}
