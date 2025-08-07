package lk.ijse.gdse.springdeployment.service;

import lk.ijse.gdse.springdeployment.entity.Event;

import java.util.List;

public interface EventService {
    List<Event> getEvents();
    Event getEvent(Long id);
    Event saveEvent(Event event);
    Event updateEvent(Event event);
    void deleteEvent(Long id);
}
