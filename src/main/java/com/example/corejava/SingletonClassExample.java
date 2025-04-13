package com.example.corejava;

public class SingletonClassExample implements Cloneable {

    private String str = "hello";

    private static SingletonClassExample obj;

    private SingletonClassExample() {

    }

    public synchronized static SingletonClassExample createObj() {
        if (obj == null) {
            obj = new SingletonClassExample();
        }
        return obj;
    }

    public static void main(String[] args) {
        SingletonClassExample obj1 = SingletonClassExample.createObj();
        obj1.setStr("obj1");
        SingletonClassExample obj2 = SingletonClassExample.createObj();
        obj2.setStr("obj2");
        System.out.println(obj1 == obj2);

        try {
            SingletonClassExample obj3 = (SingletonClassExample) obj1.clone();
            System.out.println(obj3 == obj1);
            System.out.println(obj3);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected SingletonClassExample clone() throws CloneNotSupportedException {
        System.out.println("inside clone method");
        return (SingletonClassExample) super.clone();
    }

    @Override
    public String toString() {
        return "SingletonClassExample{" +
                "str='" + str + '\'' +
                '}';
    }


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }


}
