package com.tw.apistackbase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Case {

    @Id
    @GeneratedValue
    private Long caseID;

    @Column(nullable = false)
    private String caseName;

    @Column(nullable = false)
    private Long time;

    public Long getCaseID() {
        return caseID;
    }

    public void setCaseID(Long caseID) {
        this.caseID = caseID;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Case(String caseName, Long time) {
        this.caseName = caseName;
        this.time = time;
    }


}
