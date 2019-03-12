package org.ttn.observer.subject;

import org.ttn.observer.ob.TempratureObserver;
import java.util.HashSet;
import java.util.Set;

public class TempratureStation implements TempratureSubject {
    int temprature;

    public TempratureStation(int temprature) {
        this.observers = new HashSet<TempratureObserver>();
        this.temprature=temprature;
    }

    Set<TempratureObserver> observers;
    @Override
    public void addObserver(TempratureObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(TempratureObserver observer) {
            observers.remove(observer);
    }


    @Override
    public void notifyObserver() {
      observers.stream().forEach(observer -> observer.update(this.temprature));
    }

    public  void  setTemprature(int temprature)
    {
        this.temprature=temprature;
        notifyObserver();
    }
}
