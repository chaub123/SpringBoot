package com.bootcamp.finnhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bootcamp.finnhub.entity.StockPriceEntity;
import java.util.List;
import com.bootcamp.finnhub.entity.ProfileEntity;


public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Long> {
    List<StockPriceEntity> findAllBySymbol(ProfileEntity symbol);
}
