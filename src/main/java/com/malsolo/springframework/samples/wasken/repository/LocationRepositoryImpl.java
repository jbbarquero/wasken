package com.malsolo.springframework.samples.wasken.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class LocationRepositoryImpl implements LocationRepositoryCustom {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Location> doStuffWithTheKey(String theKey) {
		return this.jdbcTemplate.query(
				"select * from location where thekey = ? "
				, (rs, rowNum) -> new Location(
							rs.getLong("id"),
							rs.getString("thekey"),
							rs.getString("name"),
							rs.getString("locationtype"),
							rs.getString("iata")
							)
				, theKey
				);
	}

}
