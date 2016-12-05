package ExamplePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginnServletTest1 {

	@Test
	public final void test() {
		UserBean uc= new UserBean();
		uc.setUserName("vamshi@gmail.com");
		uc.setPassword("12345");
		UserDAO.login(uc);
		assertEquals(true,uc.isValid());
		
	}

}
