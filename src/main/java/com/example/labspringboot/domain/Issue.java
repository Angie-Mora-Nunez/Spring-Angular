package com.example.labspringboot.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Issue2")
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Description;
    private Date Date;
    private String Address;
    private String Phone;
    private String Email;
    private String Status;
    private String Support;
    private String Servicio;
    private int Cliente;


    public Issue(int id, String description, java.util.Date date, String address, String phone, String email, String status, String support, String servicio, int cliente) {
        setId(id);
        setDescription(description);
        setDate(date);
        setAddress(address);
        setPhone(phone);
        setEmail(email);
        setStatus(status);
        setSupport(support);
        setServicio(servicio);
        setCliente(cliente);
    }

    public Issue() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getSupport() {
        return Support;
    }

    public void setSupport(String support) {
        Support = support;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String servicio) {
        Servicio = servicio;
    }

    public int getCliente() {
        return Cliente;
    }

    public void setCliente(int cliente) {
        Cliente = cliente;
    }
}
