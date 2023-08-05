package com.yarolab.partenaireservice.repositories;

import com.yarolab.partenaireservice.entities.Requete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequeteRepository extends JpaRepository<Requete, Long> {
}
