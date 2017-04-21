import java.io.*;
import java.util.*;

    class Booking {

        
        private String Customer;
        private int kennitala;
        private int bookSeats;
        private int tripId;
    
    
 public Booking( String Customer, int kennitala, int bookSeats, int tripId){
	 
	 this.setCustomer(Customer);
	 this.setKennitala(kennitala);
	 this.setBookSeats(bookSeats);
	 this.setTripId(tripId);
	 
	 }
 
   





	public String getCustomer() {
		return Customer;
	}



	public void setCustomer(String customer) {
		Customer = customer;
	}



	public int getKennitala() {
		return kennitala;
	}



	public void setKennitala(int kennitala) {
		this.kennitala = kennitala;
	}



	



	public int getBookSeats() {
		return bookSeats;
	}



	public void setBookSeats(int bookSeats) {
		this.bookSeats = bookSeats;
	}



	public int getTripId() {
		return tripId;
	}



	public void setTripId(int tripId) {
		this.tripId = tripId;
	}
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
 
 