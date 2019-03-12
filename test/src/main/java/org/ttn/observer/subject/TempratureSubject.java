package org.ttn.observer.subject;

import org.ttn.observer.ob.TempratureObserver;

public interface TempratureSubject {

    void addObserver(TempratureObserver observer);
    void removeObserver(TempratureObserver observer);
    void notifyObserver();

}
