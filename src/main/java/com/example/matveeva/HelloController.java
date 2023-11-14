package com.example.matveeva;

import data.Users;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private TextField numberTextField;
    public void onShowDataBookClick(ActionEvent actionEvent) throws IOException {
        if(checkNumber()) {
            showDataBookView();
        }
        else {
            System.out.println("Неверный номер телефона.");
        }
    }

    private void showDataBookView() throws IOException {
        Stage dataBookStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("databook-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 540);
        dataBookStage.setTitle("Записная книжка");
        dataBookStage.setScene(scene);
        dataBookStage.show();
    }

    private boolean checkNumber() {
        Users users = new Users();
        if(numberTextField.getText().equals(Users.users.get(0).getNumber())) {
            return true;
        }
        return false;
    }
}