package com.shashankv.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by shashank on 16/7/17.
 */
public abstract class CustomHibernateDaoSupport extends HibernateDaoSupport {
    @Autowired
    public void myMethodName(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }
}