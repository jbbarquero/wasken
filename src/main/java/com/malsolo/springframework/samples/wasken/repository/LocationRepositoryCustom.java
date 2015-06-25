package com.malsolo.springframework.samples.wasken.repository;

import java.util.Date;
import java.util.List;

public interface LocationRepositoryCustom {
	
	List<Location> doStuffWithTheKey(String theKey);
	
	List<Location> doStuffWithDates(Date from, Date to);
	

}
