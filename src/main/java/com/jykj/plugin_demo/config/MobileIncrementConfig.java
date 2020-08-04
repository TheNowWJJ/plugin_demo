package com.jykj.plugin_demo.config;

import com.jykj.plugin_demo.plugins.MobileIncrementBusiness;
import com.jykj.plugin_demo.plugins.MobileIncrementV1;
import com.jykj.plugin_demo.plugins.MobileIncrementV2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobileIncrementConfig {

    @Bean
    public MobileIncrementBusiness mobileIncrementV1() {
        return new MobileIncrementV1();
    }

    @Bean
    public MobileIncrementBusiness mobileIncrementV2() {
        return new MobileIncrementV2();
    }
}
