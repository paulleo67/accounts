package com.lp.accounts.common;

import org.springframework.stereotype.Component;

@Component
public class BmoAccount implements Account1 {

    public BmoAccount(){
        System.out.println("Constructor : " + getClass().getSimpleName());
    }
    @Override

    public String getAccount() {
        return "BMO Account";
    }

 }
