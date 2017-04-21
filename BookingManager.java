import java.util.ArrayList;

public class BookingManager {
	public ArrayList<Booking> bookings;

	public BookingManager() {
		bookings = new ArrayList<Booking>();
		Booking booking1 = new Booking("Hörður Páll Guðmundsson", 1612902469, 5, 1);
		bookings.add(booking1);
	}

	public ArrayList<Booking> Customer(String customer) {
		ArrayList<Booking> results = new ArrayList<Booking>();

		for (int i = 0; i < bookings.size(); i++) {

			results.add(bookings.get(i));
		}
		return results;

	}

	public ArrayList<Booking> Kennitala(int kennitala) {
		ArrayList<Booking> results = new ArrayList<Booking>();

		for (int i = 0; i < bookings.size(); i++) {
			if (kennitala < bookings.get(i).getKennitala())
				results.add(bookings.get(i));
		}
		return results;

	}

	public ArrayList<Booking> BookSeats(int bookseats) {
		ArrayList<Booking> results = new ArrayList<Booking>();

		for (int i = 0; i < bookings.size(); i++) {

			results.add(bookings.get(i));
		}
		return results;

	}

	public ArrayList<Booking> TripId(int tripId) {
		ArrayList<Booking> res = new ArrayList<Booking>();

		for (int i = 0; i < bookings.size(); i++) {

			res.add(bookings.get(i));
		}
		return res;

	}

}
