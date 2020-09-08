package com.br.recordenglish.recordenglish.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phrase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String englishPhrase;
    private String portuguesePhrase;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnglishPhrase() {
        return englishPhrase;
    }

    public void setEnglishPhrase(String englishPhrase) {
        this.englishPhrase = englishPhrase;
    }

    public String getPortuguesePhrase() {
        return portuguesePhrase;
    }

    public void setPortuguesePhrase(String portuguesePhrase) {
        this.portuguesePhrase = portuguesePhrase;
    }
}
