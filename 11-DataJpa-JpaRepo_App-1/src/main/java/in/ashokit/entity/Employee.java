package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="emp_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	private Integer empId;
	private String empName;
	private Double empSalary;
	private String empGender;
	private String dept;
	
	@CreationTimestamp //used to tell when the creation of data took place
	@Column(name="date_created", updatable=false)
	private LocalDate dateCreated;
	
	//used to tell the last updated 
	@UpdateTimestamp  
	@Column(name="last_updated",insertable=false)
	private LocalDate lastUpdated;
	
}
