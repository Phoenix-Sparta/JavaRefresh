package com.sparta.ps.eventswebsite.controllers;


import com.sparta.ps.eventswebsite.model.entities.Event;
import com.sparta.ps.eventswebsite.model.exceptions.EventDoesNotExistException;
import com.sparta.ps.eventswebsite.service.EventService;
import com.sparta.ps.eventswebsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EventController {
    private final EventService eventService;
    private final UserService userService;

    @Autowired
    public EventController(EventService eventService, UserService userService) {
        this.eventService = eventService;
        this.userService = userService;
    }

    @GetMapping("/event")
    public List<Event> getEvents(){
        return eventService.getEvents();
    }

    @GetMapping("/event/{id}")
    public Event getEventById(@PathVariable Integer id) throws EventDoesNotExistException {
        Optional<Event> event = eventService.getEventById(id);
        if(event.isEmpty()){
            throw new EventDoesNotExistException(Integer.toString(id));
        }
        return eventService.getEventById(id).get();
    }

    @DeleteMapping("/event/{id}")
    public Event deleteEventById(@RequestParam Integer id, @RequestParam(name="key", required=false) String key) throws EventDoesNotExistException {
        Event event = eventService.getEventById(id)
                .orElseThrow(() -> new EventDoesNotExistException(String.valueOf(id)));
        eventService.deleteEvent(id);
        return event;
    }

    @PostMapping("/event/create")
    public void createEvent(@RequestBody Event event){
        eventService.addEvent(event);
    }

    @PutMapping("/event/edit")
    public Event editEvent(@RequestBody Event eventNew, @RequestParam Integer id) throws EventDoesNotExistException {
        Event event = eventService.editEvent(id, eventNew);
        if(event == null){
            throw new EventDoesNotExistException(eventNew.getEventName());
        }
        return event;
    }
}
