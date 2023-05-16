package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.AppConfig;
import in.ashokit.beans.ReportService;

public class Test {
	
	@SuppressWarnings("resource")
	public static void main(String args[]) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	
		ReportService service= ctx.getBean (ReportService.class);
			
		service.generateReport();
	}
}
