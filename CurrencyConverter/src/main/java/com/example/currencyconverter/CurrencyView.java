
package com.example.currencyconverter;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CurrencyView {

    TextField amountField = new TextField();
    TextField resultField = new TextField();

    ComboBox<Currency> fromBox = new ComboBox<>();
    ComboBox<Currency> toBox = new ComboBox<>();

    Button convertButton = new Button("Convert");

    public void show(Stage stage) {

        Label instructions = new Label(
                "Enter an amount, select currencies, and click Convert."
        );

        Label amountLabel = new Label("Amount:");
        Label fromLabel = new Label("From currency:");
        Label toLabel = new Label("To currency:");
        Label resultLabel = new Label("Converted amount:");

        resultField.setEditable(false);

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        layout.getChildren().addAll(
                instructions,
                amountLabel,
                amountField,
                fromLabel,
                fromBox,
                toLabel,
                toBox,
                convertButton,
                resultLabel,
                resultField
        );

        Scene scene = new Scene(layout, 400, 420);

        // Connect CSS file
        scene.getStylesheets().add(
                getClass().getResource("/style.css").toExternalForm()
        );

        stage.setTitle("Currency Converter");
        stage.setScene(scene);
        stage.show();
    }
}
