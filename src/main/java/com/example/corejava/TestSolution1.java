package com.example.corejava;

public class TestSolution1 {

    public static void main(String args[]) {
        int num = 2;
        ParentClass1 obj1 = new ParentClass1();
        ParentClass1 obj2 = new ChildClass1();
        System.out.println(sol(obj1, num));
        System.out.println(sol(obj2, num));

    }

    private static int sol(ParentClass1 ref, int num) {
        return ref.calculate(num);
    }
}
