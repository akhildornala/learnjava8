package com.example.test;

import java.util.Objects;

public class Test4 {

    public Test4(String name, int age, String dept) {
        System.out.println("inside cons");
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public Test4 Test4(String name, int age, String dept) {
        System.out.println("inside void test4");
        this.name = name;
        this.age = age;
        this.dept = dept;
        return this;
    }

    private String name;
    private int age;
    private String dept;

    @Override
    public String toString() {
        return "Test4{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Test4 test4 = (Test4) o;
        return age == test4.age && Objects.equals(name, test4.name) && Objects.equals(dept, test4.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dept);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


}
