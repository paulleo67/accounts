package com.lp.accounts.common;

import org.springframework.stereotype.Component;

@Component
public class MnbcAccount implements Account1 {
    public MnbcAccount(){
        System.out.println("Constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getAccount() {
        return "MNBC Account";
    }
}
