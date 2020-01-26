package com.ms.meetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.meetup.model.Group;

public interface GroupRepository extends JpaRepository<Group, Long>{

}
