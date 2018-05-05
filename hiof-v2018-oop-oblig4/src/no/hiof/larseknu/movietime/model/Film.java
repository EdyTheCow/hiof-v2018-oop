package no.hiof.larseknu.movietime.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Film extends Produksjon implements Comparable<Film> {


    public Film(String tittel, String beskrivelse, int spilletid, LocalDate utgivelsesdato, Person regisor) {
        super(tittel, beskrivelse, spilletid, utgivelsesdato, regisor);
    }

    @Override
    public String toString() {
        return super.getTittel() + " (" + super.getUtgivelsesdato().getYear() + ") - " + super.getSpilletid() + " minutter";
    }

    @Override public int compareTo(Film secMovie) {
        return getTittel().compareTo( secMovie.getTittel() );
    }
}