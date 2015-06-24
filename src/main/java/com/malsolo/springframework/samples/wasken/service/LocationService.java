package com.malsolo.springframework.samples.wasken.service;

import java.util.List;

import com.malsolo.springframework.samples.wasken.domain.Location;

public interface LocationService {
	
	List<Location> findLocations();

}
