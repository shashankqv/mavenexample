package com.shashankv.stock.dao;

import com.shashankv.stock.model.Stock;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by shashank on 14/5/17.
 */
@Component("testAutowire")
public interface StockDao {
    void save(Stock stock);

    void update(Stock stock);

    Stock findByStockCode(String stockCode);
}