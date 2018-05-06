package no.hiof.larseknu.movietime.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import no.hiof.larseknu.movietime.MainJavaFX;
import no.hiof.larseknu.movietime.model.Film;

import java.time.LocalDate;

public class FilmOversiktController {

    @FXML
    private ListView<Film> uiFilmListe;

    @FXML
    private TextField uiTittel;

    @FXML
    private TextField uiUtgivelsesdato;

    @FXML
    private TextField uiSpilletid;

    @FXML
    private TextArea uiBeskrivelse;

    @FXML
    private void uiSlettKnapp(ActionEvent actionEvent){
        MainJavaFX.FilmListe.remove(uiFilmListe.getSelectionModel().getSelectedItem());
    }


    @FXML
    private void initialize(){


        uiFilmListe.setItems(MainJavaFX.mainJavaFXApplikasjon.getAlleFilmer());

        uiFilmListe.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Film s = uiFilmListe.getSelectionModel().getSelectedItem();
                uiTittel.setText(s.getTittel());
                uiUtgivelsesdato.setText(s.getUtgivelsesdato().toString());
                uiBeskrivelse.setText(s.getBeskrivelse());
                String r = " " + s.getSpilletid();
                uiSpilletid.setText(r);
            }
        });
    }


    public void lagNyFilm(ActionEvent actionEvent) {

    }
}
