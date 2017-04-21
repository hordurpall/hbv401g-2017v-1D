import java.util.ArrayList;


public class BookingManager {
	public ArrayList<Booking> bookings;

	public BookingManager(){
	bookings = new ArrayList<Booking>();
	Booking booking1 = new Booking ("Hörður Páll Guðmundsson", 1612902469, 5, 1 );
	bookings.add(booking1);
	}

	
	  public ArrayList<Booking> getCustomer(String customer) {
	        ArrayList<Booking> results = new ArrayList<Booking>();

	        for( int i = 0; i < bookings.size(); i++ ) {
	            
	                results.add(bookings.get(i));
	        }
	        return results;
	       
	    }
	    
	    public ArrayList<Booking> getKennitala(String kennitala) {
	        ArrayList<Booking> results = new ArrayList<Booking>();

	        for( int i = 0; i < bookings.size(); i++ ) {
	            
	                results.add(bookings.get(i));
	        }
	        return results;
	       
	    }
	    
	    public ArrayList<Booking> getBookSeats(int bookseats) {
	        ArrayList<Booking> results = new ArrayList<Booking>();

	        for( int i = 0; i < bookings.size(); i++ ) {
	            
	                results.add(bookings.get(i));
	        }
	        return results;
	       
	    }
	    
	    public ArrayList<Booking> getTripId(int tripId) {
	        ArrayList<Booking> results = new ArrayList<Booking>();

	        for( int i = 0; i < bookings.size(); i++ ) {
	            
	                results.add(bookings.get(i));
	        }
	        return results;
	       
	    }
	   
	
}
