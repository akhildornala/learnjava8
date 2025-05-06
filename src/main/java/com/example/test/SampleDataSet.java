package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class SampleDataSet {

    public static void main(String[] args) {

    }

    public static List<TestDTO> prepareTestData() {
        List<TestDTO> ls = new ArrayList<>();
        TestDTO obj1 = new TestDTO("akhil", "developer", 29, true);
        TestDTO obj2 = new TestDTO("female", "tester", 25, true);
        TestDTO obj3 = new TestDTO("abcd", "tester", 25, true);
        TestDTO obj4 = new TestDTO("abcd", "tester", 25, false);
        return List.of(obj1, obj2, obj3, obj4);
    }
}
