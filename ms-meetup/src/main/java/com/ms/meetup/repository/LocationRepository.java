package com.ms.meetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.meetup.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long>{

}
