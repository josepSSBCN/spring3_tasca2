package org.ItAcademy.domainPckg;

public class VisaInfo {
    //region ATTRIBUTES
    private String number;
    private String expirDate;
    private int cvc;
    private double amount;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR
    public VisaInfo(){

    }

    public VisaInfo(String number, String expirDate, int cvc, double amount) {
        this.number = number;
        this.expirDate = expirDate;
        this.cvc = cvc;
        this.amount = amount;
    }

    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpirDate() {
        return expirDate;
    }

    public void setExpirDate(String expirDate) {
        this.expirDate = expirDate;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
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
