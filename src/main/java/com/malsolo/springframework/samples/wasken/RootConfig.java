package com.malsolo.springframework.samples.wasken;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.malsolo.springframework.samples.wasken.domain.Location;
import com.malsolo.springframework.samples.wasken.repository.DataConfig;
import com.malsolo.springframework.samples.wasken.service.LocationService;

@Configuration
@Import(DataConfig.class)
@ComponentScan(excludeFilters = { @Filter(type = FilterType.ANNOTATION, value = Controller.class), @Filter(type = FilterType.ANNOTATION, value = RestController.class) })
public class RootConfig {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		
		LocationService locationService = context.getBean(LocationService.class);
		
		List<Location> locations = locationService.findLocations();
		
		locations.stream().forEach(System.out::println);
		
		context.close();
	}

}
