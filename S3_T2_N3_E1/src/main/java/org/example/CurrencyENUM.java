package org.example;

public enum CurrencyENUM {
    EURO("€"),
    DOLAR("$"),
    YEN("¥"),
    SWISSFRANC("CHF");

    public final String label;

    private CurrencyENUM(String label){
        this.label = label;
    }
}
