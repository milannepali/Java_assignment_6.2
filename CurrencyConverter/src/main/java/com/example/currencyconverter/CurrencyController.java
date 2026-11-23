
package com.example.currencyconverter;

public class CurrencyController {

    private CurrencyView view;

    public CurrencyController(CurrencyView view) {
        this.view = view;

        Currency usd = new Currency("USD", "US Dollar", 1.0);
        Currency eur = new Currency("EUR", "Euro", 0.92);
        Currency gbp = new Currency("GBP", "British Pound", 0.79);

        view.fromBox.getItems().addAll(usd, eur, gbp);
        view.toBox.getItems().addAll(usd, eur, gbp);

        view.fromBox.setValue(usd);
        view.toBox.setValue(eur);

        view.convertButton.setOnAction(e -> convert());
    }

    private void convert() {
        try {
            double amount = Double.parseDouble(
                    view.amountField.getText()
            );

            if (!Double.isFinite(amount) || amount < 0) {
                throw new NumberFormatException();
            }

            Currency from = view.fromBox.getValue();
            Currency to = view.toBox.getValue();

            double result = amount / from.getRate() * to.getRate();

            view.resultField.setText(
                    String.format("%.2f", result)
            );

        } catch (NumberFormatException e) {
            view.resultField.setText("Invalid amount!");
        }
    }
}
