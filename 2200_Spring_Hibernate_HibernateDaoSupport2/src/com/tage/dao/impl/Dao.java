package com.tage.dao.impl;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by tage on 3/31/16.
 */
@Component
public class Dao extends HibernateDaoSupport {

    @Resource(name = "hibernateTemplate")
    public void setSuperHibernateTemplate(HibernateTemplate hibernateTemplate) {
        super.setHibernateTemplate(hibernateTemplate);
    }
}
