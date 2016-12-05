package ExamplePackage;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RoomDAO {
	static Statement ps = null;
	static Connection db = null;
	static ResultSet rs =null;
	static ArrayList<RoomBean> list=new ArrayList<RoomBean>();
	static ArrayList<RoomReserved> reservedlist=new ArrayList<RoomReserved>();
	public static ArrayList<RoomBean> checkAvailable(RoomBean rb) throws ClassNotFoundException, SQLException
	{
		String roomtype=rb.getRoom_type();
		db = ConnectionManager.getConnection();
		ps = db.createStatement();
		String stm = "select * from room where isAvailable=1 and room_type= '"+roomtype+"'"; 
		rs= ps.executeQuery(stm);
		//return rs;
		 while(rs.next())
          {
			int room_ID=rs.getInt(1);
          	String type=rs.getString(2);
      		double price=rs.getDouble(4);
      		String features=rs.getString(3);
      		
              RoomBean t=new RoomBean();
              t.setRoom_type(type);
              t.setRfeatures(features);
              t.setRprice(price);
              t.setRoom_id(room_ID);
              
              list.add(t);
          }
		 return list;
          
      } 
     
	
	public static void  setAvailable(String todate, String fromdatie) throws ClassNotFoundException, SQLException
	{
		DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		try {
			Date startDate = (Date)formatter.parse(fromdatie);
			Date enddate= (Date)formatter.parse(todate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		db = ConnectionManager.getConnection();
		ps = db.createStatement();
		String stm = "select * from payment where "; 
		rs= ps.executeQuery(stm);
	}
		
     
	
	public static ArrayList<RoomReserved> getRommsBooked(UserBean user) throws ClassNotFoundException, SQLException
	{
		String username=user.getUsername();
		db = ConnectionManager.getConnection();
		ps = db.createStatement();
		String stm = "select * from payments where username  = '"+username+"'"; 
		rs= ps.executeQuery(stm);
		if (!rs.next())
		{
			return null;
		}
		else{
		 while(rs.next())
          {
			
          	String roomid=rs.getString(1);
          	String todate= rs.getString(4);
      		String fromdate=rs.getString(5);
      		int roomprice=rs.getInt(3);
      		int mealprice=rs.getInt(6);
      		int vehicleprice=rs.getInt(7);
      		int totalprice=rs.getInt(8);
      		
              RoomReserved t=new RoomReserved();
              t.setRoomid(roomid);
              t.setTodate(todate);
              t.setFromdate(fromdate);
              t.setRoomprice(roomprice);
              t.setMealprice(mealprice);
              t.setVehicleprice(vehicleprice);
              t.setTotalprice(totalprice);
              
              reservedlist.add(t);
              
          }
		 return reservedlist;
		}
} 
	public static ArrayList<CompareDates> getAllDatesToCheckAvailabitlity(String roomtype) throws ClassNotFoundException, SQLException
	{
		ArrayList<CompareDates> cdlist=new ArrayList<CompareDates>();
		db = ConnectionManager.getConnection();
		ps = db.createStatement();
		String stm = "select to_date, from_date,room_id from payments where roomtype='"+roomtype+"'"; 
		rs= ps.executeQuery(stm);
		 while(rs.next())
          {
			String todate=rs.getString(1);
          	String fromdate=rs.getString(2);
          	String roomID=rs.getString(3);
      		
      		
              CompareDates cd=new CompareDates();
              cd.setFromdate(fromdate);
              cd.setTodate(todate);
              cd.setRoomID(roomID);
            
              cdlist.add(cd);
          }
		 return cdlist;
          
      } 
	public static void  updateAvailabitlity(String roomid) throws ClassNotFoundException, SQLException
	{
	
		db = ConnectionManager.getConnection();
		ps = db.createStatement();
		String stm = "update room set isavailable='1' where room_id='"+roomid+"'"; 
		ps.executeUpdate(stm);
	} 
	public static void  updateMeal(String mealtype, String mealprice) throws ClassNotFoundException, SQLException
	{
	
		db = ConnectionManager.getConnection();
		ps = db.createStatement();
		String stm = "update meal set mprice ='"+mealprice+"' where  mfeatures='"+mealtype+"'"; 
		ps.executeUpdate(stm);
	} 
	public static void  setToNotAvailable(String roomid) throws ClassNotFoundException, SQLException
	{
	
		db = ConnectionManager.getConnection();
		ps = db.createStatement();
		String stm = "update room set isavailable='0' where room_id='"+roomid+"'"; 
		ps.executeUpdate(stm);
	}


	public static boolean addNewRoom(String roomfeature, String roomid, String roomprice) {
		boolean s=false;
		  try 
		   {
			  db = ConnectionManager.getConnection();
				ps = db.createStatement();
		        String ins = "INSERT into room (room_id,room_type,rfeatures,rprice,isavailable)  VALUES ('"+roomid+"', '"+roomfeature+"', '"+roomfeature+"', '"+roomprice+"', '1')";
		        ps.executeUpdate(ins);
		        s = true;
		     
			      
		   } 

		   catch (Exception ex) 
		   {
		      System.out.println("Log In failed: An Exception has occurred! " + ex);
		   } 
			    

		return s;
			
		   }	
	}