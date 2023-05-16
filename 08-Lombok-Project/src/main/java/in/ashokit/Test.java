package in.ashokit;

import in.ashokit.dto.Person;

/* This is project to show the practical use of ProjectLambok it is used to reduce the boiler plate code  user
  has setter and getter method present in them but in the person class after we have installed ProjectLambok and added in the 
 dependencies we need not write the setter and getter as we can do it through annotations methods and reduce the boiler plate code 
   present in them */

public class Test {
	public static void main(String args[]) {
		
		Person p =new Person();
		p.setPersonid(101);
		System.out.println(p);
	}
	
	

}
