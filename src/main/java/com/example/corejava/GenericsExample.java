package com.example.corejava;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String args[]) {
        List<? super Dog> ls = new ArrayList<>();
        ls.add(new Dog());
        ls.add(new Breed1Dog());


/* compilation error
        List<? extends Dog> ls2 = new ArrayList<>();
        ls2.add(new Pet());
        ls2.add(new Dog());
        ls2.add(new Breed1Dog());

 */
    }
}
