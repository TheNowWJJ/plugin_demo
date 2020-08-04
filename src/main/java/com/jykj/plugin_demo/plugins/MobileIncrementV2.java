package com.jykj.plugin_demo.plugins;

import com.jykj.plugin_demo.entity.MobileCustomer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MobileIncrementV2 implements MobileIncrementBusiness {
    @Override
    public void increment(MobileCustomer customer, int money) {
        if (customer.isOld() && money > 100) {
            log.info("当老用户充值金额大于100时,赠送{}元", money * 0.1);
        }
    }
}
