package org.ttn.observer.ob;

public class TempratureCustomer2 implements TempratureObserver {
    @Override
    public void update(int temprature) {
        System.out.println("temprature customer 2 recieved temprature");
    }
}
