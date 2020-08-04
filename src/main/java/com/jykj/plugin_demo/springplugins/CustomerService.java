package com.jykj.plugin_demo.springplugins;

import com.jykj.plugin_demo.entity.MobileCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.plugin.core.PluginRegistry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cs")
public class CustomerService {

    @Autowired
    private PluginRegistry<MobileIncrementBusiness, MobileCustomer> registry;

    public void increments(MobileCustomer customer, int money) {
        List<MobileIncrementBusiness> plugins = registry.getPlugins();
        plugins.forEach(plugin -> plugin.increment(customer, money));
    }
}
