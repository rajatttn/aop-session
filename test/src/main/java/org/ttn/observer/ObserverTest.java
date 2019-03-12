package org.ttn.observer;

import org.ttn.observer.ob.TempratureCustomer1;
import org.ttn.observer.ob.TempratureCustomer2;
import org.ttn.observer.subject.TempratureStation;

public class ObserverTest {
    public static void main(String[] args) {
        TempratureCustomer1 customer1 = new TempratureCustomer1();
        TempratureCustomer2 customer2 = new TempratureCustomer2();
        TempratureStation station = new TempratureStation(15);
        station.addObserver(customer1);
        station.addObserver(customer2);
        station.setTemprature(50);
    }




}
