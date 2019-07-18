package com.tw.apistackbase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Prosecutor {

    @Id
    @GeneratedValue
    private Long prosecutorID;

    @Column(nullable = false)
    private String prosecutorName;

    private int age;
    private String gender;
    private String IDNumber;
    private int experience;

    public Prosecutor() {
    }

    public Prosecutor(String prosecutorName) {
        this.prosecutorName = prosecutorName;
    }
}
