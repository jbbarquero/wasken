package com.malsolo.springframework.samples.wasken.repository;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {

	@Id
	private Long id;

	@NotNull
	@Size(min = 5, max = 5)
	private String theKey;
	
	@NotNull
	@Size(min = 1, max = 120)
	private String name;
	
	@NotNull
	@Size(min = 10, max = 10)
	private String locationType;
	
	@NotNull
	@Size(min = 2, max = 3)
	private String iata;
	
	@NotNull
	private Timestamp creationdate;
}
