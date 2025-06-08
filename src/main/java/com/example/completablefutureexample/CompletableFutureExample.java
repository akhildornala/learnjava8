package com.example.completablefutureexample;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {

    public static void main(String args[]) {
        CompletableFutureExample obj1 = new CompletableFutureExample();
        try {
            System.out.println("start");
            TestEmployee emp = new TestEmployee();
            System.out.println(emp);
            List<CompletableFuture<Void>> ls = new ArrayList<>();

            ls.add(obj1.getApiInfo1(emp));
            ls.add(obj1.getApiInfo2(emp));
            ls.add(obj1.getApiInfo3(emp));
            ls.forEach(CompletableFuture::join);
            System.out.println("end");
            System.out.println(emp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    CompletableFuture<Void> getApiInfo1(TestEmployee emp) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("inside getApiInfo1:" + new Date());
            emp.setEmpId(1);
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("inside getApiInfo1 after sleep:" + new Date());
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
        return future;
    }

    CompletableFuture<Void> getApiInfo2(TestEmployee emp) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("inside getApiInfo2:" + new Date());
            emp.setDept("CSE");
        });
        return future;
    }

    CompletableFuture<Void> getApiInfo3(TestEmployee emp) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("inside getApiInfo3:" + new Date());
            emp.setName("AKHIL DORNALA");
        });
        return future;
    }

}
