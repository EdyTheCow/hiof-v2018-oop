package no.hiof.larseknu.movietime.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Vi ønsker ikke å kunne lage egne objekter av Produksjon, og har derfor satt den til abstrakt
 *
 * @author Edy
 */

public abstract class Produksjon {
    private String tittel, beskrivelse;
    private int spilletid;
    private LocalDate utgivelsesdato;
    private Person regisor;
    private ArrayList<Rolle> rolleListe = new ArrayList<>();

    /**
     *
     * @param tittel
     * @param beskrivelse
     * @param spilletid
     * @param utgivelsesdato
     * @param regisor
     */
    public Produksjon(String tittel, String beskrivelse, int spilletid, LocalDate utgivelsesdato, Person regisor) {
        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.spilletid = spilletid;
        this.utgivelsesdato = utgivelsesdato;
        this.regisor = regisor;
    }

    /**
     *
     */
    public Produksjon() {
        tittel = "";
        beskrivelse = "";
        spilletid = 0;
        utgivelsesdato = LocalDate.MIN;
        regisor = new Person();
    }

    /**
     *
     * @param enRolle
     */
    public void leggTilEnRolle(Rolle enRolle) {
        rolleListe.add(enRolle);
    }

    /**
     *
     * @param rolleListe
     */
    public void leggTilMangeRoller(ArrayList<Rolle> rolleListe) {
        // Vi legger alle elementene fra rolleListen vi sender inn som parameter, til rolleListen som hører til denne produksjonen
        this.rolleListe.addAll(rolleListe);
    }


    /**
     *
     * @return
     */
    public ArrayList<Rolle> getRolleListe() {
        // Vi lager en kopi av listen vi har, slik at den interne listen ikke kan manipuleres direkte utenfor klassen (innkapsling)
        return new ArrayList<>(rolleListe);
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public int getSpilletid() {
        return spilletid;
    }

    public void setSpilletid(int spilletid) {
        this.spilletid = spilletid;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public LocalDate getUtgivelsesdato() {
        return utgivelsesdato;
    }

    public void setUtgivelsesdato(LocalDate utgivelsesdato) {
        this.utgivelsesdato = utgivelsesdato;
    }

    public Person getRegisor() {
        return regisor;
    }

    public void setRegisor(Person regisor) {
        this.regisor = regisor;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return tittel + " " + utgivelsesdato.getYear();
    }
}
