package com.shashankv.stock.dao;

import com.shashankv.stock.model.Stock;
import org.springframework.stereotype.Repository;

/**
 * Created by shashank on 14/5/17.
 */
@Repository
public interface StockDao {
    void save(Stock stock);

    void update(Stock stock);

    Stock findByStockCode(String stockCode);
}
