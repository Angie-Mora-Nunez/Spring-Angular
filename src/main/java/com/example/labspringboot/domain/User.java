package com.example.labspringboot.domain;


import javax.persistence.*;

@Entity
@Table(name="Client")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;
    private String First_surname;
    private String Second_surname;
    private String Address;
    private String phone;
    private String secondphone;
    private String Email;
    private String Password;

    public User(int id, String name, String first_surname, String second_surname, String address, String phone, String secondphone, String email, String password) {
        Id = id;
        Name = name;
        First_surname = first_surname;
        Second_surname = second_surname;
        Address = address;
        this.phone = phone;
        this.secondphone = secondphone;
        Email = email;
        Password = password;
    }

    public User() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFirst_surname() {
        return First_surname;
    }

    public void setFirst_surname(String first_surname) {
        First_surname = first_surname;
    }

    public String getSecond_surname() {
        return Second_surname;
    }

    public void setSecond_surname(String second_surname) {
        Second_surname = second_surname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSecondphone() {
        return secondphone;
    }

    public void setSecondphone(String secondphone) {
        this.secondphone = secondphone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}