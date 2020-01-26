package com.ms.meetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.meetup.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
