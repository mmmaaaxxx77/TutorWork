import static org.junit.Assert.*;
import johnny.tutor.homework.service.LoginService;
import johnny.tutor.homework.service.LoginServiceImpl;

import org.junit.Test;


public class LoginServiceTest {

	private LoginService service = new LoginServiceImpl();
	
	@Test
	public void testLogin(){
		assertTrue(service.login("johnny", "pwd1"));		
	}

}
