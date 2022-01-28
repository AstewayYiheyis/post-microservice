package com.edu.miu.eaproject.postservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


public class Users {
  private Long Id;
    private String firstName;
    private String lastName;
    private String PostName;
  
    public Long getId() {
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPostName() {
        return PostName;
    }

   
    public void setId(Long id) {
        Id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPostName(String PostName) {
        this.PostName = PostName;
    }

  
}
