package com.postgresql.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.postgresql.model.Profile;

@Repository
public class ProfileRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	
	public Profile findInstituteById(Long id) {
		Profile instProfile = entityManager.find(Profile.class, id);
		return instProfile;
	}
	
	public Profile addProfile(Profile profile) {
		entityManager.persist(profile);
		entityManager.flush();
		entityManager.detach(profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		entityManager.merge(profile);
		entityManager.flush();
		entityManager.detach(profile);
		return profile;
	}
	
	public void deleteProfile(Profile profile) {
		entityManager.remove(profile);
		entityManager.flush();
	}
}
