package org.example;


public class Converter {
    //region ATTRIBUTES
    private static double euroDolar;
    private static double euroYen;
    private static double euroSwissFranc;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR
    public Converter(double euroDolarIn, double euroYenIn, double euroSwissFrancIn) {
        euroDolar = euroDolarIn;
        euroYen = euroYenIn;
        euroSwissFranc = euroSwissFrancIn;

    }

    //endregion CONSTRUCTOR


    //region METHODS
    /**
     * Conversión from € to another currencys.
     *
     * @param valueIn      Value in Euro currency.
     * @param currencyToIn Currency we want converter.
     * @return Value converted
     */
    public double Conversion(double valueIn, CurrencyENUM currencyToIn) {
        //region DEFINITION VARIABLES
        double value;

        //endregion DEFINITION VARIABLES

        //region ACTIONS
        switch (currencyToIn) {
            case SWISSFRANC -> value = valueIn * euroSwissFranc;
            case DOLAR -> value = valueIn * euroDolar;
            case YEN -> value = valueIn * euroYen;
            default -> value = valueIn;
        }

        //endregion ACTIONS

        // OUT
        return value;

    }

    //endregion METHODS

}
