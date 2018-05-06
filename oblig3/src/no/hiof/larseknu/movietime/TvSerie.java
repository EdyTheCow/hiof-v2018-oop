package no.hiof.larseknu.movietime;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class TvSerie extends Produksjon {
    private ArrayList<Episode> episodeListe = new ArrayList<>();
    private int gjennomSnittligSpilletid;
    private int antallSesonger;

    public TvSerie(String tittel, String beskrivelse, LocalDate utgivelsesdato) {
        super(tittel, beskrivelse, utgivelsesdato);
    }

    public void leggTilEpisode(Episode episode) {
        // Undersøker om episoden sitt sesongNummer er høyere enn antallSesonger pluss 1
        if (antallSesonger+1 < episode.getSesongNummer()) {
            System.out.println("FEIL: Det er ikke mulig å legge til episoder for sesong " + episode.getSesongNummer() + ", den er " + (episode.getSesongNummer()  - antallSesonger) + " høyere enn antallet sesonger");
        }
        else {
            // Legger til episode til listen
            episodeListe.add(episode);
            // Oppdaterer gjennomsnittligspilletid
            oppdaterGjennomsnittligSpilletid();

            // Sjekker om episoden sitt sesongNummer er akkurat 1 høyere enn antallSesonger, i så fall, oppdater den
            if (antallSesonger+1 == episode.getSesongNummer())
                antallSesonger++;
        }

    }

    public ArrayList<Episode> hentEpisoderISesong(int sesongNummer) {
        // Lager og instansierer et ArrayList-objekt som skal holde på alle episodene i sesongen vi har valgt
        ArrayList<Episode> episoderISesong = new ArrayList<>();

        // Går gjennom alle episodene til denne tvserien og sjekker hvilken sesong den tilhører
        for (Episode episode : episodeListe) {
            // Sjekker om episoden tilhører sesongen vi ønsker
            if (episode.getSesongNummer() == sesongNummer) {
                // Den gjør det, da legger vi den til i den nye listen vår
                episoderISesong.add(episode);
            }
        }

        // Returnerer listen med alle episoder i sesongen som ble valgt
        return episoderISesong;
    }

    private void oppdaterGjennomsnittligSpilletid() {
        // Lager en variabel for å holde på den totale spilletiden
        int totalSpilletid = 0;

        // Går gjennom alle episodene til tvserien og legger sammen spilletid til totalSpilletid
        for (Episode episode : episodeListe) {
            totalSpilletid += episode.getSpilletid();
        }

        // Beregner gjennomsnittligSpilletid, ved å dele den totalespilletiden, på antallet episoder vi har
        gjennomSnittligSpilletid = totalSpilletid / episodeListe.size();
    }


    public ArrayList<Episode> getEpisodeListe() {
        // Vi lager en kopi av listen vi har, slik at den interne listen ikke kan manipuleres direkte utenfor klassen (innkapsling)
        ArrayList<Episode> returEpisodeListe = new ArrayList<>(episodeListe);

        return returEpisodeListe;
    }

    public int getGjennomSnittligSpilletid() {
        return gjennomSnittligSpilletid;
    }

    public int getAntallSesonger() {
        return antallSesonger;
    }

    public ArrayList<Rolle> hentCast() {

        ArrayList<Rolle> returRolleListe = new ArrayList<Rolle>();
        for (Episode episode : episodeListe ) {
            returRolleListe.addAll(episode.getSkuespillerListe());
        }
        return returRolleListe;
    }


    @Override
    public String toString() {
        return getTittel() + " - " + getUtgivelsesdato().getYear();
    }

}