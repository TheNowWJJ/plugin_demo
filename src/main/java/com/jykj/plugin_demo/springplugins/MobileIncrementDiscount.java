package com.jykj.plugin_demo.springplugins;

import com.jykj.plugin_demo.entity.MobileCustomer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MobileIncrementDiscount implements MobileIncrementBusiness {
    @Override
    public void increment(MobileCustomer customer, int money) {
        if (supports(customer)) {
            log.info("老用户折扣");
            if (money > 100) {
                log.info("当前充值金额大于100元,优惠{}元", money * 0.1);
            } else {
                log.info("当前充值金额小于100元,没有优惠.");
            }
            log.info("折扣完成.");
        }
    }

    @Override
    public boolean supports(MobileCustomer customer) {
        return customer.isOld();
    }
}
