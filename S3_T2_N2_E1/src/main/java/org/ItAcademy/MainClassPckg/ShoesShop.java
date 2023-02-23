package org.ItAcademy.MainClassPckg;

import org.ItAcademy.Gateway.BankPayment;
import org.ItAcademy.Gateway.Gateway;
import org.ItAcademy.Gateway.PayPalPayment;
import org.ItAcademy.Gateway.VisaPayment;
import org.ItAcademy.InterfacePckg.Callback;

import java.sql.SQLOutput;

public class ShoesShop {
    //region ATTRIBUTES
    private Gateway gateway = new Gateway();
    private Gateway gateway2 = new Gateway();
    Callback visaPayment = new VisaPayment();
    Callback payPalPayment = new PayPalPayment();
    Callback bankPayment = new BankPayment();


    //endregion ATTRIBUTES


    //region CONSTRUCTOR

    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS


    //endregion GETTERS & SETTERS


    //region METHODS
    public void MakePayment(){
        //region DEFINITION VARIABLES
        String resul;

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        try {
            // First payment with VISA
            resul = gateway.StartPayment(visaPayment);
            do{

            }while (resul.isEmpty());
            System.out.println(resul);


            // Second payment with PayPal
            resul = gateway2.StartPayment(new Callback() {
                @Override
                public String StartPayment() {
                    System.out.println("Payment is started");
                    return "";
                }

                @Override
                public String VisaPayment() {
                    return null;
                }

                @Override
                public String PayPalPayment() {
                    return null;
                }

                @Override
                public String BankDebPayment() {
                    return null;
                }
            });


        }catch (Exception ex){
            ex.printStackTrace();
        }
        //endregion ACTIONS


        // OUT

    }

    //endregion METHODS


}
