package com.example.corejava;

public class Test5Solution {

    // Main Function
    public static void main(String args[]) {
        Dog d1 = new Dog();
        Pet a1 = new Pet();

        // Calls the eat() method of Dog class
        d1.eat();

        // Calls the eat() method of Animal class
        a1.eat();

        // Polymorphism: Animal reference pointing to Dog object
        Pet pet = new Dog();

        // Calls the eat() method of Dog class
        pet.eat();



        // To call the base class method, you need to use a Dog reference
        ((Dog) pet).eatAsAnimal();
    }
}
