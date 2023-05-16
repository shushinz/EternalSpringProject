package in.ashokit.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	
	private Integer personid;
	private String PersonName;
	private String gender;
	private Long phno;
	private Date dob;
	
	
	
}
