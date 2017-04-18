package trunk;

import java.util.ArrayList;

public class BookingManager {
	
	ArrayList<Booking> bookings = new ArrayList<Booking>();
	ArrayList<Booking> results = new ArrayList<Booking>();
	
	public bookTrip(){
		Booking booking1 = new Booking();
		bookings.add(booking1);
	}
	public String sendEmail(){
		return null;
	}
}
