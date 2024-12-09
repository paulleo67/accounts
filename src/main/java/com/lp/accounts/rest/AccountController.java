package com.lp.accounts.rest;

import com.lp.accounts.common.Account1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private Account1 myAccount;
   // private Account anotherAccount;

    @Autowired
    public AccountController(
            @Qualifier("foreign") Account1 thisAccount
   //         ,
   //         @Qualifier("scotiaAccount") Account thisAnotherAccount
            ){
    //public void setMyAccount(Account thisAccount){
        System.out.println(" In constructor: " + getClass().getSimpleName());
        myAccount=thisAccount;
//        anotherAccount=thisAnotherAccount;
    }

    @GetMapping("/account")
    public String provideAccount(){
        return myAccount.getAccount();
    }

    /*@GetMapping("/check")
    public String checkScope(){
        return "Compare myAccount == anotherAccount, " + (myAccount == anotherAccount);
    }
*/
}
