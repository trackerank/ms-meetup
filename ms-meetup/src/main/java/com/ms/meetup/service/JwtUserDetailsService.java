package com.ms.meetup.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.ms.meetup.repository.UserDetailsRepository;
import com.ms.meetup.vo.UserDetailsRequestVO;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<com.ms.meetup.model.UserDetails> users = userDetailsRepository.findByUsername(username);
		if (CollectionUtils.isEmpty(users)) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}else {
			com.ms.meetup.model.UserDetails user = users.get(0);
			return new User(user.getUsername(), user.getPassword(),new ArrayList<>());
		}
	}

	public void saveUserDetails(UserDetailsRequestVO userDetailsRequestVO) throws Exception {
		List<com.ms.meetup.model.UserDetails> users = userDetailsRepository
				.findByUsername(userDetailsRequestVO.getUsername());
		if (CollectionUtils.isEmpty(users)) {
			com.ms.meetup.model.UserDetails userDetails = prepareUserDetailsFromUserDetailsRequestVO(
					userDetailsRequestVO);
			userDetailsRepository.save(userDetails);
		} else {
			throw new Exception("Username is taken. Please Change your username.");
		}
	}

	private com.ms.meetup.model.UserDetails prepareUserDetailsFromUserDetailsRequestVO(
			UserDetailsRequestVO userDetailsRequestVO) {
		com.ms.meetup.model.UserDetails userDetails = new com.ms.meetup.model.UserDetails();
		userDetails.setEmailId(userDetailsRequestVO.getEmailId());
		userDetails.setFirstName(userDetailsRequestVO.getFirstName());
		userDetails.setLastName(userDetailsRequestVO.getLastName());
		userDetails.setPassword(bcryptEncoder.encode(userDetailsRequestVO.getPassword()));
		userDetails.setLocationId(userDetailsRequestVO.getLocationId());
		userDetails.setUsername(userDetailsRequestVO.getUsername());
		return userDetails;
	}

}
