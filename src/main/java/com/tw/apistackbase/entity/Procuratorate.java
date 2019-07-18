package com.tw.apistackbase.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
public class Procuratorate {

    @Id
    @GeneratedValue
    private Long ProcuratorateID;

    @Column(length = 50,nullable = false, unique = true)
    private String ProcuratorateName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "procuratorateID")
    private List<Prosecutor> prosecutors;

    @OneToOne(mappedBy = "Prosecution")
    private Case aCase;

    public Procuratorate() {
    }

    public Procuratorate(String procuratorateName, List<Prosecutor> prosecutors) {
        ProcuratorateName = procuratorateName;
        this.prosecutors = prosecutors;
    }
}
