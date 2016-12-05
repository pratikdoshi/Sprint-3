package ExamplePackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddRoomServlet")
public class AddRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String roomid, roomfeature,roomprice;
		try
		{	    
		    
			roomfeature  =request.getParameter("roomtype");
			roomid=request.getParameter("roomid");
			roomprice=request.getParameter("roomprice");
		    boolean s= RoomDAO.addNewRoom(roomfeature,roomid,roomprice);			   		    
		     if (s==true)
		     {
			        
		          response.sendRedirect("ManagerHome.jsp"); //logged-in page      		
		     }
			        
		     else 
		     {
		          response.sendRedirect("AddRoom.jsp"); //error page 
		      } 
		}
				
				
		catch (Throwable theException) 	    
		{
		     System.out.println(theException); 
		}
	}

	


}
