package com.jykj.plugin_demo.plugins;

import com.jykj.plugin_demo.entity.MobileCustomer;

public interface MobileIncrementBusiness {

    void increment(MobileCustomer customer, int money);
}
