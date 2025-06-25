package com.example.multithread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class SquareRootUsingForLoop {


    public static void main(String[] args) {
        int input = 10000000;
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
        Map<Integer, Double> map = new HashMap<>();
        List<Double> resultList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            resultList.add(Math.sqrt(i));
        }

        return resultList;
    }

}
