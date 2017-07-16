package com.shashankv.stock.dao.Impl;

import com.shashankv.stock.dao.StockDao;
import com.shashankv.stock.model.Stock;
import com.shashankv.util.CustomHibernateDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by shashank on 14/5/17.
 */
@Component("stockDaoServiceImpl")
@Transactional
public class StockDaoImpl extends CustomHibernateDaoSupport implements StockDao {

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
