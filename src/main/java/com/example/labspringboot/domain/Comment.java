package com.example.labspringboot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Description;
    private Date Comment_Timestamp;

    public Comment(){}

    public Comment(int id, String description, Date comment_Timestamp) {
        Id = id;
        Description = description;
        Comment_Timestamp = comment_Timestamp;
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

    public Date getComment_Timestamp() {
        return Comment_Timestamp;
    }

    public void setComment_Timestamp(Date comment_Timestamp) {
        Comment_Timestamp = comment_Timestamp;
    }


}
