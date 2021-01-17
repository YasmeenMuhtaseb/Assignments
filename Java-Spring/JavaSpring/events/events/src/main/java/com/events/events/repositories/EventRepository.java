package com.events.events.repositories;

import com.events.events.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event,Long> {
    List<Event> findByStateNot(String state);
    List<Event> findAllByState(String state);
    void deleteEventById(Long id);
}

