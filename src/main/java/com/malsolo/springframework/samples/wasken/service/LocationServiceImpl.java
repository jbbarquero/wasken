package com.malsolo.springframework.samples.wasken.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.malsolo.springframework.samples.wasken.domain.Location;

@Service("locationService")
public class LocationServiceImpl implements LocationService {

	public List<Location> findLocations() {
		List<Location> list = new ArrayList<>();
		list.add(new Location("clave", "nombre", "locationType", "iata"));
		return list;
	}

}
