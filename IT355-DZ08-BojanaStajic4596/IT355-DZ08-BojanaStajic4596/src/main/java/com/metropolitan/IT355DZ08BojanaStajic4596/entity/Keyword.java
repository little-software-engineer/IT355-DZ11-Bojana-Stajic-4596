package com.metropolitan.IT355DZ08BojanaStajic4596.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Keyword {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "keyword_id")
    private int keywordId;
    @Basic
    @Column(name = "keyword_name")
    private String keywordName;

    public int getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(int keywordId) {
        this.keywordId = keywordId;
    }

    public String getKeywordName() {
        return keywordName;
    }

    public void setKeywordName(String keywordName) {
        this.keywordName = keywordName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keyword keyword = (Keyword) o;
        return keywordId == keyword.keywordId && Objects.equals(keywordName, keyword.keywordName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keywordId, keywordName);
    }
}
