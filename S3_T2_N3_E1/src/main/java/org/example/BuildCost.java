package org.example;

public class BuildCost {
    //region METHODS
    /**
     * Method to build cost.
     *
     * @param currencyToIn Currency to converter.
     * @param valueIn        Value converted.
     * @return Result.
     */
    public String BuildCost(CurrencyENUM currencyToIn, double valueIn) {
        String text;

        text = String.format("The article's cost in '%s' is  %.2f %s", currencyToIn,
                valueIn, currencyToIn.label);

        return text;
    }

    //endregion METHODS

}
