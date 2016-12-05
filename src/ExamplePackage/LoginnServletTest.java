package ExamplePackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginnServletTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void test() {
		UserBean uc= new UserBean();
		uc.setUserName("vamsddddddhi@gmail.com");
		uc.setPassword("12345");
		UserDAO.login(uc);
		assertEquals(true,uc.isValid());
		
		
		
		
	}

}
