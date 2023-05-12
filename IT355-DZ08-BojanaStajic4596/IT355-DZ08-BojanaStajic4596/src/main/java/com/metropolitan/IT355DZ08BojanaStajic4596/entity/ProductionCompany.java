package com.metropolitan.IT355DZ08BojanaStajic4596.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "production_company", schema = "movies", catalog = "")
public class ProductionCompany {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "company_id")
    private int companyId;
    @Basic
    @Column(name = "company_name")
    private String companyName;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductionCompany that = (ProductionCompany) o;
        return companyId == that.companyId && Objects.equals(companyName, that.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId, companyName);
    }
}
