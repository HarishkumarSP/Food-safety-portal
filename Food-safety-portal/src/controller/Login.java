package controller;

public class Login {
	static String name= "Admin";
	static String pswd="admin123";
	
	static void admin(String name,String password)

	{
		if(name.equals(name)&&pswd.equals(password))
			System.out.println("login success");
		else
			System.out.println("loginfailed");
	}
	
	
}
