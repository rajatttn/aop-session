package org.ttn.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
import org.ttn.event.CustomEvent;
@Component
public class DummyPublisher implements ApplicationEventPublisherAware {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;
   public void display() {
        CustomEvent customEvent = new CustomEvent(this);
        applicationEventPublisher.publishEvent(customEvent);
        System.out.println("Display -------------------");
    }
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    } }

