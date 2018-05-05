package no.hiof.larseknu.movietime.model;

import java.time.LocalDate;

/**
 * En film "er en" produksjon, så derfor har vi satt at den extender Produksjon
 * Vi får dermed med alle egenskapene fra Produksjon "gratis"
 *
 * @author Edy
 *
 */

public class Film extends Produksjon implements Comparable<Film> {
    String posterurl;
    public Film(String tittel, String beskrivelse, int spilletid, LocalDate utgivelsesdato, Person regisor, String posterurl) {
        // Kaller superkontruktøren (som tilhører Produksjon), vi "sender" da tittel, beskrivelse, spilletid, utgivelsesdato og regisor videre
        super(tittel, beskrivelse, spilletid, utgivelsesdato, regisor);
        this.posterurl = posterurl;
    }

    /**
     *
     * @param tittel film tittel
     * @param beskrivevlse film beskrivelse
     * @param spilletid film spilletid
     * @param utgivelsesdato film utgivelsedato
     * @param regisor film regisør
     */
    public Film(String tittel, String beskrivevlse, int spilletid, LocalDate utgivelsesdato, Person regisor){
        super(tittel, beskrivevlse, spilletid, utgivelsesdato, regisor);
    }

    /**
     *
     */
    public Film() {
        super();
    }

    /**
     * super - nøkkelordet her er strengt tatt ikke nødvendig, men det gjør det tydelig at metodene tilhører superklassen
     * @return
     */
    @Override
    public String toString() {
        return super.getTittel() + (super.getUtgivelsesdato() != null ? " (" + super.getUtgivelsesdato().getYear() + ")" :"");// + (super.getSpilletid() > 0 ? super.getSpilletid() + " minutter" : "");

    }

    /**
     *
     * @param sammenligningsFilm Vi sammenligner tittelen til filmene, som er en String. Så vi drar også nytte av String sin egen compareTo metode
     * @return
     */
    @Override
    public int compareTo(Film sammenligningsFilm) {
        return this.getTittel().compareTo(sammenligningsFilm.getTittel());
    }

    /**
     *
     * @return poster til filmen
     */
    public String getPosterurl() {
        return posterurl;
    }

    /**
     *
     * @param posterurl
     */
    public void setPosterurl(String posterurl) {
        this.posterurl = posterurl;
    }
}
