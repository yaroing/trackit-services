package com.yarolab.coreservice.repositories;

import com.yarolab.coreservice.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {
}
