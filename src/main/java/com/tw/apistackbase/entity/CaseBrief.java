package com.tw.apistackbase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CaseBrief {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String subjectiveBrief;

    @Column(nullable = false)
    private String objectiveBrief;
}
