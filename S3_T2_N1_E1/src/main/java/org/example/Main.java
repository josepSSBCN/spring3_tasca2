package org.example;

import org.example.ObserverPckg.Agency1;
import org.example.ObserverPckg.Agency2;
import org.example.ObserverPckg.Agency3;
import org.example.SubjectPckg.Subject;

public class Main {
    public static void main(String[] args) {
        //region DEFINITION VARIABLES
        Subject subject = new Subject(2.5, 1.23, 5.67);
        Agency1 agency101 = new Agency1(25, 100, 50, subject,
                "La bolsa o la vida!");
        Agency2 agency201 = new Agency2(146, 95, 150, subject,
                "EL dinero y a volar");
        Agency3 agency301 = new Agency3(205, 525, 475, subject,
                "EL dinero y a volar");

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        subject.addOberver(agency101);
        subject.addOberver(agency201);
        subject.addOberver(agency301);

        subject.setValueStockMarket1(2.75);
        subject.notificationObservers();

        //endregion ACTIONS


        // OUT


    }
}