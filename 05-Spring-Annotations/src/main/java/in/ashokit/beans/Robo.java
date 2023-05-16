package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robo {
	
	@Autowired
	private CHip cHip;
	
	
	public Robo() {
		
		System.out.println("Robot::construnctour");
	}
	public void doWork(){
		
		String type =cHip.chipType();
		if(type.equals("32-Bit")) {
			System.out.println("Perfromace is low");
		}
	}

}
