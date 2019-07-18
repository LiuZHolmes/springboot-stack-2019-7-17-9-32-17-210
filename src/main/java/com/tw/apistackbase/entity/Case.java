package com.tw.apistackbase.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Case")
public class Case {

    @Id
    @GeneratedValue
    private Long caseID;

    @Column(nullable = false)
    private String caseName;

    @Column(nullable = false)
    private Long caseHappenTime;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "caseBrief")
    private CaseBrief caseBrief;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private Procuratorate Prosecution;

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

    public Case() {
    }

    public Procuratorate getProsecution() {
        return Prosecution;
    }

    public void setProsecution(Procuratorate prosecution) {
        Prosecution = prosecution;
    }
}
