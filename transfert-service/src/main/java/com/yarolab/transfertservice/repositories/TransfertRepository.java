package com.yarolab.transfertservice.repositories;

import com.yarolab.transfertservice.entities.Transfert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransfertRepository extends JpaRepository<Transfert, Long> {
}
