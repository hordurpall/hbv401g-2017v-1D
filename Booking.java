package trunk;
import java.io.*;
import java.util.*;

    class Booking {

        private Trip trip;
        private String Customer;
        private int kennitala;
        private int paymentValue;
        private int bookSeats;
    
    
 public Booking(Trip trip, String Customer, int kennitala, int paymentValue, int bookSeats){
	 this.setTrip(trip);
	 this.setCustomer(Customer);
	 this.setKennitala(kennitala);
	 this.setPaymentValue(paymentValue);
	 this.setBookSeats(bookSeats);
	 }
 
   

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
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



	public int getPaymentValue() {
		return paymentValue;
	}



	public void setPaymentValue(int paymentValue) {
		this.paymentValue = paymentValue;
	}



	public int getBookSeats() {
		return bookSeats;
	}



	public void setBookSeats(int bookSeats) {
		this.bookSeats = bookSeats;
	}
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
 
 