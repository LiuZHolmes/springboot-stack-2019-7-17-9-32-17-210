package com.tw.apistackbase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CaseBrief {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String subjectiveBrief;

    @Column(nullable = false)
    private String objectiveBrief;

    public CaseBrief(String subjectiveBrief, String objectiveBrief) {
        this.subjectiveBrief = subjectiveBrief;
        this.objectiveBrief = objectiveBrief;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
