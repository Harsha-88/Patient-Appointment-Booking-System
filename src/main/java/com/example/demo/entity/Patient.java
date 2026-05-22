package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Patient {
    @Id //mtlb y primary key hai db table ki
    @GeneratedValue(strategy=GenerationType.IDENTITY)  //id apne ap dega vo autoincrement krega
    private Long id;
    private String name;
    private int age;
    private String email;
    private String phoneNo;


    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;

    }
        public void setAge(int age){
        this.age=age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
