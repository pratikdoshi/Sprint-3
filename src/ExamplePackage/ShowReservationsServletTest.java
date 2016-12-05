package ExamplePackage;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShowReservationsServletTest {

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
	public final void test() throws ClassNotFoundException, SQLException {
		String string = "vamshi@gmail.com";
		  UserBean user= new UserBean();
		  user.setUserName("vamshi@gmail.com");
		  ArrayList<RoomReserved> roomsbooked=new ArrayList<RoomReserved>();
		roomsbooked = RoomDAO.getRommsBooked(user);
		
		assertNull(roomsbooked);
		
		
	}

}
