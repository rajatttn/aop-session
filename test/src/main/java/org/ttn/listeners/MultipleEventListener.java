
package org.ttn.listeners;

import org.springframework.context.event.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MultipleEventListener {
    @EventListener(ContextStartedEvent.class)
    @Async
    void start() {
        try {
            System.out.println("i m gonna sleep");
            Thread.sleep(2000);
        }catch (Exception e)
        {
            System.out.println("hey exception occured.Please  check ur code");
        }
        System.out.println("----------------start");
    }
    @EventListener(ContextStoppedEvent.class)
    void stopped() {
        System.out.println("----------------stopped");
    }
}


