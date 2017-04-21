import java.util.ArrayList;
import java.util.Iterator;


public class TripCatalogue {

	public ArrayList<Trip> trips;


	public TripCatalogue(){
		trips = new ArrayList<Trip>();
		// name, length, location, time, seat,price, theme, handicapped, difficulty, suitablekids, pricekids
		Trip trip1 = new Trip("Golden circle", 8, 1, 1, 40, 9900, 1, 1, 1, 1, 4950,1);
		Trip trip2 = new Trip("Bæjarferð á Seyðisfjörð", 6, 4, 1, 40, 11999, 2, 1, 1, 1, 3999,2);
		Trip trip3 = new Trip("Blue Lagoon", 6, 1, 2, 40, 10000, 1, 1, 1, 1, 10000,3);
		Trip trip4 = new Trip("Horse Riding", 3, 1, 3, 20, 8800, 1, 0, 1, 1, 4400,4);
		Trip trip5 = new Trip("Ferð á Borgarfjörð Eystri", 8, 4, 4, 20, 15999, 2, 0, 1, 1, 4999,5);
		Trip trip6 = new Trip("Inside the volcano", 6, 1, 4, 10, 42000, 1, 0, 2, 0, 0,6);
		Trip trip7 = new Trip("Rafting Bakkafljót", 6, 3, 5, 20, 29000, 1, 0, 3, 0, 0,7);
		Trip trip8 = new Trip("Norðurljósaferð", 2, 1, 5, 40, 10000, 1, 1, 1, 1, 3990,8);
		Trip trip9 = new Trip("Snjósleðaferð upp á fjarðarheiði", 10, 4, 3, 10, 24999, 2, 0, 2, 0, 0,9);
		Trip trip10 = new Trip("Viking Ship Sailing tour", 2, 1, 2, 25, 12000, 2, 0, 1, 1, 7200,10);
		Trip trip11 = new Trip("Midnight mountain bath & hike", 5, 1, 5, 30, 18000, 1, 0, 2, 0,0,11);
		Trip trip12 = new Trip("Laugarvegurinn", 2, 1, 1, 20, 5000, 3, 1, 1, 1, 0,12);
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
			if((trips.get(i).getNameOfTrip()).contains(keyword)) {
				results.add(trips.get(i));
			}
		}
		return results;

	}
	//time

	public ArrayList<Trip> selectTime(int time) {
		ArrayList<Trip> results = new ArrayList<Trip>();

		for( int i = 0; i < trips.size(); i++ ) {
			if(time == (trips.get(i).getTimeOfTrip())) {
				results.add(trips.get(i));
			}
		}
		return results;

	}
	
	//theme

		public ArrayList<Trip> selectTheme(int theme) {
			ArrayList<Trip> results = new ArrayList<Trip>();

			for( int i = 0; i < trips.size(); i++ ) {
				if(theme == (trips.get(i).getThemeOfTrip())) {
					results.add(trips.get(i));
				}
			}
			return results;

		}
	//price

	public ArrayList<Trip> selectPrice(int limit) {
		ArrayList<Trip> results = new ArrayList<Trip>();

		for( int i = 0; i < trips.size(); i++ ) {
			if(limit > (trips.get(i).getPriceOfTrip())) {
				results.add(trips.get(i));
				
			}
		}
		return results;

	}

	//handicapped

	public ArrayList<Trip> selectAccess(int access) {
		ArrayList<Trip> results = new ArrayList<Trip>();

		for( int i = 0; i < trips.size(); i++ ) {
			if(access == (trips.get(i).isHandicapped())) {
				results.add(trips.get(i));
			}
		}
		return results;

	}

	//difficulty level

	public ArrayList<Trip> selectDifficultyLevel(int lvl) {
		ArrayList<Trip> results = new ArrayList<Trip>();

		for( int i = 0; i < trips.size(); i++ ) {
			if(lvl == (trips.get(i).getDifficultyLevel())) {
				results.add(trips.get(i));
			}
		}
		return results;

	}

	//kids

	public ArrayList<Trip> selectSuitableForKids(int kids) {
		ArrayList<Trip> results = new ArrayList<Trip>();

		for( int i = 0; i < trips.size(); i++ ) {
			if(kids == (trips.get(i).isSuitableForKids())) {
				results.add(trips.get(i));
			}
		}
		return results;

	}

	//location
	public ArrayList<Trip> selectLocation(int loc) {
		ArrayList<Trip> results = new ArrayList<Trip>();

		for( int i = 0; i < trips.size(); i++ ) {
			if(loc == (trips.get(i).getLocationOfTrip())) {
				results.add(trips.get(i));
			}
		}
		return results;

	}
}