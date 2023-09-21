package com.example.finnhub.demofinnhub.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "finnhub_stock_prices")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StockPrice implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime datetime;

    @Column(name = "current_price", columnDefinition = "NUMERIC(15,2)")
    private double current_price;
 
    @Column(name = "day_high", columnDefinition = "NUMERIC(15,2)")
    private double day_high;

    @Column(name = "day_low", columnDefinition = "NUMERIC(15,2)")
    private double day_low;

    @Column(name = "day_open", columnDefinition = "NUMERIC(15,2)")
    private double day_open;

    @Column(name = "prev_day_close", columnDefinition = "NUMERIC(15,2)")
    private double prev_day_close;
}
