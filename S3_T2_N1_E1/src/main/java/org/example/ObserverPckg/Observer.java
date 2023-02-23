package org.example.ObserverPckg;

import org.example.SubjectPckg.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
