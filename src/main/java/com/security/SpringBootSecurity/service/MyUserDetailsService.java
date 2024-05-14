package com.security.SpringBootSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.SpringBootSecurity.config.UserPrincipal;
import com.security.SpringBootSecurity.entity.User;
import com.security.SpringBootSecurity.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user=repo.findByUserName(username);
		if(user==null) {
			throw new UsernameNotFoundException("user not available... 404");
		}
		
		return new UserPrincipal(user);
	}

}
