package trunk;


public class TestFindTrips {

	List<Trip> trip_list;
	List<Trip> list;
	Trip nameOfTrip;

	@Test
	
	public void testFindTrips() {
		
		QueryDB queryDB = new MockDB();
		
		TripSearch tripSearch = new TripSearch(queryDB);
		
		list = tripSearch.findTrips(nameOfTrip);
		
		assertNotNull(list);
	}
		
		


	}


