package com.malsolo.springframework.samples.wasken.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long>, LocationRepositoryCustom {
}
