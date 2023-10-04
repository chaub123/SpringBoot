package com.bootcamp.finnhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bootcamp.finnhub.entity.StockPriceEntity;

public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Long> {
    
}
