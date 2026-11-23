
package com.example.currencyconverter;

import javafx.application.Application;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {

        CurrencyView view = new CurrencyView();

        new CurrencyController(view);

        view.show(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
