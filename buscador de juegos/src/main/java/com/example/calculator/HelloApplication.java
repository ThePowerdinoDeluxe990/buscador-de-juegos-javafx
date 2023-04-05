package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 600);
       //stage.getIcons().add(new Image("776645.png"));

        stage.setTitle("Buscador de juegos");
        stage.setScene(scene);
        stage.show();

        stage.resizableProperty().setValue(false);
    }

    public static void main(String[] args) {
        launch();
    }
}
