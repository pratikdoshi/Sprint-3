package ExamplePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class GoToFinalDisplayPageServletTest {

	@Test
	public final void test() {
		UserBean bc=new UserBean();
		bc.setUserName("vamshi@gmail.com");
		SelectedRoom sc= new SelectedRoom();
		sc.setVehicleprice(150);
		sc.setFromDate("12-12-2016");
		sc.setToDate("12-20-2016");
		sc.setMealprice(100);
		sc.setRoomid("1004");
		sc.setRoomPrice(100);
		boolean s=UserDAO.confirmBooking(bc,sc );
		
		assertEquals(true,s);
		
		
		fail("Not yet implemented");
	}

}
