package com.lp.accounts.common;

import org.springframework.stereotype.Component;

@Component
public class LabaieAccount implements Account1 {
    public LabaieAccount(){
        System.out.println("Constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getAccount() {
        return "LaBaie Account";
    }
}
