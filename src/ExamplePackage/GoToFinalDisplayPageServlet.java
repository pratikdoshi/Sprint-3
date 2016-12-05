package ExamplePackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GoToFinalDisplayPageServlet
 */
@WebServlet("/GoToFinalDisplayPageServlet")
public class GoToFinalDisplayPageServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);	  
	    UserBean user= (UserBean) session.getAttribute("currentSessionUser");

	session = request.getSession(true);	  
		    SelectedRoom room= (SelectedRoom) session.getAttribute("SelectedRoomSession"); 
		
		   System.out.println(room.getRoomid().toString());
		  String vehicletype= (request.getParameter("radio")); 
		  System.out.println(request.getParameter("radio"));
		  int vehicleprice = UserDAO.getVehiclePriceAccordingToType(vehicletype);
		  if(vehicletype!=null){
			  room.setVehicleprice(vehicleprice);
			  session.setAttribute("SelectedRoomSession", room);
		  }
		
	      Boolean dec=UserDAO.confirmBooking(user,room);
	      if(dec==true){
	     response.sendRedirect("FinalDisplayInformation.jsp");
	      }
	      else{
	    	  
	      }
	     
		}
		
	
	}


