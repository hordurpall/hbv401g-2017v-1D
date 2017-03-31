public class TestFindTrips {

	List<Trip> Trip_list;
	List<Trip> list;
	Trip nameOfTrip;

	//@Test
	public void testFindTrips() {
		
		QueryDB queryDB = new mockDB();
		
		TripSearch tripSearch = new TripSearch(queryDB);
		
		list = tripSearch.findTrips(getnameOfTrip);
		
		assertNotNull(list);
	}
		
		


	}


