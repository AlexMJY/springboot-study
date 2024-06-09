package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member {
    @Id
    @Column
    private String email;

    @Column
    private String password;

    public Member(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Member() {

    }

    @Override
    public String toString() {
        return "Member{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
