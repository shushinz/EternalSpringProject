package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Account;
import in.ashokit.entity.AccountPk;
import in.ashokit.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctxt=SpringApplication.run(Application.class, args);
		@SuppressWarnings("unused")
		AccountRepo bean=ctxt.getBean(AccountRepo.class);
		
		/*
		AccountPk pk= new AccountPk();
		pk.setAccNum((long) 545454);
		pk.setAccType("saving");
		
		Account acc= new Account();
		acc.setAccountpk(pk);
		acc.setBranch("abas");  
		acc.setHolderName("chan");
		
		bean.save(acc);
		System.out.println("record saved");
	*/
		
		
		
	}

}
