package org.ItAcademy.Gateway;

import org.ItAcademy.InterfacePckg.Callback;

public class BankPayment implements Callback {
    //region ATTRIBUTES


    //endregion ATTRIBUTES


    //region CONSTRUCTOR

    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS

    //endregion GETTERS & SETTERS


    //region METHODS: Override
    @Override
    public String StartPayment() {
        return "Payment with BANK is started correctly!";
    }

    @Override
    public String BankDebPayment() {
        return "Payment with BANK make correctly!";
    }

    @Override
    public String VisaPayment() {
        return "";
    }

    @Override
    public String PayPalPayment() {
        return "";
    }

    //endregion METHODS: Override

}
