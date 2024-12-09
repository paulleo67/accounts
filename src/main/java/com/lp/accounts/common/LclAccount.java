package com.lp.accounts.common;

//@Component
//@Lazy
public class LclAccount implements Account1 {

    public LclAccount(){
        System.out.println("Constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getAccount() {
        return "LCL Account";
    }
}
