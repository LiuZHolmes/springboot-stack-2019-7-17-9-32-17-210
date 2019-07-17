package com.tw.apistackbase.entity;

import javax.persistence.*;

@Entity
public class CaseBrief {
    @Id
    @GeneratedValue
    private Long caseBriefID;

    @Column(nullable = false)
    private String subjectiveBrief;

    @Column(nullable = false)
    private String objectiveBrief;

    @OneToOne(mappedBy = "caseBrief")
    private Case aCase;

    public CaseBrief(String subjectiveBrief, String objectiveBrief) {
        this.subjectiveBrief = subjectiveBrief;
        this.objectiveBrief = objectiveBrief;
    }



    public String getSubjectiveBrief() {
        return subjectiveBrief;
    }

    public void setSubjectiveBrief(String subjectiveBrief) {
        this.subjectiveBrief = subjectiveBrief;
    }

    public String getObjectiveBrief() {
        return objectiveBrief;
    }

    public void setObjectiveBrief(String objectiveBrief) {
        this.objectiveBrief = objectiveBrief;
    }

    public Long getCaseBriefID() {
        return caseBriefID;
    }

    public void setCaseBriefID(Long caseBriefID) {
        this.caseBriefID = caseBriefID;
    }
}
