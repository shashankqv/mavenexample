package com.shashankv.stock.dao.Impl;

import com.shashankv.stock.dao.StockDao;
import com.shashankv.stock.model.Stock;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by shashank on 14/5/17.
 */
public class StockDaoImpl extends HibernateDaoSupport implements StockDao {

    @Override
    public void save(Stock stock) {
        getHibernateTemplate().save(stock);
    }

    @Override
    public void update(Stock stock) {
        getHibernateTemplate().update(stock);
    }

    @Override
    public Stock findByStockCode(String stockCode) {
        List list = getHibernateTemplate().find("from Stock where stockCode =  ?", stockCode);
        return (Stock) list.get(0);
    }
}
