package com.ms.meetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.meetup.model.Event;

public interface EventRepository extends JpaRepository<Event, Long>{

}
