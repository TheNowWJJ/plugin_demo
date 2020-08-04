package com.jykj.plugin_demo;

import com.jykj.plugin_demo.entity.MobileCustomer;
import com.jykj.plugin_demo.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class PluginDemoApplicationTests {

    @Autowired
    private CustomerService customerService;

    @Resource(name = "cs")
    private com.jykj.plugin_demo.springplugins.CustomerService cs;

//    @Test
//    void contextLoads() {
//    }

    @Test
    void testIncrementV1() {
        MobileCustomer customer = new MobileCustomer();

        customer.setTel("18506348066");
        customer.setOld(false);

        customerService.increments(customer, 120);
    }

    @Test
    void testSpringPlugins() {
        MobileCustomer customer = new MobileCustomer();

        customer.setTel("18506348066");
        customer.setOld(true);

        cs.increments(customer, 120);
    }

}
