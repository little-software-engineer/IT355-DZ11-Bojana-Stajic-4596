package com.metropolitan.IT355DZ08BojanaStajic4596.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "language_role", schema = "movies", catalog = "")
public class LanguageRole {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "role_id")
    private int roleId;
    @Basic
    @Column(name = "language_role")
    private String languageRole;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getLanguageRole() {
        return languageRole;
    }

    public void setLanguageRole(String languageRole) {
        this.languageRole = languageRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LanguageRole that = (LanguageRole) o;
        return roleId == that.roleId && Objects.equals(languageRole, that.languageRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, languageRole);
    }
}
