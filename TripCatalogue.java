import java.util.ArrayList;
import java.util.Iterator;


public class TripCatalogue {

	public ArrayList<Trip> trips;


	public TripCatalogue(){

		Trip trip1 = new Trip("Golden", 8, 1, 800, 40, 9900, 1, 1, 1, 1, 4950);
		Trip trip2 = new Trip("Bæjarferð á Seyðisfjörð", 6, 4, 800, 40, 11999, 2, 1, 1, 1, 3999);
		Trip trip3 = new Trip("Blue Lagoon", 6, 1, 1300, 40, 10000, 1, 1, 1, 1, 10000);
		Trip trip4 = new Trip("Horse Riding", 3, 1, 1300, 20, 8800, 1, 0, 1, 1, 4400);
		Trip trip5 = new Trip("Ferð á Borgarfjörð Eystri", 8, 4, 800, 20, 15999, 2, 0, 1, 1, 4999);
		Trip trip6 = new Trip("Inside the volcano", 6, 1, 1300, 10, 42000, 1, 0, 2, 0, 0);
		Trip trip7 = new Trip("Rafting Bakkafljót", 6, 3, 1000, 20, 29000, 1, 0, 3, 0, 0);
		Trip trip8 = new Trip("Norðurljósaferð", 2, 1, 2100, 40, 10000, 1, 1, 1, 1, 3990);
		Trip trip9 = new Trip("Snjósleðaferð upp á fjarðarheiði", 10, 4, 800, 10, 24999, 2, 0, 2, 0, 0);
		Trip trip10 = new Trip("Viking Ship Sailing tour", 2, 1, 1000, 25, 12000, 2, 0, 1, 1, 7200);
		Trip trip11 = new Trip("Midnight mountain bath & hike", 5, 1, 2200, 30, 18000, 1, 0, 2, 0,0);
		Trip trip12 = new Trip("Laugarvegurinn", 2, 1, 1000, 20, 5000, 3, 1, 1, 1, 0);
		trips.add(trip1);
		trips.add(trip2);
		trips.add(trip3);
		trips.add(trip4);
		trips.add(trip5);
		trips.add(trip6);
		trips.add(trip7);
		trips.add(trip8);
		trips.add(trip9);
		trips.add(trip10);
		trips.add(trip11);
		trips.add(trip12);

	}




	//keyword


	public ArrayList<Trip> searchForKeyword(String keyword) {
		ArrayList<Trip> results = new ArrayList<Trip>();

		for( int i = 0; i < trips.size(); i++ ) {
			if(keyword.equals(trips.get(i).getNameOfTrip())) {
				results.add(trips.get(i));
			}
		}
		return results;

	}
	//time

	public ArrayList<Trip> selectTime(String time) {
		ArrayList<Trip> results = new ArrayList<Trip>();

		for( int i = 0; i < trips.size(); i++ ) {
			if(time.equals(trips.get(i).getTimeOfTrip())) {
				results.add(trips.get(i));
			}
		}
		return results;

	}
	//price

	public ArrayList<Trip> selectPrice(String upper, String lower) {
		ArrayList<Trip> results = new ArrayList<Trip>();

		for( int i = 0; i < trips.size(); i++ ) {
			if(upper.equals(trips.get(i).getPriceOfTrip()) && lower.equals(trips.get(i).getPriceOfTrip())) {
				results.add(trips.get(i));
			}
		}
		return results;

	}

	//handicapped

	public ArrayList<Trip> selectAccess(String access) {
		ArrayList<Trip> results = new ArrayList<Trip>();

		for( int i = 0; i < trips.size(); i++ ) {
			if(access.equals(trips.get(i).isHandicapped())) {
				results.add(trips.get(i));
			}
		}
		return results;

	}

	//difficulty level

	public ArrayList<Trip> selectDifficultyLevel(String lvl) {
		ArrayList<Trip> results = new ArrayList<Trip>();

		for( int i = 0; i < trips.size(); i++ ) {
			if(lvl.equals(trips.get(i).getDifficultyLevel())) {
				results.add(trips.get(i));
			}
		}
		return results;

	}

	//kids

	public ArrayList<Trip> selectSuitableForKids(String kids) {
		ArrayList<Trip> results = new ArrayList<Trip>();

		for( int i = 0; i < trips.size(); i++ ) {
			if(kids.equals(trips.get(i).isSuitableForKids())) {
				results.add(trips.get(i));
			}
		}
		return results;

	}

	//location
	public ArrayList<Trip> selectLocation(String loc) {
		ArrayList<Trip> results = new ArrayList<Trip>();

		for( int i = 0; i < trips.size(); i++ ) {
			if(loc.equals(trips.get(i).getLocationOfTrip())) {
				results.add(trips.get(i));
			}
		}
		return results;

	}
}