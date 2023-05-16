package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class CHip {
	
	
	
	public  CHip() {
		 System.out.println("CHip::construcuor");
	}
	public String chipType() {
		
		return  "32-bit";
		
		
	}

}
