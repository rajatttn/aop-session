package org.ttn.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.ttn.event.CustomEvent;

@Component
public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.getTimestamp());
    }
}

