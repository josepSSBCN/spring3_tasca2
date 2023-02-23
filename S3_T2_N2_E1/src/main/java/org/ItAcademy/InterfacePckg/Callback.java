package org.ItAcademy.InterfacePckg;

import org.ItAcademy.domainPckg.BankDebInfo;
import org.ItAcademy.domainPckg.PayPalInfo;
import org.ItAcademy.domainPckg.VisaInfo;

public interface Callback {
    //region METHODS
    String StartPayment();
    String VisaPayment();
    String PayPalPayment();
    String  BankDebPayment();

    //endregion METHODS

}
