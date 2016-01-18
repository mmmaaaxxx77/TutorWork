package johnny.tutor.homework;

import johnny.tutor.homework.service.LoginService;
import johnny.tutor.homework.service.LoginServiceImpl;

public class Main {

	public static void main(String[] args) {
		LoginService service = new LoginServiceImpl(); 
		System.out.println(service.login("johnny", "pwd1"));
	}

}
