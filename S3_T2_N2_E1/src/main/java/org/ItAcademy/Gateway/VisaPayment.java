package org.ItAcademy.Gateway;

import org.ItAcademy.InterfacePckg.Callback;

public class VisaPayment implements Callback {
    //region ATTRIBUTES


    //endregion ATTRIBUTES


    //region CONSTRUCTOR

    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS

    //endregion GETTERS & SETTERS


    //region METHODS: Override
    @Override
    public String StartPayment() {
        return "VISA: Connected!";
    }

    @Override
    public String  VisaPayment() {
        return "VISA: Payment make correctly!";
    }

    @Override
    public String PayPalPayment() {
        return "";
    }

    @Override
    public String BankDebPayment() {
        return "";
    }

    //endregion METHODS: Override


}
