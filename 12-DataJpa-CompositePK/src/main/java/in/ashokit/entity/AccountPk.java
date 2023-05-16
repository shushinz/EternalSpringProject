package in.ashokit.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Embeddable
public class AccountPk implements Serializable {

	private Long accNum;
	
	private String accType;

	
	
}
