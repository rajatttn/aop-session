package org.ttn.observer.ob;

public class TempratureCustomer1 implements TempratureObserver {
    @Override
    public void update(int temprature) {
        System.out.println("temprature recieved by  Temprature customer 1");
    }
}
