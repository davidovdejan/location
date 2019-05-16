package com.dejan.location.service;

import java.util.List;
import java.util.Optional;

import com.dejan.location.model.Location;

public interface LocationService {

	Location saveLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Location getLocationById(int id);
	
	List<Location> getAllLocations();
}
