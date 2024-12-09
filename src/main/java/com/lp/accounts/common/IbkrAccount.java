package com.lp.accounts.common;

import org.springframework.stereotype.Component;

@Component
public class IbkrAccount implements Account1 {
    public IbkrAccount(){
        System.out.println("Constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getAccount() {
        return "Ibkr Account" ;
    }
}

