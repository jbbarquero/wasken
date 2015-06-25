package com.malsolo.springframework.samples.wasken.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Timestamp;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.malsolo.springframework.samples.wasken.RootConfig;

@ContextConfiguration(classes = RootConfig.class)
public class LocationRepositoryTest extends AbstractIntegrationTest {
	
	private static final DateTimeFormatter FMT = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
	
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
		Location l = new Location(1L, "12345", "00000000000000000001", "Location 1", "LO1"
				, new Timestamp(FMT.parseDateTime("2015-06-24 20:30:40").getMillis()));
		assertEquals(l, locations.get(0));
	}
	
	@Test
	public void testDoStuffWithTheKey() {
		List<Location> locations = this.locationRepository.doStuffWithTheKey("54321");
		assertNotNull(locations);
		assertTrue(locations.size() == 1);
		Location l = new Location(2L, "54321", "00000000000000000002", "Location 2", "LO2"
				, new Timestamp(FMT.parseDateTime("2015-06-24 21:30:40").getMillis()));
		assertEquals(l, locations.get(0));
	}
	
	@Test
	public void testDoStuffWithDates() {
		List<Location> locations = this.locationRepository.doStuffWithDates(
				new DateTime(2015, 06, 24, 20, 0).toDate(), new DateTime(2015, 06, 24, 22, 0).toDate());
		assertNotNull(locations);
		assertTrue(locations.size() == 2);
		Location l1 = new Location(1L, "12345", "00000000000000000001", "Location 1", "LO1"
				, new Timestamp(FMT.parseDateTime("2015-06-24 20:30:40").getMillis()));
		Location l2 = new Location(2L, "54321", "00000000000000000002", "Location 2", "LO2"
				, new Timestamp(FMT.parseDateTime("2015-06-24 21:30:40").getMillis()));
		assertEquals(l1, locations.get(0));
		assertEquals(l2, locations.get(1));
	}
}
