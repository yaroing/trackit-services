package com.yarolab.pointservice.repositories;

import com.yarolab.pointservice.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
