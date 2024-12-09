package com.lp.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
@SpringBootApplication(
		scanBasePackages = {"com.lp.accounts", "com.lp.utils"}
)
*/
@SpringBootApplication

public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
