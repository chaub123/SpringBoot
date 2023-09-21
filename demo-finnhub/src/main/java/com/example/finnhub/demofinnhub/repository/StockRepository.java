package com.example.finnhub.demofinnhub.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.finnhub.demofinnhub.entity.Stocks;

@Repository
public interface StockRepository extends JpaRepository<Stocks, Long> {
    List<Stocks> findByCompanyName(String companyName); 
}
