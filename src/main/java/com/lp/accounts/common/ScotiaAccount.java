package com.lp.accounts.common;

import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ScotiaAccount implements Account1 {
    public ScotiaAccount(){
        System.out.println("Constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getAccount() {
        return "Scotia Account";
    }
   /* @PostConstruct
    public void doMyStartup(){
        System.out.println("In Post Construction");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("In Pre Destroy");
    }
*/
}
