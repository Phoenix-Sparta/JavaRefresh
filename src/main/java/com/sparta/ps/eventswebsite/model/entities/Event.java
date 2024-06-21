package com.sparta.ps.eventswebsite.entities;

import java.time.LocalDateTime;

public class Event {

    private String eventName;
    private String eventType;
    private LocalDateTime localDateTime;

    public Event(String eventName, String eventType, LocalDateTime localDateTime) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.localDateTime = localDateTime;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", eventType='" + eventType + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
