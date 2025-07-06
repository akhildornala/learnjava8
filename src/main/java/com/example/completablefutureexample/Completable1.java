package com.example.completablefutureexample;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Completable1 {

    public static void main(String args[]) {
        try {
            Integer number = 1;
            CompletableFuture<Long> completableFuture = CompletableFuture.supplyAsync(() -> factorial(number));
            while (!completableFuture.isDone()) {
                System.out.println("CompletableFuture is not finished yet...");
            }
//            long result = completableFuture.get();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Long factorial(Integer number) {
        System.out.println(number);
        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }
        return Long.valueOf(1);
    }
}
