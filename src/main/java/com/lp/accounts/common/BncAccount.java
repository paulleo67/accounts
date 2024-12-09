package com.lp.accounts.common;

import org.springframework.stereotype.Component;

@Component
public class BncAccount implements Account1 {
    public BncAccount(){
        System.out.println("Constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getAccount() {
        return "Banque Nationale du Canada Account";
    }
}
