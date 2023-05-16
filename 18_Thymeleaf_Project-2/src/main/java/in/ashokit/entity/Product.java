package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	@GeneratedValue
	private Integer pid;
	
	
	@NotBlank(message="Name is mandatory")
	@Size(min=3, max=15 , message="name shld be min of 3 char  and max of 15")
	private String name;
	
	
	@NotNull
	private Double price;
	
	@NotNull(message="qunatity is manadatory")
	private Integer qty;

}
