package no.hiof.larseknu.movietime.model;

import java.time.LocalDate;

public class Person {
    private String fornavn, etternavn;
    private LocalDate fodselsDato;


    public Person(String fornavn, String etternavn) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public Person(String fornavn, String etternavn, LocalDate fodselsDato) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodselsDato = fodselsDato;
    }

    public String hentNavn() {
        return fornavn + " " + etternavn;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public LocalDate getFodsesdato() {
        return fodselsDato;
    }

    public void setFodsesdato(LocalDate fodsesdato) {
        this.fodselsDato = fodsesdato;
    }

    @Override
    public String toString() {
        // Har en "hurtig-if" som sjekker om fodselsdato er null, er den det skrives det bare en tom streng, har den en verdi skriver vi ut "født i år " etterflugt av året
        return fornavn + " " + etternavn + (fodselsDato == null ? "" : " født i år " + fodselsDato.getYear()) ;
    }
}
