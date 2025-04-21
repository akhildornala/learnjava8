package com.example.corejava;

public class Pet {

    private String petName;
    private String petFood;

    void eat() {
        System.out.println("eat() method of base class");
        System.out.println("Animal is eating.");
    }

    public String getPetFood() {
        return petFood;
    }

    public void setPetFood(String petFood) {
        this.petFood = petFood;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String test(String a) {
        return "from pet " + a;
    }


}
