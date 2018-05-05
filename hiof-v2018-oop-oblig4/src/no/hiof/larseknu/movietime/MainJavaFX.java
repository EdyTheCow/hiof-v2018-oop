package no.hiof.larseknu.movietime;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import no.hiof.larseknu.movietime.model.Film;
import no.hiof.larseknu.movietime.model.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainJavaFX extends Application {
    public static ObservableList<Film> FilmListe = FXCollections.observableArrayList();
    private Stage primaryStage;
    public static MainJavaFX mainJavaFXApplikasjon;

    public MainJavaFX(){
        Person mattDuffer = new Person("Matt", "Duffer");
        FilmListe.add(new Film("eksdee", "haha eksdeee", 69, LocalDate.of(2017,11,20), mattDuffer));
        FilmListe.add(new Film("eksdee", "haha eksdeee", 69, LocalDate.of(2017,11,20), mattDuffer));
        FilmListe.add(new Film("eksdee", "haha eksdeee", 69, LocalDate.of(2017,11,20), mattDuffer));
        mainJavaFXApplikasjon = this;

        System.out.println(FilmListe);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{

        this.primaryStage = primaryStage;

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("view/FilmOversikt.fxml") );
        Parent mainWindow = loader.load();
        Scene mainScene = new Scene(mainWindow);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Film Liste");

        //AnchorPane mainWindow = loader.load();


        primaryStage.show();
    }

    public ObservableList<Film> getAlleFilmer() {
        return FilmListe;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
