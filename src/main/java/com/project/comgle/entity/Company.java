package com.project.comgle.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String companyName;

    @Column(nullable = false, length = 100)
    private String address;

    @Column(nullable = false, length = 20)
    private String companyTel;

    @Column(nullable = false, length = 20)
    private String president;

    @Column(nullable = false, length = 20)
    private String businessNum;

    @Column(nullable = false, length = 20)
    private String companyEmail;

    // 생성자
    @Builder
    private Company(String companyName, String address, String companyTel, String president, String businessNum, String companyEmail) {
        this.companyName = companyName;
        this.address = address;
        this.companyTel = companyTel;
        this.president = president;
        this.businessNum = businessNum;
        this.companyEmail = companyEmail;
    }
}