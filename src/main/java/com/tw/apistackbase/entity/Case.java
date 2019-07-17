package com.tw.apistackbase.entity;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "caseBriefID",referencedColumnName = "caseBriefID")
    private CaseBrief caseBrief;

//    @OneToOne(cascade = CascadeType.ALL)
//    @Column(nullable = false)
//    private Procuratorate Prosecution;

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

    public CaseBrief getCaseBrief() {
        return caseBrief;
    }

    public void setCaseBrief(CaseBrief caseBrief) {
        this.caseBrief = caseBrief;
    }

    public Case(String caseName, Long caseHappenTime, CaseBrief caseBrief) {
        this.caseName = caseName;
        this.caseHappenTime = caseHappenTime;
        this.caseBrief = caseBrief;
    }
}
