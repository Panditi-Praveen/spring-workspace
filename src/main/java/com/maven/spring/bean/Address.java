package com.maven.spring.bean;

public class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        System.out.println("Address(street,city) constructor called:");
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
