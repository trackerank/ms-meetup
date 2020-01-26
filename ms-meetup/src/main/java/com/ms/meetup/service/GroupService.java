package com.ms.meetup.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.meetup.model.Group;
import com.ms.meetup.repository.GroupRepository;

@Service
public class GroupService {
	@Autowired
	private GroupRepository groupRepository;
	
	public Group getGroupById(Long groupId) throws Exception {
		Optional<Group> groupOp = groupRepository.findById(groupId);
		if(groupOp.isPresent()) {
			return groupOp.get();
		}else {
			throw new Exception("Unable to find data for id: "+groupId);
		}
	}
	
	public Group createGroups(Group group) throws Exception {
		group = groupRepository.save(group);
		return group;
	}
}
