package no.hiof.larseknu.movietime;

import javafx.scene.control.Alert;
import no.hiof.larseknu.movietime.model.Film;
import no.hiof.larseknu.movietime.model.Person;
import no.hiof.larseknu.movietime.model.Produksjon;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;



public class datahondteringen {


    public static void lesfil() throws IOException {


        Person per = new Person("xd", "eksdee", LocalDate.of(1, 4, 5));
        // Lager et File-objekt
        File kilde = new File("src/no/hiof/larseknu/movietime/filmer.csv");

        try (BufferedReader bufretLeser = new BufferedReader(new FileReader(kilde))) {
            // Lager variabel å holde på hver tekstlinje
            String linje;

            // Løkken går så lenge det finnes linjer
            while ((linje = bufretLeser.readLine()) != null) {
                // Deler opp teksten på tegnet ";" -> dette resulterer i an array som heter deler
                // index 0 -> fornavn
                // index 1 -> etternavn
                String[] deler = linje.split(";");




                // Lager nytt kundeobjekt med denne informasjonen
                String title = deler[0];
                int runtime = Integer.parseInt(deler[2]);
                String description = deler[1];
                LocalDate date = LocalDate.parse(deler[3]);
                String poster = deler[4];

                Film k = new Film(title, description, runtime, date, per, poster);
                MainJavaFX.mainJavaFX.getFilmData().add(k);
                // Legger til denne superhelten i listen

            }

            // Skriver ut listen med superhelter til konsoll
            System.out.println();
        } catch (FileNotFoundException e) {
            MainJavaFX.mainJavaFX.visAlert("Fil finnes ikke!");
        } catch (IOException e) {
            // skriver ut feilmelding om det oppstår feil ved skriving til fil
            System.out.println(e);
        }


    }

    public static void skrivfil() {

        File kilde = new File("src/no/hiof/larseknu/movietime/filmer.csv");
        if (kilde.exists()) {


            try (BufferedWriter bw = new BufferedWriter(new FileWriter(kilde))) {
                for (Film filmSomRedigeres : MainJavaFX.mainJavaFX.getFilmData()) {
                    filmSomRedigeres.setPosterurl(filmSomRedigeres.getPosterurl().replace("https://image.tmdb.org/t/p/w500", ""));
                    bw.write(filmSomRedigeres.getTittel() + ";" + filmSomRedigeres.getBeskrivelse() + ";" + filmSomRedigeres.getSpilletid() + ";" + filmSomRedigeres.getUtgivelsesdato() + ";" + filmSomRedigeres.getPosterurl());
                    bw.newLine();
                }
            } catch (IOException ioexc) {
                System.out.println(ioexc);
            }
        }
        else
            MainJavaFX.mainJavaFX.visAlert("Kunne ikke skrive til fil!");
    }
    }
