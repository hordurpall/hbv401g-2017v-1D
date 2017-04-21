import java.util.ArrayList;


public class TripSearch {

	ArrayList<Trip> trips;
//Establish a connection to the databases of customers and trips.
	public TripCatalogue database = new TripCatalogue();
	public BookingManager databse1 = new BookingManager();

	
	
	//Search methods
	public ArrayList<Trip> searchByKeyword(String keyword) {
		ArrayList<Trip> trips = database.searchForKeyword(keyword);

		return trips;
	}

	public ArrayList<Trip> searchByTime(int time) {
		ArrayList<Trip> trips = database.selectTime(time);

		return trips;
	}

	public ArrayList<Trip> searchByPrice(int limit) {
		ArrayList<Trip> trips = database.selectPrice(limit);
	
		return trips;
	} 

	public ArrayList<Trip> searchByAccess(int access) {
		ArrayList<Trip> trips = database.selectAccess(access);

		return trips;
	} 

	public ArrayList<Trip> searchByDifficulty(int lvl) {
		ArrayList<Trip> trips = database.selectDifficultyLevel(lvl);

		return trips;
	} 

	public ArrayList<Trip> searchByKids(int kids) {
		ArrayList<Trip> trips = database.selectDifficultyLevel(kids);

		return trips;
	} 

	public ArrayList<Trip> searchByLocation(int loc) {
		ArrayList<Trip> trips = database.selectLocation(loc);

		return trips;
	}
	
	public ArrayList<Trip> searchByTheme(int them) {
		ArrayList<Trip> trips = database.selectTheme(them);

		return trips;
	}

	



}