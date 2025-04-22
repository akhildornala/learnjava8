package com.example.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test6Solution {

    public static void main(String[] args) {
        List<People> peps = new ArrayList<>();

        peps.add(new People(123, "M", 14.25));
        peps.add(new People(123, "M", 14.15));
        peps.add(new People(234, "M", 6.21));
        peps.add(new People(362, "F", 9.23));
        peps.add(new People(111, "M", 65.99));
        peps.add(new People(535, "F", 9.23));

        List<People> pep2 = new ArrayList<>(peps);

        Comparator<People> comparator = new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                if (o1.getId() == o2.getId()) {
                    return Double.compare(o1.getPrice(), o2.getPrice());
                }
                return o1.getId() - o2.getId();
            }
        };

        Comparator<People> comp2 = Comparator.comparing(People::getId).thenComparing(People::getPrice);


        peps.sort(comparator);

        for (int i = 0; i < peps.size(); i++) {
            System.out.println(peps.get(i));
        }
        System.out.println("second list before sorting");
        for (People p : pep2) {
            System.out.println(p);
        }
        System.out.println("second list after sorting");
        Collections.sort(pep2, comp2);
        for (People p : pep2) {
            System.out.println(p);
        }


    }
}
