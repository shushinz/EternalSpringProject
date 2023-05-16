package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		EmployeeRepository repo=ctxt.getBean(EmployeeRepository.class);
		
		Employee emp=new  Employee();
		
		emp.setEmpGender("F-M");
		emp.setDept("HR");
		emp.setEmpName("chan");
		emp.setEmpSalary(105.00);
		 
		repo.save(emp);
		
		
		
		
		
		
		
		
		
		
		
		/*
		Sort as=Sort.by("empName").ascending();
		Sort ff=Sort.by("empName","empSalary").descending();
		List<Employee> fff=repo.findAll(ff);
		fff.forEach(System.out::println);
		
		List<Employee> emps =repo.findAll(as);
		emps.forEach(System.out::println);
		
		Sort ds=Sort.by("empName").descending();
		List<Employee> dsf =repo.findAll(ds);
		dsf.forEach(System.out::println);
		
		int pageNo=1;
		
		*/
		
		
		
		/*
		 Employee e1 = new Employee(1, "john",5000.00,"male","sales");
		 Employee e2 = new Employee(2, "jds",5000.00,"male","sales");
		 Employee e3 = new Employee(3, "osdn",5000.00,"male","sales");
		 Employee e4 = new Employee(4, "dsfn",5000.00,"male","sales");
		 Employee e5 = new Employee(5, "grn",5000.00,"male","sales");
		 Employee e6 = new Employee(6, "tthn",5000.00,"male","sales");
		 repo.saveAll(Arrays.asList(e2,e3,e4,e5,e6));
		 System.out.println("record saved");
		*/
	}

}

