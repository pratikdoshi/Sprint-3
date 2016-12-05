package ExamplePackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateMeal
 */
@WebServlet("/UpdateMeal")
public class UpdateMeal extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mealtype, mealprice;
		try
		{	    
		    
			mealtype  =request.getParameter("mealtype");
			mealprice=request.getParameter("mealprice");
			if(mealtype!=null && mealprice!=null)
			{
		    RoomDAO.updateMeal(mealtype, mealprice);	
		    response.sendRedirect("ManagerHome.jsp");
			}
		 
		}
				
				
		catch (Throwable theException) 	    
		{
		     System.out.println(theException); 
		}
	}

	
}
