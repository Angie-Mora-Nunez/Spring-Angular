package com.example.labspringboot.domain;

import com.example.labspringboot.domain.Service;
import javax.persistence.*;
import java.util.Date;

@Entity

@Table(name="Issue2")
public class Issue2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private Date registertimestamp;
    private String address;
    private String contactphone;
    private String contactemail;
    private String status;
    private int supportuserassigned;
    private String service;
    private int Id_Cliente;

    public Issue2() {
    }

    public Issue2(int id, String description, Date registertimestamp, String address, String contactphone, String contactemail, String status, int supportuserassigned, String service,int Id_Cliente) {
        this.id = id;
        this.description = description;
        this.registertimestamp = registertimestamp;
        this.address = address;
        this.contactphone = contactphone;
        this.contactemail = contactemail;
        this.status = status;
        this.supportuserassigned = supportuserassigned;
        this.service=service;
        this.Id_Cliente=Id_Cliente;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRegistertimestamp() {
        return registertimestamp;
    }

    public void setRegistertimestamp(Date registertimestamp) {
        this.registertimestamp = registertimestamp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone;
    }

    public String getContactemail() {
        return contactemail;
    }

    public void setContactemail(String contactemail) {
        this.contactemail = contactemail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSupportuserassigned() {
        return supportuserassigned;
    }

    public void setSupportuserassigned(int supportuserassigned) {
        this.supportuserassigned = supportuserassigned;
    }

   public String getService(){
        return  service;}

    public void setService(String service) {
        this.service = service;
    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }

}
