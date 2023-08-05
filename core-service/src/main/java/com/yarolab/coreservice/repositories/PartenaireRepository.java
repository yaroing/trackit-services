package com.yarolab.coreservice.repositories;

import com.yarolab.coreservice.entities.Partenaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartenaireRepository extends JpaRepository<Partenaire, String> {
}
