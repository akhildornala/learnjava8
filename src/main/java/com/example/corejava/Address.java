package com.example.corejava;

import java.util.Objects;

public class Address {

    public String houseNumber;
    public String area;
    public String city;

    public Address() {

    }

    
    public Address(String houseNumber, String area, String city) {
        this.houseNumber = houseNumber;
        this.area = area;
        this.city = city;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(houseNumber, address.houseNumber) && Objects.equals(area, address.area) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseNumber, area, city);
    }


    @Override
    public String toString() {
        return "Address{" +
                "houseNumber='" + houseNumber + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                '}';
    }


}
