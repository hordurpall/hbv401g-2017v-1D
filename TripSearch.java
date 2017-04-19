import java.util.ArrayList;


public class TripSearch {

	ArrayList<Trip> trips;

	public TripCatalogue database = new TripCatalogue();

	public ArrayList<Trip> searchByKeyword(String keyword) {
		ArrayList<Trip> name = database.searchForKeyword(keyword);

		return name;
	}

	public ArrayList<Trip> searchByTime(String time) {
		ArrayList<Trip> times = database.selectTime(time);

		return times;
	}

	//public ArrayList<Trip> searchByPrice(String upper,String lower) {
	//	ArrayList<Trip> name = database.selectTime(upper, lower);
	//
	//	return name;
	//} 

	public ArrayList<Trip> searchByAccess(String access) {
		ArrayList<Trip> acess = database.selectAccess(access);

		return acess;
	} 

	public ArrayList<Trip> searchByDifficulty(String lvl) {
		ArrayList<Trip> level = database.selectDifficultyLevel(lvl);

		return level;
	} 

	public ArrayList<Trip> searchByKids(String kids) {
		ArrayList<Trip> suitable = database.searchForKeyword(kids);

		return suitable;
	} 

	public ArrayList<Trip> searchByLocation(String loc) {
		ArrayList<Trip> location = database.selectLocation(loc);

		return location;
	}
	
	public ArrayList<Trip> searchByTheme(String them) {
		ArrayList<Trip> theme = database.selectTheme(them);

		return theme;
	}

	



}