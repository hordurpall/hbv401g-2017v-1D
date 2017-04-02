package trunk;
import java.util.ArrayList;

public class TestFindTrips {

	ArrayList<Trip> trip_list;
	ArrayList<Trip> list;
	Trip nameOfTrip;

	//@Trip
	
	public void testFindTrips() {
		
		MockDB queryDB = new MockDB();
		
		
		
		Trip getnameoftrip = new Trip(queryDB);
		
		list = trip.findTrips(nameOfTrip);
		
		assertNotNull(list);
	}

	private void assertNotNull(ArrayList<Trip> list2) {
		// TODO Auto-generated method stub
		
	}
		
		


	}


