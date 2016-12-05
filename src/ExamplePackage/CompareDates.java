package ExamplePackage;

public class CompareDates {
String todate,fromdate,roomID;

public CompareDates(String todate, String fromdate, String roomID) {
	super();
	this.todate = todate;
	this.fromdate = fromdate;
	this.roomID=roomID;
}
public CompareDates(){
	
}


public String getRoomID() {
	return roomID;
}
public void setRoomID(String roomID) {
	this.roomID = roomID;
}
public String getTodate() {
	return todate;
}

public void setTodate(String todate) {
	this.todate = todate;
}

public String getFromdate() {
	return fromdate;
}

public void setFromdate(String fromdate) {
	this.fromdate = fromdate;
}


}
