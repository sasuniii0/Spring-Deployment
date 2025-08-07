package lk.ijse.gdse.springdeployment.controller;

import lk.ijse.gdse.springdeployment.entity.Event;
import lk.ijse.gdse.springdeployment.repository.EventRepository;
import lk.ijse.gdse.springdeployment.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("api/v1/events")
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Event>> getAllEvents() {
        List<Event> events = eventService.getEvents();
        return ResponseEntity.ok(events);
    }

    @GetMapping("/get")
    public ResponseEntity<Event> getEventById(@RequestParam Long id) {
        Event event = eventService.getEvent(id);
        return ResponseEntity.ok(event);
    }

    @PostMapping("/save")
    public ResponseEntity<Event> saveEvent(@RequestBody Event event) {
        Event savedEvent = eventService.saveEvent(event);
        return ResponseEntity.status(201).body(savedEvent);
    }

    @PostMapping("/update")
    public ResponseEntity<Event> updateEvent(@RequestBody Event event) {
        Event updatedEvent = eventService.updateEvent(event);
        return ResponseEntity.ok(updatedEvent);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteEvent(@RequestParam Long id) {
        eventService.deleteEvent(id);
        return ResponseEntity.ok("Event deleted successfully");
    }
}
