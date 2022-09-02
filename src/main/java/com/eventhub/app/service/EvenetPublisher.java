package com.eventhub.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EvenetPublisher {

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void getTheEvent(String name){
        System.out.println(" it's working fine");

        applicationEventPublisher.publishEvent("Working fine");
    }
}
