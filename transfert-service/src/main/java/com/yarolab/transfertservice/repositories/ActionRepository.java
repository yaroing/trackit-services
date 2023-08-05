package com.yarolab.transfertservice.repositories;

import com.yarolab.transfertservice.entities.Action;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRepository extends JpaRepository<Action, Long> {
}
