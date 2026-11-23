# Assignment 6.2 – Currency Converter

## About the Project

I created a simple currency converter using JavaFX. The application can convert between USD, EUR, and GBP using fixed exchange rates.

## Completed Requirements

1. **User Interface:** I added two text fields, two currency dropdown menus, labels, and a Convert button.

2. **Layout:** I used VBox to arrange the components neatly.

3. **MVC Pattern:** I separated the code into Model (Currency), View (CurrencyView), and Controller (CurrencyController).

4. **Currency Conversion:** The application calculates and shows the converted amount. For example, 100 USD = 92 EUR.

5. **Error Handling:** If the user enters something wrong, like "abc" or "-10", the application shows "Invalid amount!".

6. **Instructions:** I added a short instruction to help users understand how to use the converter.

## Styling

I used CSS to change the font to Arial, increase the text size, and make the Convert button light blue.

## Testing

I tested the application with different inputs:
- 100 USD to EUR → 92 EUR
- abc → Invalid amount!
- -10 → Invalid amount!

Everything worked as expected.

## How to Run

Open the project in IntelliJ IDEA and run `HelloApplication.java`.