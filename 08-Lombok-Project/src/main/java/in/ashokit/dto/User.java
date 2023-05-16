package in.ashokit.dto;

import lombok.Data;

/*Example of boiler plate code where user we have written all the boiler plate code such as setter and getter
  Constructor where we can see the number of boiler plate code which can be reduced to 10lines rather than
  70 lines
  
  User.java has approximately 70 lines of codes where as person.java has just 7 lines of code 
  
  
  ProjectLombok Example
  
  
  
 
  
 */

public class User {
	
	private Integer Userid;
	private String username;
	private String email;
	private String pwd;
	private String gender;
	private Long phno;
	
	public User(){
		
	}
	
	
	public User(Integer userid, String username, String email, String pwd, String gender, Long phno) {
		super();
		Userid = userid;
		this.username = username;
		this.email = email;
		this.pwd = pwd;
		this.gender = gender;
		this.phno = phno;
	}


	public Integer getUserid() {
		return Userid;
	}
	public void setUserid(Integer userid) {
		Userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	
	@Override
	public String toString() {
		return "User [Userid=" + Userid + ", username=" + username + ", email=" + email + ", pwd=" + pwd + ", gender="
				+ gender + ", phno=" + phno + "]";
	}
	

}
