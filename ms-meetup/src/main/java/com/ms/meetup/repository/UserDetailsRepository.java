package com.ms.meetup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.meetup.model.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long>{
	List<UserDetails> findByUsername(String username);
}
