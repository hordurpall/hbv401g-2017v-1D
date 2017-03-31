package trunk;
public mockDB() {
}

public List<Trip> searchForKeyword(String query) throws ConnectException {

	List<Trip> Trip_list = new List<Trip>();
	Trip trip1 = new Trip("Golden Cirlce");
	Trip trip2 = new Trip("Blue lagon");
	Trip trip3 = new Trip("Horse riding");
	trip_list.add(trip1);
	trip_list.add(trip2);
	trip_list.add(trip3);
	
	retrun trip_list;

	}
}