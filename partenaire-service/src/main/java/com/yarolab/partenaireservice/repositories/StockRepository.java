package com.yarolab.partenaireservice.repositories;

import com.yarolab.partenaireservice.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
