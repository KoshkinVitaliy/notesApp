package com.example.matveeva;

import data.Users;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.*;

public class DataBookController implements Initializable {

    ObservableList<String> notes = FXCollections.observableArrayList();

    @FXML
    private Label nameLabel;

    @FXML
    private ListView<String> notesListView;

    @FXML
    private TextField noteTextField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameLabel.setText(Users.users.get(0).getName());
    }

    public void onAddNoteButtonClick(ActionEvent actionEvent) {
        notes.add(noteTextField.getText());
        notesListView.setItems(notes);
    }

    public void onDeleteButtonClick(ActionEvent actionEvent) {
        notes.remove(notes.size()-1);
    }
}
