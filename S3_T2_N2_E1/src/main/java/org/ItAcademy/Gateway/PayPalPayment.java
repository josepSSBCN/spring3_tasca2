package org.ItAcademy.Gateway;

import org.ItAcademy.InterfacePckg.Callback;

public class PayPalPayment implements Callback {
    //region ATTRIBUTES


    //endregion ATTRIBUTES


    //region CONSTRUCTOR

    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS

    //endregion GETTERS & SETTERS


    //region METHODS: Override

    @Override
    public String StartPayment() {
        return "Payment with PayPal is started correctly!";
    }

    @Override
    public String PayPalPayment() {
        return "Payment with PayPal make correctly!";
    }

    @Override
    public String VisaPayment() {
        return "";
    }

    @Override
    public String BankDebPayment() {
        return "";
    }

    //endregion METHODS: Override


}
