package in.ashokit.beans;

import org.springframework.stereotype.Repository;

@Repository
public class MySQLDBReport implements ReportDao{

	
	public void getData() {
		
		System.out.println("My SQL report generator");
		
	}

}
