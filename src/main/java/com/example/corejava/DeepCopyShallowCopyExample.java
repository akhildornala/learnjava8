package com.example.corejava;

public class DeepCopyShallowCopyExample {

    public static void main(String[] args) {
        Address address = new Address("1", "dsnr", "hyd");
        Person p1 = new Person("Akhil", 29, address);

        Person p2 = p1.shallowCopy();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);

        p2.address.city ="bangalore";
        System.out.println(p1);
        System.out.println(p2);

        // Deep copy
        Person person3 = p1.deepCopy();
        person3.address.area = "789 Different St";

        System.out.println(p1.address.area); // Output: 456 New St
        System.out.println(person3.address.area); // Output: 789 Different St

    }
}
