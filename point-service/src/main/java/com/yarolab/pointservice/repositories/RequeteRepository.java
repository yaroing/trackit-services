package com.yarolab.pointservice.repositories;


import com.yarolab.pointservice.entities.Requete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequeteRepository extends JpaRepository<Requete, Long> {
}
