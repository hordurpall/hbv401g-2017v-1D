import java.util.ArrayList;

public class TripSearch {

	ArrayList<Trip> trips;
	ArrayList<Booking> bookings;
	// Establish a connection to the databases of customers and trips.
	public TripCatalogue database = new TripCatalogue();
	public BookingManager database1 = new BookingManager();

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

	public ArrayList<Booking> showall(int all) {
		ArrayList<Booking> bookings = database1.Kennitala(all);

		return bookings;
	}
	
	public ArrayList<Trip> searchByID(int id) {
		ArrayList<Trip> trips = database.selectID(id);

		return trips;
	}

}