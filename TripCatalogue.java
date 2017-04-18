package trunk;

import java.util.ArrayList;
import java.util.Iterator;



public class TripCatalogue {
	
	ArrayList<Trip> trips = new ArrayList<Trip>();
	private ArrayList<Trip> results = new ArrayList<Trip>();
	
	public TripCatalogue(){
		
		Trip trip1 = new Trip("Golden", 8, 1, 800, 40, 9900, 1, 1, 1, 1, 4950);
		Trip trip2 = new Trip("B�jarfer� � Sey�isfj�r�", 6, 4, 800, 40, 11999, 2, 1, 1, 1, 3999);
		Trip trip3 = new Trip("Blue Lagoon", 6, 1, 1300, 40, 10000, 1, 1, 1, 1, 10000);
		Trip trip4 = new Trip("Horse Riding", 3, 1, 1300, 20, 8800, 1, 0, 1, 1, 4400);
		Trip trip5 = new Trip("Fer� � Borgarfj�r� Eystri", 8, 4, 800, 20, 15999, 2, 0, 1, 1, 4999);
		Trip trip6 = new Trip("Inside the volcano", 6, 1, 1300, 10, 42000, 1, 0, 2, 0, 0);
		Trip trip7 = new Trip("Rafting Bakkaflj�t", 6, 3, 1000, 20, 29000, 1, 0, 3, 0, 0);
		Trip trip8 = new Trip("Nor�urlj�safer�", 2, 1, 2100, 40, 10000, 1, 1, 1, 1, 3990);
		Trip trip9 = new Trip("Snj�sle�afer� upp � fjar�arhei�i", 10, 4, 800, 10, 24999, 2, 0, 2, 0, 0);
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

	
	public ArrayList<Trip> searchForKeyword(String keyword) {
		Iterator<Trip> iterator = trips.iterator();
		while (iterator.hasNext()) {
			Trip nameOfTrip = iterator.next();
			if(keyword.equals(nameOfTrip))
				getResults().add(nameOfTrip);
		}
		return getResults();
	}

	//theme
		
		public ArrayList<Trip> selectTheme(int theme) {
			Iterator<Trip> iterator = trips.iterator();
			while (iterator.hasNext()) {
				Trip themeOfTrip = iterator.next();
				if(themeOfTrip.equals(theme))
					getResults().add(themeOfTrip);
			}
			return getResults();
		}

		//time
		
		public ArrayList<Trip> selectTime (int time) {
			Iterator<Trip> iterator = trips.iterator();
			while (iterator.hasNext()) {
				Trip timeOfTrip  = iterator.next();
				if(timeOfTrip.equals(time))
					getResults().add(timeOfTrip);
			}
			return getResults();
		}
		
		//price
		
		public ArrayList<Trip> selectPrice (int upper,int lower) {
			Iterator<Trip> iterator = trips.iterator();
			while (iterator.hasNext()) {
				Trip priceOfTrip = iterator.next();
				if (priceOfTrip.getPriceOfTrip() <= upper) 
						
					getResults().add(priceOfTrip);
			}
			return getResults();
		}
		
		//handicapped
		
		public ArrayList<Trip>  selectAccess(int access) {
			Iterator<Trip> iterator = trips.iterator();
			while (iterator.hasNext()) {
				Trip handicapped  = iterator.next();
				if(handicapped.equals(access))
					getResults().add(handicapped);
			}
			return getResults();
		}
		
		//difficulty level
		
		public ArrayList<Trip>  selectDifficultyLevel(int lvl) {
			Iterator<Trip> iterator = trips.iterator();
			while (iterator.hasNext()) {
				Trip difficultyLevel  = iterator.next();
				if(difficultyLevel.equals(lvl))
					getResults().add(difficultyLevel);
			}
			return getResults();
		}
		
		//kids
		public ArrayList<Trip>  selectForKids(int kids) {
			Iterator<Trip> iterator = trips.iterator();
			while (iterator.hasNext()) {
				Trip suitableForKids  = iterator.next();
				if(suitableForKids.equals(kids))
					getResults().add(suitableForKids);
			}
			return getResults();
		}
		
		//location
		public ArrayList<Trip>  selectLocation(int loc) {
			Iterator<Trip> iterator = trips.iterator();
			while (iterator.hasNext()) {
				Trip location  = iterator.next();
				if(location.equals(loc))
					getResults().add(location);
			}
			return getResults();
		}


		public ArrayList<Trip> getResults() {
			return results;
		}


		public void setResults(ArrayList<Trip> results) {
			this.results = results;
		}	
		
		
}