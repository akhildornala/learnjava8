package com.example.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SquareRootOfNNumbers {

    public static void main(String[] args) {
        int input = 10;
        try {
            long startTime = System.currentTimeMillis();
            List<Double> squareRoots = calculateSquareRoots(input);
            long endTime = System.currentTimeMillis();

            long durationInMilliSec = endTime - startTime;
            System.out.println("durationInMilliSec is :" + durationInMilliSec);
//            System.out.println("Square roots from 0 to " + input + ":");
//            System.out.println(squareRoots);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<Double> calculateSquareRoots(int n) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        ConcurrentHashMap<Integer, Double> map = new ConcurrentHashMap<>();
        List<Future<?>> futures = new ArrayList<>();
        List<Double> resultList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            final int num = i;
            Future<?> future = executor.submit(() -> {
                Double res = Math.sqrt(num);
                resultList.add(res);
                map.put(num, res);
            });
            futures.add(future);
        }

        for (Future<?> f : futures) {
            f.get();
        }

        executor.shutdown();

//        for (int i = 0; i <= n; i++) {
//            resultList.add(map.get(i));
//        }

        return resultList;
    }
}
