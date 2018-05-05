package no.hiof.larseknu.movietime;

import java.time.LocalDate;
import java.util.ArrayList;

public class Produksjon {
    private String tittel;
    private int spilletid;
    private LocalDate utgivelsesdato;
    private String besrkivelse;
    private Person ressigjor;
    private ArrayList<Rolle> skuespillerListe = new ArrayList<>();

    public Produksjon(String tittel, int spilletid, String besrkivelse, LocalDate utgivelsesdato) {
        this.tittel = tittel;
        this.spilletid = spilletid;
        this.besrkivelse = besrkivelse;
        this.utgivelsesdato = utgivelsesdato;
    }

    public Produksjon(String tittel, String besrkivelse, LocalDate utgivelsesdato) {
        this.tittel = tittel;
        this.besrkivelse = besrkivelse;
        this.utgivelsesdato = utgivelsesdato;
    }

    public Produksjon(String tittel, int spilletid) {
        this.tittel = tittel;
        this.spilletid = spilletid;
    }


    // SETTER
    public void setSkuespillerListe(ArrayList<Rolle> skuespillerListe) {
        this.skuespillerListe = skuespillerListe;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public void setSpilletid(int spilletid) {
        this.spilletid = spilletid;
    }

    public void setUtgivelsesdato(LocalDate utgivelsesdato) {
        this.utgivelsesdato = utgivelsesdato;
    }

    public void setBesrkivelse(String besrkivelse) {
        this.besrkivelse = besrkivelse;
    }

    public void setRessigjor(Person ressigjor) {
        this.ressigjor = ressigjor;
    }

    // GETTER
    public ArrayList<Rolle> getSkuespillerListe() {
        return skuespillerListe;
    }

    public String getTittel() {
        return tittel;
    }

    public int getSpilletid() {
        return spilletid;
    }

    public LocalDate getUtgivelsesdato() {
        return utgivelsesdato;
    }

    public String getBesrkivelse() {
        return besrkivelse;
    }

    public Person getRessigjor() {
        return ressigjor;
    }

    public void leggTilRolle(Rolle rolle) {
        skuespillerListe.add(rolle);
    }
    public void leggTilMangeRoller(ArrayList<Rolle> rolle){
        skuespillerListe.addAll(rolle);
    }

}

