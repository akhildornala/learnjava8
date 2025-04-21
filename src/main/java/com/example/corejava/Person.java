package com.example.corejava;

import java.util.Objects;

public class Person {


    public String name;
    public int age;
    public Address address;

    public Person() {

    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    // Shallow copy
    public Person shallowCopy() {
        return new Person(this.name, this.age, this.address);
    }

    // Deep copy
    public Person deepCopy() {
        Address newAddress = new Address(this.address.houseNumber, this.address.area, this.address.city);
        return new Person(this.name, this.age, newAddress);
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }


}
