package com.example.corejava;

import java.io.Serializable;
import java.util.Objects;

public class People implements Serializable {

    private int id;
    private String info;
    private double price;

    public People(int id, String info, double price) {
        this.id = id;
        this.info = info;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return id == people.id && Double.compare(price, people.price) == 0 && Objects.equals(info, people.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, info, price);
    }


    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", info='" + info + '\'' +
                ", price=" + price +
                '}';
    }


}
