package com.postgresql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgresql.model.Profile;
import com.postgresql.repository.ProfileRepository;

@Service
public class ProfileService {
	@Autowired
	private ProfileRepository profileRepo;
	
	public Profile getProfile(Long id){
		return profileRepo.findInstituteById(id);
	}
}
