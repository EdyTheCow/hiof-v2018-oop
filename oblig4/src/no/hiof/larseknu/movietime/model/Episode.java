package no.hiof.larseknu.movietime.model;

import java.time.LocalDate;

// En Episode "er en" produksjon, så derfor har vi satt at den extender Produksjon
// Vi får dermed med alle egenskapene fra Produksjon "gratis"
public class Episode extends Produksjon implements Comparable<Episode>{
    private int episodeNummer, sesongNummer;

    public Episode(int episodeNummer, int sesongNummer, String tittel, String beskrivelse, int spilletid, LocalDate utgivelsesdato, Person regisor) {
        // Kaller superkontruktøren (som tilhører Produksjon), vi "sender" da tittel, beskrivelse, spilletid, utgivelsesdato og regisor videre
        super(tittel, beskrivelse, spilletid, utgivelsesdato, regisor);
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
        return super.getTittel() + " - S" + sesongNummer + "E" + episodeNummer;
    }


    @Override
    public int compareTo(Episode i) {

        if (this.getSesongNummer()>i.getSesongNummer() ){
            return 1;
        }

        else if (this.getSesongNummer()<i.getSesongNummer() ){
            return -1;
        }

        if (this.getSesongNummer()==i.getSesongNummer() ){
            if (this.getEpisodeNummer()>i.getEpisodeNummer()){
                return 1;
            }

            else{
                return -1;
            }
        }

        return 0;
    }

}
