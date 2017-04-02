package trunk;
import java.rmi.ConnectException;
import java.util.ArrayList;


public class MockDB{
	
	public ArrayList<Trip> searchForKeyword(String query) throws ConnectException {

		ArrayList<Trip> trip_list = new ArrayList<Trip>();
		Trip trip1 = new Trip("Golden Cirlce");
		Trip trip2 = new Trip("Blue Lagon");
		Trip trip3 = new Trip("Horse riding");
		trip_list.add(trip1);
		trip_list.add(trip2);
		trip_list.add(trip3);
		
		return trip_list;

		}
	}