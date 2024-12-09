package com.lp.accounts.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DesjardinsAccount implements Account1 {
    public DesjardinsAccount(){
        System.out.println("Constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getAccount() {
        return "Desjardins Account";
    }
}
