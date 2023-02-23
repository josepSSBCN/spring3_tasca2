package org.example.SubjectPckg;

import org.example.ObserverPckg.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    //region ATTRIBUTES
    private List<Observer> observerList;
    // Market values
    private double valueStockMarket1;
    private double valueStockMarket2;
    private double valueStockMarket3;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR
    public Subject(double valueStockMarket1, double valueStockMarket2,
                   double valueStockMarket3) {
        this.observerList = new ArrayList<>();

        this.valueStockMarket1 = valueStockMarket1;
        this.valueStockMarket2 = valueStockMarket2;
        this.valueStockMarket3 = valueStockMarket3;

    }

    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS
    public double getValueStockMarket1() {
        return valueStockMarket1;
    }

    public void setValueStockMarket1(double valueStockMarket1) {
        this.valueStockMarket1 = valueStockMarket1;
    }

    public double getValueStockMarket2() {
        return valueStockMarket2;
    }

    public void setValueStockMarket2(int valueStockMarket2) {
        this.valueStockMarket2 = valueStockMarket2;
    }

    public double getValueStockMarket3() {
        return valueStockMarket3;
    }

    public void setValueStockMarket3(double valueStockMarket3) {
        this.valueStockMarket3 = valueStockMarket3;
    }

    //endregion GETTERS & SETTERS


    //region METHODS
    public void addOberver(Observer observerIn) {
        if ((observerIn != null) && (!observerList.contains(observerIn))){
            this.observerList.add(observerIn);
        }
    }

    public void notificationObservers(){
        this.observerList.forEach(x->x.update());
    }

    //endregion METHODS

}
