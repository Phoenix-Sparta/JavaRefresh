package com.sparta.ps.eventswebsite.repositories;

import com.sparta.ps.eventswebsite.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
