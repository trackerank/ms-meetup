package com.ms.meetup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.meetup.model.Group;
import com.ms.meetup.service.GroupService;

@RestController
@RequestMapping(value="/groups")
public class GroupController {
	@Autowired
	private GroupService groupService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Group> getGroupById(@PathVariable("id")Long groupId) throws Exception {
		Group group = null;
		try {
			group = groupService.getGroupById(groupId);
		}catch(Exception exp) {
			return ResponseEntity.ok(null);
		}
		return ResponseEntity.ok(group);
	}
	
	@PostMapping
	public ResponseEntity<String> addOrders(@RequestBody Group group) throws Exception {
		groupService.createGroups(group);
		return ResponseEntity.ok("Success");
	}
}
