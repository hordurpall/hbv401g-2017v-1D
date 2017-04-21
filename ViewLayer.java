import java.util.ArrayList;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;

public class ViewLayer {
	Connection conn = null;
	public ArrayList<Trip> trips;
	public ArrayList<Booking> bookings;

	public static void main(String[] args) {

		int a = 0;
		while (a == 0) {
			System.out.println("Choose searching method 1-8: ");
			System.out.println("1 = Keyword");
			System.out.println("2 = time");
			System.out.println("3 = Suitable for kids");
			System.out.println("4 = Location");
			System.out.println("5 = Theme");
			System.out.println("6 = Suitable for handicapped");
			System.out.println("7 = Difficulty");
			System.out.println("8 = Price limit");
			Scanner scan = new Scanner(System.in);
			int search = scan.nextInt();
			switch (search) {

			// insertKeyword
			case 1:
				ViewLayer aa = new ViewLayer();
				aa.searchKeyword();
				break;

			// insertTime
			case 2:
				ViewLayer ab = new ViewLayer();
				ab.searchTime();
				break;

			// insertKids
			case 3:

				ViewLayer ac = new ViewLayer();
				ac.searchKids();
				break;

			// insertLocation
			case 4:

				ViewLayer ad = new ViewLayer();
				ad.searchLocation();
				break;

			// insertTheme
			case 5:

				ViewLayer ae = new ViewLayer();
				ae.searchTheme();
				break;

			case 6:

				// wheelchair
				ViewLayer af = new ViewLayer();
				af.searchHandicapped();
				break;

			case 7:

				// difficulty lvl
				ViewLayer ag = new ViewLayer();
				ag.searchDifficulty();
				break;

			case 8:

				// Price Limit
				ViewLayer ah = new ViewLayer();
				ah.searchPrice();
				break;

			}
			ViewLayer ai = new ViewLayer();
			ai.searchId();
			int b = 0;
			while (b == 0) {
				System.out.println("You sure this is the trip you want to book? Yes = 1, No = 0");
				Scanner scan1 = new Scanner(System.in);
				int y = Integer.parseInt(scan1.nextLine());
				if (y == 0) {
					System.out.println("Please start the search over again: ");
					b = 1;
				} else if ((y > 1) || (y < 0)) {
					System.out.println("Please choose select a valid number: Yes = 1, No = 0");
				} else if (y == 1) {
					a = 1;
					b = 1;

				}
			}
		}
		ViewLayer ba = new ViewLayer();
		ba.bookings();

	}

	public static Connection dbconnector(){
		try{
			Connection conn = DriverManager.getConnection("jdbc:sqlite:tripdata.sqlite");
			return conn;
		}
		catch(SQLException g){
			JOptionPane.showMessageDialog(null, g);
			return null;
		}
	}

	public void insert(String name, int kennitala, int bookedseats, int tripID) {
		String sql = "INSERT INTO BookingDatabase(Customer,kennitala,SeatsBooked,TripID) VALUES(?,?,?,?)";

		try (Connection conn = ViewLayer.dbconnector(); PreparedStatement flush = conn.prepareStatement(sql)) {
			flush.setString(1, name);
			flush.setInt(2, kennitala);
			flush.setInt(3, bookedseats);
			flush.setInt(4, tripID);
			flush.executeUpdate();
		} catch (SQLException g) {
			System.out.println(g.getMessage());
		}

	}

	private void searchKeyword() {
		TripSearch t = new TripSearch();
		System.out.println("Insert Keyword");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(t.searchByKeyword(s));
	}

	private void searchTime() {
		TripSearch t = new TripSearch();
		System.out.println("Pick time: ");
		System.out.println("1 = 08:00");
		System.out.println("2 = 10:00");
		System.out.println("3 = 12:00");
		System.out.println("4 = 14:00");
		System.out.println("5 = 22:00");
		Scanner scan = new Scanner(System.in);
		int s = Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByTime(s));
	}

	private void searchKids() {
		TripSearch t = new TripSearch();
		System.out.println("Suitable for kids under 12 years: ");
		System.out.println("0 = no ");
		System.out.println("1 = yes");
		Scanner scan = new Scanner(System.in);
		int s = Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByKids(s));
	}

	private void searchLocation() {
		TripSearch t = new TripSearch();
		System.out.println("Pick location: ");
		System.out.println("1 = South Iceland");
		System.out.println("2 = West Iceland");
		System.out.println("3 = North Iceland");
		System.out.println("4 = East Iceland");
		Scanner scan = new Scanner(System.in);
		int s = Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByLocation(s));
	}

	private void searchTheme() {
		TripSearch t = new TripSearch();
		System.out.println("Pick theme: ");
		System.out.println("1 = Outdoors");
		System.out.println("2 = Vehicle");
		System.out.println("3 = Sight seeing");
		Scanner scan = new Scanner(System.in);
		int s = Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByTheme(s));
	}

	private void searchHandicapped() {
		TripSearch t = new TripSearch();
		System.out.println("Suitable for handicapped: ");
		System.out.println("0 = no ");
		System.out.println("1 = yes");
		Scanner scan = new Scanner(System.in);
		int s = Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByAccess(s));
	}

	private void searchDifficulty() {
		TripSearch t = new TripSearch();
		System.out.println("Difficulty lvl: ");
		System.out.println("1 = easy");
		System.out.println("2 = medium");
		System.out.println("3 = hard");
		Scanner scan = new Scanner(System.in);
		int s = Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByDifficulty(s));
	}

	private void searchPrice() {
		TripSearch t = new TripSearch();
		System.out.println("Upper limit");
		Scanner scan = new Scanner(System.in);
		int s = Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByPrice(s));
	}

	private void searchId() {
		TripSearch t = new TripSearch();
		System.out.println("Please choose the Id number of the trip you want to book");
		Scanner scan = new Scanner(System.in);
		int s = Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByID(s));
	}

	private void bookings() {

		
		System.out.println("Please confirm the ID number of a trip: ");
		Scanner scan4 = new Scanner(System.in);
		int id = scan4.nextInt();
		scan4.nextLine();
		

		System.out.println("Please enter your name: ");
		Scanner scan1 = new Scanner(System.in);
		String customer = scan1.next();
		scan1.nextLine();
		

		System.out.println("Please enter your social security number: ");
		Scanner scan2 = new Scanner(System.in);
		int Kennitala = scan2.nextInt();
		scan2.nextLine();
		

		System.out.println("Please enter the amount of seats you want to book: ");
		Scanner scan3 = new Scanner(System.in);
		int seats = scan3.nextInt();
		scan3.nextLine();
		
		System.out.print(seats);
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		System.out.println("veisla1");
		Booking booking1 = new Booking(customer, Kennitala, seats, id);
		System.out.println("veisla2");
		bookings.add(booking1);
		System.out.println("veisla3");
		

			ViewLayer app = new ViewLayer();
		app.insert(customer, Kennitala, seats, id);

		// if setnign sem skoðar hvort séu nógu mörg sæti til og ef ekki segir
		// viðskipta vinn það.

		System.out.println("Your booking has been confirmed.");
		System.out.println("Thank you and have a nice day");
	}

}
