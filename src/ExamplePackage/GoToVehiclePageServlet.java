package ExamplePackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GoToVehiclePageServlet
 */
@WebServlet("/GoToVehiclePageServlet")
public class GoToVehiclePageServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();	  
	    SelectedRoom room= (SelectedRoom) session.getAttribute("SelectedRoomSession"); 
	   System.out.println(room.getRoomid().toString());
	  String mealtype= (request.getParameter("radio")); 
	  System.out.println(request.getParameter("radio"));
	 int mealprice = UserDAO.getMealPriceAccordingToType(mealtype);
	  if(mealtype!=null){
		  room.setMealprice(mealprice);
		  session.setAttribute("SelectedRoomSession", room);	  
	  }
	  
     response.sendRedirect("Vehicle.jsp");
     
	}
	
}


