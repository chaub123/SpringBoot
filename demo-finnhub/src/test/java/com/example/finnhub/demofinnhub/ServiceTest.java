package com.example.finnhub.demofinnhub;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.example.finnhub.demofinnhub.entity.Stocks;
import com.example.finnhub.demofinnhub.repository.StockRepository;
import com.example.finnhub.demofinnhub.service.StockService;

@SpringBootTest
public class ServiceTest {
    
    @MockBean
    private StockRepository stockRepository;

    @Autowired
    private StockService stockService;

    @Test
    void testFindAll(){
        Stocks stock1 = Stocks.builder().id(1L).country("HK").build();
        Stocks stock2 = Stocks.builder().id(2L).country("HK").build();
    }
}
