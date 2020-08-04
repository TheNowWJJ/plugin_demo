package com.jykj.plugin_demo.config;

import com.jykj.plugin_demo.plugins.MobileIncrementBusiness;
import com.jykj.plugin_demo.plugins.MobileIncrementV1;
import com.jykj.plugin_demo.plugins.MobileIncrementV2;
import com.jykj.plugin_demo.springplugins.MobileIncrementDiscount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.plugin.core.config.EnablePluginRegistries;

@Configuration
@EnablePluginRegistries(com.jykj.plugin_demo.springplugins.MobileIncrementBusiness.class)
public class MobileIncrementConfig {

    @Bean
    public MobileIncrementBusiness mobileIncrementV1() {
        return new MobileIncrementV1();
    }

    @Bean
    public MobileIncrementBusiness mobileIncrementV2() {
        return new MobileIncrementV2();
    }

    @Bean
    public com.jykj.plugin_demo.springplugins.MobileIncrementV1 mobileIncrementV11() {
        return new com.jykj.plugin_demo.springplugins.MobileIncrementV1();
    }

    @Bean
    public com.jykj.plugin_demo.springplugins.MobileIncrementDiscount mobileIncrementDiscount() {
        return new MobileIncrementDiscount();
    }
}
