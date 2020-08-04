package com.jykj.plugin_demo.service.impl;

import com.jykj.plugin_demo.entity.MobileCustomer;
import com.jykj.plugin_demo.plugins.MobileIncrementBusiness;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CustomerService implements ApplicationContextAware {

    private Map<String, MobileIncrementBusiness> business;

    public void increments(MobileCustomer customer, int money) {
        business.forEach((key, value) -> {
            value.increment(customer, money);
        });
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.business = applicationContext.getBeansOfType(MobileIncrementBusiness.class);
    }
}
