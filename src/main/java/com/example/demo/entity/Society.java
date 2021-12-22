package com.example.demo.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "society")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Society extends User{

    @Column(name = "total_capital")
    private float totalCapital;
    @Column(name="established_date")
    @Temporal(TemporalType.DATE)
    private Date establishedDate;
    @Column(name="industry_code")
    private String industryCode;

    @OneToMany(mappedBy = "society",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<FarmerSociety> farmers=new HashSet<>();


}
