package com.lp.accounts.common;

import org.springframework.stereotype.Component;

@Component
public class QuestradeAccount implements Account1 {
    public QuestradeAccount(){
        System.out.println("Constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getAccount() {
        return "Questrade Account";
    }
}
