package com.hkjava.demo.demofinnhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.hkjava.demo.demofinnhub.entity.Stock;
import java.time.LocalDate;
import java.util.List;


@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

  // select * from table where company_name = "";
  List<Stock> findByCompanyName(String companyName); 
  // Update stocks set field = x where field =??
  // Solution: (Put/Patch) findById() -> set() -> save()

  @Query("Select s.* from stocks s where s.id = :id")
  List<Stock> findAllById2(Long id);
}
