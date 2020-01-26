package com.ms.meetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.meetup.model.UserCategory;

public interface UserCategoryRepository extends JpaRepository<UserCategory, Long>{

}
