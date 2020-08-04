package com.jykj.plugin_demo.springplugins;

import com.jykj.plugin_demo.entity.MobileCustomer;
import org.springframework.plugin.core.Plugin;

public interface MobileIncrementBusiness extends Plugin<MobileCustomer> {
    void increment(MobileCustomer customer, int money);
}
