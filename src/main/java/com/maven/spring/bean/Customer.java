package com.maven.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


public class Customer {
    private int id;
    private String name;
    private String email;
    private String phone;

    /*private Address address;*/
    private List<Address> addresses;

    public Customer() {
        System.out.println("Customer constructor is called");

    }

    public Customer(int id, String name, String email, String phone) {
        System.out.println("Customer(id,name,email,phone)constructor");
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;

    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + addresses +
                '}';
    }

//    public Customer(Address address){
//        System.out.println("Customer(address) constructor called");
//        this.address=address;
    public Customer(List<Address> addresses){
        System.out.println("Customer(addresses)constructor called");
        this.addresses = addresses;



    }
}
