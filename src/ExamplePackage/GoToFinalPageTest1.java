package ExamplePackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class GoToFinalPageTest1 {
	@Test
	public final void test() {
		UserBean bc=new UserBean();
		bc.setUserName("vamshi@gmail.com");
		SelectedRoom sc= new SelectedRoom();
		sc.setVehicleprice(150);
		sc.setFromDate("12-12-2016");
		sc.setToDate("");
		sc.setMealprice(100);
		sc.setRoomid("");
		sc.setRoomPrice(100);
		boolean s=UserDAO.confirmBooking(bc,sc );
		
		assertEquals(true,s);
		
		
		
	}

}
