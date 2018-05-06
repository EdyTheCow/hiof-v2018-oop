package no.hiof.larseknu.movietime;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import no.hiof.larseknu.movietime.model.Episode;
import no.hiof.larseknu.movietime.model.Film;
import no.hiof.larseknu.movietime.model.Person;
import no.hiof.larseknu.movietime.model.TvSerie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        lagFilmer();
        lagTvSerier();
    }

    private static void lagFilmer() {
        ArrayList<Film> listeAvFilmer = new ArrayList<Film>();

        Person frankDarabont = new Person("Frank", "Darabont");
        Film shawshankRedemption = new Film("The Shawshank Redemption", "Two imprisoned men bond over a number of years...",142, LocalDate.of(1994, 9, 22), frankDarabont);

        Person leeUnkrich = new Person("Lee", "Unkrich");
        Film coco = new Film("Coco", "About aspiring musician Miguel...", 105, LocalDate.of(2017, 11, 21), leeUnkrich);

        Person poopEmoji = new Person("Poop", "Emoji");
        Film emojiMovie = new Film("Emoji Movie", "About emojis", 105, LocalDate.of(2017, 11, 21), leeUnkrich);

        listeAvFilmer.add(shawshankRedemption);
        listeAvFilmer.add(coco);
        listeAvFilmer.add(emojiMovie);

        Collections.sort(listeAvFilmer);
        System.out.println(listeAvFilmer);
    }

    private static void lagTvSerier() {
        ArrayList<TvSerie> listeAvTvSerier = new ArrayList<TvSerie>();

        // Stranger Things TV Serie
        Person mattDuffer = new Person("Matt", "Duffer");
        TvSerie strangerThings = new TvSerie("Stranger Things", "When a young boy disappears, his mother, a police chief, and his friends must confront terrifying forces in order to get him back.", LocalDate.of(2016, 7,15));
        strangerThings.leggTilEpisode(new Episode(1, 1, "Chapter One: The Vanishing of Will Byers", "Will vanishes", 50, LocalDate.of(2016, 7, 15), mattDuffer));
        strangerThings.leggTilEpisode(new Episode(2, 1, "Chapter Two: The Weirdo on Maple Street", "The weirdo arrives", 50, LocalDate.of(2016, 7, 15), mattDuffer));
        strangerThings.leggTilEpisode(new Episode(3, 1, "Chapter Three: Holly, Jolly", "Holy jolly", 50, LocalDate.of(2016, 7, 15), mattDuffer));
        strangerThings.leggTilEpisode(new Episode(4, 1, "Chapter Four: The Body", "A body is found", 50, LocalDate.of(2016, 7, 15), mattDuffer));

        // Game of Thrones
        TvSerie gayOfThrones = new TvSerie("Gay of Thrones", "Nine noble families fight for control over the mythical lands of Gaysteros", LocalDate.of(2016, 7,15));
        // The Walking Dead
        TvSerie theWalkingGay = new TvSerie("The Walking Gay", "Sheriff Deputy Rick Gay wakes up from a coma to learn the world is gay", LocalDate.of(2014, 7,15));
        // Black Mirror
        TvSerie blackGay = new TvSerie("Black Gay", "An anthology series exploring a twisted gay", LocalDate.of(2011, 7,15));

        listeAvTvSerier.add(strangerThings);
        listeAvTvSerier.add(gayOfThrones);
        listeAvTvSerier.add(theWalkingGay);
        listeAvTvSerier.add(blackGay);

        Collections.sort(listeAvTvSerier);
        System.out.println(listeAvTvSerier);

    }







}
