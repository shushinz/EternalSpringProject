package in.ashokit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "in.ashokit","com.tcs.dao"})
public class AppConfig {
	
	public AppConfig() {
		
		System.out.println("AppConfig::Constructour");
	}
	
	@Bean
	public Engine getEngine() {
		
		Engine eng =new Engine();
		return eng;
		
		
	}

}
