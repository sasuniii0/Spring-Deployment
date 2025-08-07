package lk.ijse.gdse.springdeployment.service.impl;

import lk.ijse.gdse.springdeployment.entity.Event;
import lk.ijse.gdse.springdeployment.repository.EventRepository;
import lk.ijse.gdse.springdeployment.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;
    @Override
    public List<Event> getEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event getEvent(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    @Override
    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event updateEvent(Event event) {
        Event oldEvent = eventRepository.findById(event.getId()).orElseThrow(() ->
                new IllegalArgumentException("Event not found with id: " + event.getId()));
        oldEvent.setName(event.getName());
        oldEvent.setDescription(event.getDescription());
        oldEvent.setDate(event.getDate());
        oldEvent.setLocation(event.getLocation());
        return eventRepository.save(oldEvent);
    }

    @Override
    public void deleteEvent(Long id) {
        Event delEvent = eventRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Event not found with id: " + id));
        eventRepository.delete(delEvent);
    }
}
