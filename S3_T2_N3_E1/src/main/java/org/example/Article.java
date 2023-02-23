package org.example;

public class Article {
    //region ATTRIBUTES
    private double cost;
    private Converter converter;
    private BuildCost buildCost;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR
    public Article(double costIn, Converter converterIn, BuildCost buildCostIn) {
        this.cost = costIn;
        this.converter = converterIn;
        this.buildCost = buildCostIn;

    }

    //endregion CONSTRUCTOR


    //region METHODS
    /**
     * Method to print the article's cost in currency selected.
     *
     * @param currencyToIn Currency to print cost.
     */
    public void printCost(CurrencyENUM currencyToIn) {
        double costConverted = 0f;
        String text = "";

        costConverted = this.converter.Conversion(this.cost, currencyToIn);
        text = this.buildCost.BuildCost(currencyToIn, costConverted);
        System.out.println(text);

    }

    //endregion METHODS

}
