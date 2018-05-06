package no.hiof.larseknu.movietime.model;

import java.time.LocalDate;

// En Episode "er en" produksjon, så derfor har vi satt at den extender Produksjon
// Vi får dermed med alle egenskapene fra Produksjon "gratis"
// Vi implementerer også interfacet Comparable, og har med <Episode> for å spesifisere at det er Episoder vi skal semmenligne
public class Episode extends Produksjon implements Comparable<Episode> {
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
    public int compareTo(Episode sammenligningsEpisode) {
              // Sjekker om sesongnummeret er likt
        if (this.sesongNummer == sammenligningsEpisode.getSesongNummer()) {
            // Siden vi vet at sesong er likt, gjør vi videre sammenligning av episode og returnerer den
            return this.episodeNummer - sammenligningsEpisode.getEpisodeNummer();
        }
        else {
            // Hvis ikke sesongnummer var likt, returnerer vi foskjellen
            return this.sesongNummer - sammenligningsEpisode.getSesongNummer();
        }
    }
}
