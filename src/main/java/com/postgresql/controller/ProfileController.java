package com.postgresql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.postgresql.model.Profile;

@RestController
public class ProfileController {
	@Autowired
	private ProfileController profileService;
	
	@GetMapping("/profile/{id}")
	public Profile getProfile(@PathVariable("id") Long id){
		
		Profile p=profileService.getProfile(id);
		return p;
	}
	@GetMapping("/profile")
	public String getpro(){
	return "hello world";
	}
	@GetMapping("/user/{id}")
	public Profile getprofile(@PathVariable("id") Long id)
	{
	Profile p=profileService.getProfile(id);
	return p;
	}
}
