package com.example.calculator;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class HelloController {
    juegos mario = new juegos("Mario Odyssey","2017","60.00€");
    juegos sonic = new juegos("Sonic Mania"," 2017","20.00€");

    juegos splatoon3 = new juegos("Splatoon 3","2022","60.00€");

    juegos apex = new juegos("Apex legends","2019","Gratuito");
//When eres Omori: Soy Una mierda
    juegos titanfall2 = new juegos("Titanfall 2","2016","29.99€");
    @FXML
    private TextField textField;
    @FXML
    private Label nombre;
    @FXML
    private Label nombre1;

    @FXML
    private Label nombre11;
    @FXML

    private Label nombre111;
    @FXML


    String datos;
    @FXML



    public void send(ActionEvent e) {
        System.out.println("enviado");
        datos= textField.getText();

        String result = datos.toLowerCase();
        System.out.println(result);

        switch(result){
            case"mario":
               nombre.setText("Juegos de Mario:");
                nombre1.setText(mario.nombre);
                nombre11.setText("Año: "+mario.year);
                nombre111.setText("Precio: "+mario.price);
                System.out.println("Juegos de Mario: ");
                System.out.println(mario.nombre+" "+mario.year+" "+mario.price+" €");
            break;
            case"sonic":
                System.out.println("este es sonic");
                nombre.setText("Juegos de Sonic: ");
                nombre1.setText(sonic.nombre);
                nombre11.setText("Año: "+sonic.year);
                nombre111.setText("Precio: "+sonic.price);

            break;
            case"splatoon":
                nombre.setText("Juegos de Splatoon: ");
                nombre1.setText(splatoon3.nombre);
                nombre11.setText("Año: "+splatoon3.year);
                nombre111.setText("Precio: "+splatoon3.price);

            break;

            case"apex":
                nombre.setText("Juegos de Apex: ");
                nombre1.setText(apex.nombre);
                nombre11.setText("Año: "+apex.year);
                nombre111.setText("Precio: "+apex.price);
            break;

            case"titanfall":
                nombre.setText("Juegos de Titanfall: ");
                nombre1.setText(titanfall2.nombre);
                nombre11.setText("Año: "+titanfall2.year);
                nombre111.setText("Precio: "+titanfall2.price);
            break;

            default:
                nombre.setText("Lo que ha buscado no está disponible");
                nombre1.setText("");
                nombre11.setText("");
                nombre111.setText(" ");
            break;


        }

    }


}




