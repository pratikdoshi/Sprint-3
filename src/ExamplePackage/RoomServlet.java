package ExamplePackage;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class RoomServlet extends HttpServlet {
	 String roomtype,todate,fromdate;
	    SimpleDateFormat formatter;
	    ArrayList<String> roomids=new ArrayList<String>();
	    ArrayList<String> forsuretodelete=new ArrayList<String>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			RoomBean room = new RoomBean();
		    room.setRoom_type(request.getParameter("roomtype"));
		    SelectedRoom sroom=new SelectedRoom();
		    if(request.getParameter("date-start")!=null){
		    	fromdate=request.getParameter("date-start").toString();
			    sroom.setFromDate(request.getParameter("date-start").toString());
			    System.out.println("hi"+request.getParameter("date-start").toString());
			    }
			    if(request.getParameter("date-end")!=null){
			    todate=request.getParameter("date-end").toString();
			    sroom.setToDate(request.getParameter("date-end").toString());
			    System.out.println("hi"+request.getParameter("date-end").toString());
			    }
			    formatter = new SimpleDateFormat("MM/dd/yyyy"); 
			    Date startDate = (Date)formatter.parse(fromdate); 
			    Date enddate=(Date)formatter.parse(todate);
			    if(enddate.compareTo(startDate)>0){
			    if(request.getParameter("roomtype")!=null){
			  roomtype  =request.getParameter("roomtype");
			    int roomprice=UserDAO.getRoomPriceAccordingToType(roomtype);
			    if(roomprice!=0){
			     sroom.setRoomPrice(roomprice);
			     sroom.setRoomtype(roomtype);
			    }
			
				  
			    }
			    ArrayList<CompareDates> alldatesfromdatabasetocheck = new ArrayList<CompareDates>();
				  alldatesfromdatabasetocheck= RoomDAO.getAllDatesToCheckAvailabitlity(roomtype);
				  
				  for(int i=0;i<alldatesfromdatabasetocheck.size();i++){
					  if(alldatesfromdatabasetocheck.get(i).fromdate.equals(fromdate) && alldatesfromdatabasetocheck.get(i).todate.equals(todate)){
						  RoomDAO.setToNotAvailable(alldatesfromdatabasetocheck.get(i).roomID.toString()); 	
						  forsuretodelete.add(alldatesfromdatabasetocheck.get(i).roomID.toString());
					  }
					  else if((startDate .compareTo(formatter.parse(alldatesfromdatabasetocheck.get(i).fromdate))>0 && enddate .compareTo(formatter.parse(alldatesfromdatabasetocheck.get(i).todate))<0) || ((startDate .compareTo(formatter.parse(alldatesfromdatabasetocheck.get(i).fromdate))<0 && enddate .compareTo(formatter.parse(alldatesfromdatabasetocheck.get(i).todate))>0)))
	                   { 
						      RoomDAO.setToNotAvailable(alldatesfromdatabasetocheck.get(i).roomID.toString()); 
							  roomids.add(alldatesfromdatabasetocheck.get(i).roomID.toString());
						  }  
				
							 else{
								if(forsuretodelete.contains(alldatesfromdatabasetocheck.get(i).roomID.toString())){
									RoomDAO.setToNotAvailable(alldatesfromdatabasetocheck.get(i).roomID.toString()); 
								}
								else if(roomids.contains(alldatesfromdatabasetocheck.get(i).roomID.toString())){
									RoomDAO.setToNotAvailable(alldatesfromdatabasetocheck.get(i).roomID.toString()); 
								}
								else{
							      RoomDAO.updateAvailabitlity(alldatesfromdatabasetocheck.get(i).roomID.toString());
								}
							 }
						 
				  }
			    
			   // RoomDAO.setAvailable(request.getParameter("date-start"),request.getParameter("date-end"));
			    
			    
			    HttpSession session = request.getSession(true);	    
		        session.setAttribute("SelectedRoomSession",sroom); 
		    System.out.println("type="+request.getParameter("roomtype"));
			ArrayList<RoomBean> available = RoomDAO.checkAvailable(room);
			request.setAttribute("list", available);
			RequestDispatcher rd=request.getRequestDispatcher("DisplayRoom.jsp");
			//System.out.println(rd);
			rd.forward(request, response);
			forsuretodelete.clear();
			roomids.clear();
			    }
			    else{
			    	 request.setAttribute("errorMessage", "     To Date cannot be earlier than the From Date");
	                    RequestDispatcher rd = request.getRequestDispatcher("UserLogged.jsp");
	                    rd.forward(request, response);        
			    }
			
		}
		catch(Throwable e){
			System.out.println(e);
		}
	}

	

}
