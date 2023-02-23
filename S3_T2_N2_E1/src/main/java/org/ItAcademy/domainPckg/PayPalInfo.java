package org.ItAcademy.domainPckg;

public class PayPalInfo {
    //region ATTRIBUTES
    private String account;
    private double amount;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR
    public PayPalInfo() {

    }

    public PayPalInfo(String account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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
