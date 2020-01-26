package com.ms.meetup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.meetup.model.Category;
import com.ms.meetup.repository.CategoryRepository;

@Service
public class CategoriesService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> getCategories() {
		return categoryRepository.findAll();
	}
	
	public String addCategory(Category category) {
		categoryRepository.saveAndFlush(category);
		return "Success";
	}
}
