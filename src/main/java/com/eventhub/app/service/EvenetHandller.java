package com.eventhub.app.service;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EvenetHandller {


    @EventListener
    @Async
    public void handleEvent (String name){
        System.out.println(name);
    }
}
