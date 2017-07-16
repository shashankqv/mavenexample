package com.shashankv.stock.bo.impl;

import com.shashankv.stock.bo.StockBo;
import com.shashankv.stock.dao.StockDao;
import com.shashankv.stock.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by shashank on 14/5/17.
 */
@Component
public class StockBoImpl implements StockBo {

    @Autowired
    private  StockDao stockDao;

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    @Override
    public void save(Stock stock) {
        stockDao.save(stock);
    }

    @Override
    public void update(Stock stock) {
        stockDao.update(stock);
    }

    @Override
    public void delete(Stock stock) {
        stockDao.update(stock);
    }

    @Override
    public Stock findByStockCode(String stockCode) {
        return stockDao.findByStockCode(stockCode);
    }
}
