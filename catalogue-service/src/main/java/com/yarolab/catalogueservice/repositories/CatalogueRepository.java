package com.yarolab.catalogueservice.repositories;

import com.yarolab.catalogueservice.entities.Catalogue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogueRepository extends JpaRepository<Catalogue, String> {
}
