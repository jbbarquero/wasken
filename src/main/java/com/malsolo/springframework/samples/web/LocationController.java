package com.malsolo.springframework.samples.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.malsolo.springframework.samples.wasken.domain.Location;
import com.malsolo.springframework.samples.wasken.service.LocationService;

@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	LocationService locationService;

	@RequestMapping(value = "all", method = RequestMethod.GET)
	public List<Location> locations() {
		return locationService.findLocations();
	}

}
