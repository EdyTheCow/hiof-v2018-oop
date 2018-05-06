package no.hiof.larseknu.movietime;

import java.time.LocalDate;

public class Film extends Produksjon {

    public Film(String tittel, int spilletid, LocalDate utgivelsesdato, String besrkivelse) {
        super(tittel, spilletid, besrkivelse, utgivelsesdato);
    }

    @Override
    public String toString() {
        return "Film (" + getTittel() + ") kom ut (" + getUtgivelsesdato() + ") varer i (" + getSpilletid() + ") min (" + getBesrkivelse() + ")";
    }
}