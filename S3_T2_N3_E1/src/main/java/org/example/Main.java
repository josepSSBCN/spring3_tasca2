package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //region DEFINITION VARIABLES
        Converter converter = new Converter(1.06f,
                134.25f, 0.99f);
        BuildCost buildCost = new BuildCost();

        List<Article> articles = new ArrayList<>(Arrays.asList(
                new Article(23.4f, converter, buildCost),
                new Article(59.99f, converter, buildCost),
                new Article(3.15f, converter, buildCost),
                new Article(100f, converter, buildCost)));

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        System.out.println("ARTICLES COST IN EURO: ");
        articles.forEach(x->x.printCost(CurrencyENUM.EURO));

        System.out.println("\nARTICLES COST IN YEN: ");
        articles.forEach(x->x.printCost(CurrencyENUM.YEN));

        System.out.println("\nARTICLES COST IN DOLAR: ");
        articles.forEach(x->x.printCost(CurrencyENUM.DOLAR));

        //endregion ACTIONS

    }
}