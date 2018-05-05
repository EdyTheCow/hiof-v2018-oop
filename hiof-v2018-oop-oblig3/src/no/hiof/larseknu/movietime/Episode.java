package no.hiof.larseknu.movietime;

import java.time.LocalDate;

public class Episode extends Produksjon {
    private int episodeNummer;
    private int sesongNummer;

    public Episode(String tittel, int spilletid, int episodeNummer, int sesongNummer) {
        super(tittel, spilletid);
        this.episodeNummer = episodeNummer;
        this.sesongNummer = sesongNummer;
    }

    public Episode(String tittel, int spilletid, String besrkivelse, LocalDate utgivelsesdato, int episodeNummer, int sesongNummer) {
        super(tittel, spilletid, besrkivelse, utgivelsesdato);
        this.episodeNummer = episodeNummer;
        this.sesongNummer = sesongNummer;
    }


    public int getEpisodeNummer() {
        return episodeNummer;
    }

    public void setEpisodeNummer(int episodeNummer) {
        this.episodeNummer = episodeNummer;
    }

    public int getSesongNummer() {
        return sesongNummer;
    }

    public void setSesongNummer(int sesongNummer) {
        this.sesongNummer = sesongNummer;
    }


    @Override
    public String toString() {
        return getTittel() + " - S" + sesongNummer + "E" + episodeNummer;
    }
}
