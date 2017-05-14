package com.shashankv.stock.bo;

import com.shashankv.stock.model.Stock;

/**
 * Created by shashank on 14/5/17.
 */
public interface StockBo {
    void save(Stock stock);

    void update(Stock stock);

    void delete(Stock stock);

    Stock findByStockCode(String stockCode);
}
