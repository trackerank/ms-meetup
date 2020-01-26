package com.ms.meetup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.ms.meetup.constants.MeetupConstants.CATEGORIES_URL;
import com.ms.meetup.model.Category;
import com.ms.meetup.service.CategoriesService;

@RestController
@RequestMapping(value=CATEGORIES_URL)
public class CategoriesController {
	@Autowired
	private CategoriesService categoriesService;
	
	@GetMapping
	public ResponseEntity<List<Category>> getCategories() {
		return ResponseEntity.ok(categoriesService.getCategories());
	}
	
	@PostMapping
	public ResponseEntity<String> addCategory(@RequestBody Category category) throws Exception {
		return ResponseEntity.ok(categoriesService.addCategory(category));
	}
}
