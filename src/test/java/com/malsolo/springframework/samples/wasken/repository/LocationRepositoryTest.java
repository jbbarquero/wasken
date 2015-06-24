package com.malsolo.springframework.samples.wasken.repository;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.malsolo.springframework.samples.wasken.RootConfig;

@ContextConfiguration(classes = RootConfig.class)
public class LocationRepositoryTest extends AbstractIntegrationTest {
	
	@Autowired
	LocationRepository locationRepository;
	
	@Test
	public void testMarkerMethod() {
	}
	
	@Test
	public void testFindAll() {
		List<Location> locations = this.locationRepository.findAll();
		assertNotNull(locations);
		assertTrue(locations.size() == 3);
		Location l = new Location(1L, "12345", "00000000000000000001", "Location 1", "LO1");
		assertEquals(l, locations.get(0));
	}
}
