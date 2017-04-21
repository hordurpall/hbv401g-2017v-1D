import java.util.ArrayList;
import java.util.*;

public class  ViewLayer {

	public ArrayList<Trip> trips;


	public static void main(String[] args){

		StdOut.println("Choose searching method 1-7: ");
		StdOut.println("1 = Keyword");
		StdOut.println("2 = time");
		StdOut.println("3 = Suitiable for kids");
		StdOut.println("4 = Location");
		StdOut.println("5 = Theme");
		StdOut.println("6 = Suitiable for handicapped");
		StdOut.println("7 = Difficulty");
		StdOut.println("8 = Price limit");
		Scanner scan = new Scanner(System.in);
		int search = scan.nextInt();
		switch (search){



		//insertKeyword
		case 1: 
			ViewLayer aa = new ViewLayer();
			aa.searchKeyword();
			break;


			//insertTime
		case 2:
			ViewLayer ab = new ViewLayer();
			ab.searchTime();
			break;

			//insertKids
		case 3:

			ViewLayer ac = new ViewLayer();
			ac.searchKids();
			break;

			//insertLocation
		case 4:

			ViewLayer ad = new ViewLayer();
			ad.searchLocation();
			break;

			//insertTheme
		case 5:

			ViewLayer ae = new ViewLayer();
			ae.searchTheme();
			break;

		case 6:

			//wheelchair
			ViewLayer af = new ViewLayer();
			af.searchHandicapped();
			break;

		case 7:

			//difficulty lvl
			ViewLayer ag = new ViewLayer();
			ag.searchDifficulty();
			break;
		
		case 8:

			//Price Limit
			ViewLayer ah = new ViewLayer();
			ah.searchPrice();
			break;


		}
	}

	
	private void searchKeyword(){
		TripSearch t = new TripSearch();
		StdOut.println("Insert Keyword");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(t.searchByKeyword(s));
	}
	
	private void searchTime(){
		TripSearch t = new TripSearch();
		StdOut.println("Pick time: ");
		StdOut.println("1 = 08:00");
		StdOut.println("2 = 10:00");
		StdOut.println("3 = 12:00");
		StdOut.println("4 = 14:00");
		StdOut.println("5 = 22:00");
		Scanner scan = new Scanner(System.in);
		int s =Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByTime(s));
	}
	
	private void searchKids(){
		TripSearch t = new TripSearch();
		StdOut.println("Suitiable for kids under 12 years: ");
		StdOut.println("0 = no ");
		StdOut.println("1 = yes");
		Scanner scan = new Scanner(System.in);
		int s =Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByKids(s));
	}
	
	private void searchLocation(){
		TripSearch t = new TripSearch();
		StdOut.println("Pick location: ");
		StdOut.println("1 = South Iceland");
		StdOut.println("2 = West Iceland");
		StdOut.println("3 = North Iceland");
		StdOut.println("4 = East Iceland");
		Scanner scan = new Scanner(System.in);
		int s =Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByLocation(s));
	}
	
	private void searchTheme(){
		TripSearch t = new TripSearch();
		StdOut.println("Pick theme: ");
		StdOut.println("1 = Outdoors");
		StdOut.println("2 = Vehicle");
		StdOut.println("3 = Sight seeing");
		Scanner scan = new Scanner(System.in);
		int s =Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByTheme(s));
	}
	
	private void searchHandicapped(){
		TripSearch t = new TripSearch();
		StdOut.println("Suitable for handicaped: ");
		StdOut.println("0 = no ");
		StdOut.println("1 = yes");
		Scanner scan = new Scanner(System.in);
		int s =Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByAccess(s));
	}
	
	private void searchDifficulty(){
		TripSearch t = new TripSearch();
		StdOut.println("Difficulty lvl: ");
		StdOut.println("1 = easy");
		StdOut.println("2 = medium");
		StdOut.println("3 = hard");
		Scanner scan = new Scanner(System.in);
		int s =Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByDifficulty(s));
	}
	
	private void searchPrice(){
		TripSearch t = new TripSearch();
		StdOut.println("Upper limit");
		Scanner scan = new Scanner(System.in);
		int s =Integer.parseInt(scan.nextLine());
		System.out.println(s);
		System.out.println(t.searchByPrice(s));
	}
		}




