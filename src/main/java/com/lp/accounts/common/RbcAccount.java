package com.lp.accounts.common;

import org.springframework.stereotype.Component;

@Component
public class RbcAccount implements Account1 {
    public RbcAccount(){
        System.out.println("Constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getAccount() {
        return "RBC Account";
    }
}
