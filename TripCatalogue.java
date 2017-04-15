package trunk;

import java.util.ArrayList;
import java.util.Iterator;



public class TripCatalogue {
	
	ArrayList<Trip> trips = new ArrayList<Trip>();
	ArrayList<Trip> results = new ArrayList<Trip>();
	
	public TripCatalogue(){
		
		Trip trip1 = new Trip("Golden Circle");
		Trip trip2 = new Trip("Blue Lagoon");
		Trip trip3 = new Trip("Horse riding");
		trips.add(trip1);
		trips.add(trip2);
		trips.add(trip3);
		
		
	}

	
	public ArrayList<Trip> searchForKeyword(String nameOfTrip) {
		Iterator<Trip> iterator = trips.iterator();
		while (iterator.hasNext()) {
			Trip currentTrip = iterator.next();
			
		}

		return trips;


}
}