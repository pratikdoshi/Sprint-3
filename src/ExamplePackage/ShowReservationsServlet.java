package ExamplePackage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowReservationsServlet
 */
@WebServlet("/ShowReservationsServlet")
public class ShowReservationsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);	  
	    UserBean user= (UserBean) session.getAttribute("currentSessionUser");
	session = request.getSession(true);	  
		    SelectedRoom room= (SelectedRoom) session.getAttribute("SelectedRoomSession"); 
		    
		    ArrayList<RoomReserved> roomsbooked=new ArrayList<RoomReserved>();
			try {
				roomsbooked = RoomDAO.getRommsBooked(user);
				request.setAttribute("list1", roomsbooked);
				RequestDispatcher rd=request.getRequestDispatcher("ShowAllReservations.jsp");
				rd.forward(request, response);
			   
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
