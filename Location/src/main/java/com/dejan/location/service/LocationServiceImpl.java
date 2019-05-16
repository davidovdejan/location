package com.dejan.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dejan.location.model.Location;
import com.dejan.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	// adding the dependency
	@Autowired
	private LocationRepository repository;

	// proper encapsulation with setter and getter
	public LocationRepository getRepository() {
		return repository;
	}

	public void setRepository(LocationRepository repository) {
		this.repository = repository;
	}

	@Override
	public Location saveLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		repository.delete(location);
	}

	@Override
	public Location getLocationById(int id) {
		return repository.getOne(id);
	}

	@Override
	public List<Location> getAllLocations() {
		return repository.findAll();
	}

	
	
	
	
	
	
	
	
}
