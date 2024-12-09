package com.lp.accounts.common;

import org.springframework.stereotype.Component;

@Component
public class WsAccount implements Account1 {
    public WsAccount(){
        System.out.println("Constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getAccount() {
        return "WealthSimple Account";
    }
}
