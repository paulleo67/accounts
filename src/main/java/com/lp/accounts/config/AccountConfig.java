package com.lp.accounts.config;

import com.lp.accounts.common.Account1;
import com.lp.accounts.common.LclAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountConfig {
    @Bean("foreign")
    public Account1 lclAccount() {
        return new LclAccount();
    }
}
