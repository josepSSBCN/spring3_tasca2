package org.example.ObserverPckg;

import org.example.SubjectPckg.Subject;

public class Agency2 extends Observer{
    //region ATTRIBUTES
    private String agencyName;
    private int quantityStockMarket1;
    private int quantityStockMarket2;
    private int quantityStockMarket3;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR
    public Agency2(int quantityStockMarket1, int quantityStockMarket2, int quantityStockMarket3, Subject subjectIn,
                   String agencyNameIn) {
        this.quantityStockMarket1 = quantityStockMarket1;
        this.quantityStockMarket2 = quantityStockMarket2;
        this.quantityStockMarket3 = quantityStockMarket3;
        subject = subjectIn;
        this.agencyName = agencyNameIn;
    }

    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS
    public int getQuantityStockMarket1() {
        return quantityStockMarket1;
    }

    public void setQuantityStockMarket1(int quantityStockMarket1) {
        this.quantityStockMarket1 = quantityStockMarket1;
    }

    public int getQuantityStockMarket2() {
        return quantityStockMarket2;
    }

    public void setQuantityStockMarket2(int quantityStockMarket2) {
        this.quantityStockMarket2 = quantityStockMarket2;
    }

    public int getQuantityStockMarket3() {
        return quantityStockMarket3;
    }

    public void setQuantityStockMarket3(int quantityStockMarket3) {
        this.quantityStockMarket3 = quantityStockMarket3;
    }

    //endregion GETTERS & SETTERS


    //region METHODS
    @Override
    public void update() {
        //region DEFINITION VARIABLES
        String text;

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        text = String.format("AGENCY '%s'", this.agencyName);
        text = text.concat(String.format("Nova actualització:\n.- El valor total de les accions de la 'Empresa 1' és ara de: " +
                        "%s (unitats: %s; valor/unitat: %s) "
                , quantityStockMarket1 * subject.getValueStockMarket1(), quantityStockMarket1, subject.getValueStockMarket1()));

        text = text.concat(String.format("\n.- El valor total de les accions de la 'Empresa 2' és ara de: " +
                        "%s (unitats: %s; valor/unitat: %s) "
                , quantityStockMarket2 * subject.getValueStockMarket2(), quantityStockMarket2,
                subject.getValueStockMarket2()));

        text = text.concat(String.format("\n.- El valor total de les accions de la 'Empresa 3' és ara de: " +
                        "%s (unitats: %s; valor/unitat: %s) "
                , quantityStockMarket3 * subject.getValueStockMarket2(), quantityStockMarket3,
                subject.getValueStockMarket3()));

        //endregion ACTIONS


        // OUT
        System.out.println(text);

    }

    //endregion METHODS

}
