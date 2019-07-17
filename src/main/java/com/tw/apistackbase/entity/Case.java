package com.tw.apistackbase.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;

@Entity
public class Case {

    @Id
    @GeneratedValue
    private Long caseID;

    @Column(nullable = false)
    private String caseName;

    @Column(nullable = false)
    private Long caseHappenTime;

    @OneToOne
    @Cascade(CascadeType.ALL)
    private CaseBrief caseBrief;

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


    public Long getCaseHappenTime() {
        return caseHappenTime;
    }

    public void setCaseHappenTime(Long caseHappenTime) {
        this.caseHappenTime = caseHappenTime;
    }

    public Case(String caseName, Long caseHappenTime) {
        this.caseName = caseName;
        this.caseHappenTime = caseHappenTime;
    }
}
