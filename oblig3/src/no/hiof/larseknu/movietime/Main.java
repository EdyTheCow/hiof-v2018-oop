package no.hiof.larseknu.movietime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        TvSerie gayerThings = new TvSerie("Gayer Things", "When a young gay disappears, his mother, a police chief, and his gays must confront terrifying gays in order to get him gay.", LocalDate.of(1969, 6,9));
        Episode episode1 = new Episode("Chapter One: The Gay of Will Byers", 50, 1, 1);
        Episode episode2 = new Episode("Chapter Two: The Gay on Maple Street", 50, 2, 1);
        gayerThings.setRessigjor(new Person("Big", "Gay"));
        System.out.println("Regissør av " + gayerThings.getTittel() + " er " + gayerThings.getRessigjor());
        episode1.leggTilRolle(new Rolle("Winona", "Ryder", "Joyce", "Byers"));
        episode1.leggTilRolle(new Rolle("David", "Harbour", "Jim", "Hopper"));
        System.out.println("Roller i TV serie " + gayerThings.getTittel() + " i episode " + episode1.getTittel() + ":" + episode1.getSkuespillerListe());
        System.out.println("-------------------------------------------------------------");

        ArrayList<Rolle> gayerThingsRoller = new ArrayList<Rolle>();
        gayerThingsRoller.add(new Rolle("Winona", "Ryder", "Joyce", "Byers"));
        gayerThingsRoller.add(new Rolle("aaaa", "Ryderfawf", "Joyce", "Byeawfrs"));
        gayerThingsRoller.add(new Rolle("bbbb", "Rydewafr", "aaff", "Bywafers"));
        gayerThingsRoller.add(new Rolle("cccc", "Rydwafer", "Joyafafce", "Byewafawrs"));
        gayerThingsRoller.add(new Rolle("dddd", "Rydawfer", "Joywafwace", "Byefwafrs"));

        gayerThings.leggTilEpisode(episode1);
        gayerThings.leggTilEpisode(episode2);
        episode1.leggTilMangeRoller(gayerThingsRoller);
        System.out.println(gayerThings.hentCast());

        System.out.println("-------------------------------------------------------------");

        Film theEmojiMovie = new Film("The Emoji Movie", 86, LocalDate.of(2017,8,2),"bad");
        System.out.println("Film: (" + theEmojiMovie.getTittel() + ") kom ut: (" + theEmojiMovie.getUtgivelsesdato() + ") den varer i (" + theEmojiMovie.getSpilletid() + " min)" + " beskrivelse: (" + theEmojiMovie.getBesrkivelse() + ")");

        theEmojiMovie.setRessigjor(new Person("Big", "POOP"));
        System.out.println("Regissør av " + theEmojiMovie.getTittel() + " er " + theEmojiMovie.getRessigjor());

        theEmojiMovie.leggTilRolle(new Rolle("T.J", "Miller", "Poop", "Emoji"));
        theEmojiMovie.leggTilRolle(new Rolle("James", "Corden", "Shit", "Emoji"));
        System.out.println(theEmojiMovie.getSkuespillerListe());



        /*
        // Lager og instansierer objektet strangerThings av typen TvSerie
        TvSerie strangerThings = new TvSerie("Stranger Things", "When a young boy disappears, his mother, a police chief, and his friends must confront terrifying forces in order to get him back.", LocalDate.of(2016, 7,15));

        // Lager og instansierer noen objekter av typen Episode
        Episode episode1 = new Episode(1, 1, "Chapter One: The Vanishing of Will Byers", 50);
        Episode episode2 = new Episode(2, 1, "Chapter Two: The Weirdo on Maple Street", 50);
        Episode episode3 = new Episode(3, 1, "Chapter Three: Holly, Jolly", 50);
        Episode episode4 = new Episode(4, 1, "Chapter Four: The Body", 50);

        // Legger til episodeobjektene til tvserieobjektet strangerThings
        strangerThings.leggTilEpisode(episode1);
        strangerThings.leggTilEpisode(episode2);
        strangerThings.leggTilEpisode(episode3);
        strangerThings.leggTilEpisode(episode4);

        // Instansierer noen objekter av typen Episode og legger de direkte inn i TvSerie objektet strangerThings
        strangerThings.leggTilEpisode(new Episode(1, 2, "Chapter One: MADMAX", 50));
        strangerThings.leggTilEpisode(new Episode(2, 2, "Chapter Two: Trick or Treat, Freak", 50));
        strangerThings.leggTilEpisode(new Episode(3, 2, "Chapter Three: The Pollywog", 50));

        // Henter ut en liste med episoder fra objektet strangerThings
        ArrayList<Episode> episodeListe = strangerThings.getEpisodeListe();

        System.out.println("******************************");

        // Skriver ut tvserie objektet (toString blir kalt)
        System.out.println(strangerThings);
        System.out.println("------------------------------");
        // Går gjennom alle episoder og skriver ut objektet (toString blir kalt)
        for (Episode episode : episodeListe) {
            System.out.println(episode);
        }

        System.out.println("******************************");


        // Lager og instansierer objektet gameOfThrones av typen TvSerie
        TvSerie gameOfThrones = new TvSerie("Game of Thrones", "They are in a game for the throne.", LocalDate.of(2011, 4, 11));

        // Oppretter og instansierer ett objekt av typen Random, for å kunne generere en tilfeldig spilletid
        Random randomTallGenerator = new Random();

        // En dobbel for-løkke som går gjennom å lager 5 sesonger med 20 episoder av Game of Thrones
        for (int sesongNr = 1; sesongNr <= 5; sesongNr++) {
            for (int episodeNr = 1; episodeNr <= 20; episodeNr++) {
                // Instansierer og legger til en episode, bruker Random-objektet til å generere et tall mellom 0 og 10, plusser så på 20 (for å få en verdi mellom 20 og 30)
                gameOfThrones.leggTilEpisode(new Episode(episodeNr, sesongNr, "Generic Title ", randomTallGenerator.nextInt(11) + 20));
            }
        }

        // Henter ut alle episodene til tvserieobjektet gameOfThrones for sesong 4
        ArrayList<Episode> gameOfThronesSesong4Episoder = gameOfThrones.hentEpisoderISesong(4);

        System.out.println("******************************");

        // Skriver ut tvserie objektet (toString blir kalt)
        System.out.println(gameOfThrones);
        System.out.println("Gjennomsnittligspilletid ");
        System.out.println("------------------------------");
        // Går gjennom alle episoder og skriver ut objektet (toString blir kalt)
        for (Episode episode : gameOfThronesSesong4Episoder) {
            System.out.println(episode);
        }

        System.out.println("******************************");
        */


    }
}
