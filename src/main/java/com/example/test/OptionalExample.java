package com.example.test;

import java.util.Optional;

public class OptionalExample {

    public static void main(String args[]) {
        Optional<String> opt = Optional.ofNullable("Akhil");
        if (opt.isPresent()) {
            System.out.println(opt.get());
        } else {
            System.out.println("name is not present");
        }
    }
}
