package com.example.corejava;

import com.example.test.SampleDataSet;
import com.example.test.TestDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSortByBoolean {

    public static void main(String[] args) {
        List<TestDTO> ls = new ArrayList<>(SampleDataSet.prepareTestData());
        System.out.println("#################################################");
        System.out.println("before sorting");
        printList(ls);
        System.out.println("#################################################");
        Comparator<TestDTO> comp1 = (o1, o2) -> o1.geteName().compareTo(o2.geteName());
        ls.sort(comp1);
        System.out.println("after sorting");
        printList(ls);
        System.out.println("#################################################");
//        System.out.println("after second sorting");
//        Comparator<TestDTO> comp2 = (o1, o2) -> o1.isMale()?-1:1;
//        ls.sort(comp2);
//        printList(ls);
        System.out.println("#################################################");
        System.out.println("after third sorting");
        Comparator<TestDTO> comp3 = (o1, o2) -> o1.isMale()?-1:1;
        ls.sort(comp1.thenComparing(comp3));
        printList(ls);

    }

    private static void printList(List<TestDTO> ls) {
        System.out.println("####################");
        for (TestDTO dto : ls) {
            System.out.println(dto.geteName() + " -" + dto.isMale());
        }
        System.out.println("####################");
    }
}
