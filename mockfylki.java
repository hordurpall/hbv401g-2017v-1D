package trunk;
public mockDB() {
}

public ArrayList<Trip> searchForKeyword(String query) throws ConnectException {

	ArrayList<Trip> Trip_list = new ArrayList<Trip>();
	Trip trip1 = new Trip(01, "Golden Cirlce",40);
	Trip trip2 = new Trip(02, "Blue lagon",40);
	Trip trip3 = new Trip(03, "Horse riding",20);
	trip_list.add(trip1);
	trip_list.add(trip2);
	trip_list.add(trip3);
	
	retrun trip_list;

	}
}