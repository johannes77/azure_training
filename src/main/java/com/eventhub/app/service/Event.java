package com.eventhub.app.service;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class Event<T> extends ApplicationEvent {

    private T data;
    public Event(T source) {
        super(source);
        this.data = source;
    }
}
