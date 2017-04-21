package trunk;

import java.util.ArrayList;
import java.util.*;

public class  ViewLayer {

	public ArrayList<Trip> trips;


	public static void main(String[] args){

		int a = 0;
		while(a == 0){
			System.out.print("Choose searching method 1-8: ");
			System.out.print("1 = Keyword");
			System.out.print("2 = time");
			System.out.print("3 = Suitiable for kids");
			System.out.print("4 = Location");
			System.out.print("5 = Theme");
			System.out.print("6 = Suitiable for handicapped");
			System.out.print("7 = Difficulty");
			System.out.print("8 = Price limit");
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
			ViewLayer ai = new ViewLayer();
			ai.searchPrice();
			int b = 0;
			while(b == 0){
				System.out.print("You sure this is the trip you want to book? Yes = 1, No = 0");
				Scanner scan1 = new Scanner(System.in);
				int y = Integer.parseInt(scan1.nextLine());
				if (y == 0){
					System.out.print("Please start the search over again: ");
					b = 1;
				}
				else if((y > 1) || (y < 0)){
					System.out.print("Please choose select a valid number: Yes = 1, No = 0");
				}
				else if(y == 1){
					a = 1;
					b = 1;

				}
			}
		}

		System.out.println("Please enter your name: ");
		Scanner scan2 = new Scanner(System.in);
		int costumer = Integer.parseInt(scan2.nextLine());
		
		System.out.println("Please enter your social security number: ");
		Scanner scan3 = new Scanner(System.in);
		int Kennitala = Integer.parseInt(scan3.nextLine());
		
		System.out.println("Please enter the amount of seats you want to book: ");
		Scanner scan4 = new Scanner(System.in);
		int seats = Integer.parseInt(scan4.nextLine());
		
		//if setnign sem skoðar hvort séu nógu mörg sæti til og ef ekki segir viðskipta vinn það.
		System.out.println("Your booking has been confrimed.");
		System.out.println("Thank you and have a nice day");
	}

	
	private void searchKeyword(){
		TripSearch t = new TripSearch();
		System.out.print("Insert Keyword");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(t.searchByKeyword(s));
	}
	
	private void searchTime(){
		TripSearch t = new TripSearch();
		System.out.print("Pick time: ");
		System.out.print("1 = 08:00");
		System.out.print("2 = 10:00");
		System.out.print("3 = 12:00");
		System.out.print("4 = 14:00");
		System.out.print("5 = 22:00");
		Scanner scan = new Scanner(System.in);
		int s =Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByTime(s));
	}
	
	private void searchKids(){
		TripSearch t = new TripSearch();
		System.out.print("Suitiable for kids under 12 years: ");
		System.out.print("0 = no ");
		System.out.print("1 = yes");
		Scanner scan = new Scanner(System.in);
		int s =Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByKids(s));
	}
	
	private void searchLocation(){
		TripSearch t = new TripSearch();
		System.out.print("Pick location: ");
		System.out.print("1 = South Iceland");
		System.out.print("2 = West Iceland");
		System.out.print("3 = North Iceland");
		System.out.print("4 = East Iceland");
		Scanner scan = new Scanner(System.in);
		int s =Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByLocation(s));
	}
	
	private void searchTheme(){
		TripSearch t = new TripSearch();
		System.out.print("Pick theme: ");
		System.out.print("1 = Outdoors");
		System.out.print("2 = Vehicle");
		System.out.print("3 = Sight seeing");
		Scanner scan = new Scanner(System.in);
		int s =Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByTheme(s));
	}
	
	private void searchHandicapped(){
		TripSearch t = new TripSearch();
		System.out.print("Suitable for handicaped: ");
		System.out.print("0 = no ");
		System.out.print("1 = yes");
		Scanner scan = new Scanner(System.in);
		int s =Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByAccess(s));
	}
	
	private void searchDifficulty(){
		TripSearch t = new TripSearch();
		System.out.print("Difficulty lvl: ");
		System.out.print("1 = easy");
		System.out.print("2 = medium");
		System.out.print("3 = hard");
		Scanner scan = new Scanner(System.in);
		int s =Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByDifficulty(s));
	}
	
	private void searchPrice(){
		TripSearch t = new TripSearch();
		System.out.print("Upper limit");
		Scanner scan = new Scanner(System.in);
		int s =Integer.parseInt(scan.nextLine());
		System.out.println(s);
		System.out.println(t.searchByPrice(s));
	}
	private void searchId(){
		TripSearch t = new TripSearch();
		System.out.print("Please choose the Id number of the trip you want to book");
		Scanner scan = new Scanner(System.in);
		int s = Integer.parseInt(scan.nextLine());
		System.out.println(t.searchByPrice(s));
	}
	
	
		}




