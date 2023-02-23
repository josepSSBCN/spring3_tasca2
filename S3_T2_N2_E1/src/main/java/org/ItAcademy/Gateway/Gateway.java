package org.ItAcademy.Gateway;

import org.ItAcademy.InterfacePckg.Callback;

public class Gateway {
    //region ATTRIBUTES

    //endregion ATTRIBUTES


    //region CONSTRUCTOR

    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS

    //endregion GETTERS & SETTERS


    //region METHODS
    public String StartPayment(Callback callback) {
        String resul = "";
        System.out.println("GATEWAY: Start connection");
        resul = callback.StartPayment();

        return resul;

    }

    //endregion METHODS

}
