package in.ashokit;

public class UserDao {
	
	public void init() {
		
		System.out.println("Getting db conection");
	}
	
	public void getData() {
		
		System.out.println("Getting data form db");
	}
	
	public void destroy() {
		
		System.out.println("closing db connection");
	}
}
