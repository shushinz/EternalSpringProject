package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class ReportService {
	
	
	@Qualifier("mysqldao")
	private ReportDao Dao;
	
	
	@Autowired
	public ReportService(ReportDao dao) {
		System.out.println("ReportService Construcotur");
		this.Dao=dao;
	}
	
	@Autowired
	public void  setDao(ReportDao dao) {
		System.out.println("setter method called...!"); 
		this.Dao =dao;
	}
	
	public void generateReport(){
		
		Dao.getData();
		System.out.println("Report Generated");
		
	}
	

}
