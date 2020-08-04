package com.jykj.plugin_demo.springplugins;

import com.jykj.plugin_demo.entity.MobileCustomer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MobileIncrementV1 implements MobileIncrementBusiness {
    @Override
    public void increment(MobileCustomer customer, int money) {
        log.info("给{}充值电话费,充值金额:{}", customer.getTel(), money);
        log.info("充值完成.");
    }

    @Override
    public boolean supports(MobileCustomer customer) {
        return true;
    }
}
