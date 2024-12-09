package com.lp.accounts.common;

import org.springframework.stereotype.Component;

@Component
public class CibcAccount implements Account1 {
    public CibcAccount(){
        System.out.println("Constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getAccount() {
        return "CIBC Account";
    }
}
