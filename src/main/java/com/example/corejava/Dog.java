package com.example.corejava;

public class Dog extends Pet {

    private String dogName;
    private String dogFood;

    @Override
    void eat() {
        System.out.println("eat() method of derived class");
        System.out.println("Dog is eating.");
    }

    // Method to call the base class method
    void eatAsAnimal() {
        super.eat();
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogFood() {
        return dogFood;
    }

    public void setDogFood(String dogFood) {
        this.dogFood = dogFood;
    }

    @Override
    public String test(String a) {
        return "from Dog " + a;
    }


}
