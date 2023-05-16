package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


@Repository("Oracledao")
@Primary
public class OracleDbReportDAO implements ReportDao {

	
	
	public void getData() {
		
		System.out.println("Oracle DB ");
		
	}

}
