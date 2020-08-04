package com.jykj.plugin_demo;

import com.jykj.plugin_demo.entity.MobileCustomer;
import com.jykj.plugin_demo.service.impl.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PluginDemoApplicationTests {

    @Autowired
    private CustomerService customerService;

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

}
