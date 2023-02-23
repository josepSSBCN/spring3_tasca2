package org.ItAcademy.domainPckg;

import java.nio.DoubleBuffer;

public class BankDebInfo {
    //region ATTRIBUTES
    private String numberAccount;
    private double amount;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR
    public BankDebInfo(){

    }

    public BankDebInfo(String numberAccount, double amount) {
        this.numberAccount = numberAccount;
        this.amount = amount;
    }


    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS
    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    //endregion GETTERS & SETTERS


    //region METHODS

    //endregion METHODS


}
