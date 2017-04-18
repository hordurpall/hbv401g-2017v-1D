package trunk;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class  ViewLayer {
	public static void main(String[] args){

		StdOut.println("Choose searching method 1-8: ");
		StdOut.println("1 = Keyword");
		StdOut.println("2 = time");
		StdOut.println("3 = Price");
		StdOut.println("4 = Location");
		StdOut.println("5 = Theme");
		StdOut.println("6 = Suitiable for handicapped");
		StdOut.println("7 = Difficulty");
		StdOut.println("8 = Suitiable for kids");
		int search = StdIn.readInt();
		switch (search){
		
	
		//insertKeyword
		case 1: 
			
			StdOut.print("Search keyword: ");
			String keyword = StdIn.readString();
			TripCatalogue class1 = new TripCatalogue();
			class1.searchForKeyword(keyword);
	
			StdOut.println(class1.searchForKeyword(keyword));
				
			
		break;
		
		//insertTime
		case 2:
			
			int a1 = 0;
			while (a1 == 0) {
				StdOut.println("Pick time: ");
				StdOut.println("1 = 08:00");
				StdOut.println("2 = 10:00");
				StdOut.println("3 = 12:00");
				StdOut.println("4 = 14:00");
				StdOut.println("5 = 22:00");
				int time = StdIn.readInt();
				if((time <= 5) && (time>=1)) {
					a1 = 1;
				TripCatalogue class2 = new TripCatalogue();
				class2.selectTime(time);
			}
				else
					StdOut.println("Please pick a number between 1-5");
		}
		break;
		
		//insertPrice
		case 3:
			
			StdOut.println("Select lower boundry for prize: ");
			int lower = StdIn.readInt();
			StdOut.println("Select upper boundry for prize: ");
			int upper = StdIn.readInt();
			
			TripCatalogue class3 = new TripCatalogue();
			class3.selectPrice(lower, upper);
		
			
		break;
		
		//insertLocation
		case 4:
			
			int a2 = 0;
			while (a2 == 0) {
				StdOut.println("Pick location: ");
				StdOut.println("1 = South Iceland");
				StdOut.println("2 = West Iceland");
				StdOut.println("3 = North Iceland");
				StdOut.println("4 = East Iceland");
				int loc = StdIn.readInt();
				if((loc <= 4) && (loc>=1)) {
					a2 = 1;
					TripCatalogue class4 = new TripCatalogue();
					class4.selectLocation(loc);
				}
				else
					StdOut.println("Please pick a number between 1-4");
		}
			
		break;
		
		//insertTheme
		case 5:
			
			int a3 = 0;
			while (a3 == 0) {
				StdOut.println("Pick theme: ");
				StdOut.println("1 = Outdoors");
				StdOut.println("2 = Vehicle");
				StdOut.println("3 = Sight seeing");
				int theme = StdIn.readInt();
				if((theme <= 3) && (theme>=1)) {
					a3 = 1;
				TripCatalogue class5 = new TripCatalogue();
				class5.selectTheme(theme);
				}
				else
					StdOut.println("Please pick a number between 1-3");
		}
		break;
			
		case 6:
			
		//wheelchair
			int a4 = 0;
			while (a4 == 0) {
				StdOut.println("Suitiable for handicaped: ");
				StdOut.println("0 = no ");
				StdOut.println("1 = yes");
				int access = StdIn.readInt();
				if((access <= 1) && (access>=0)) {
					a4 = 1;
				TripCatalogue class6 = new TripCatalogue();
				class6.selectLocation(access);
				}
				else
					StdOut.println("Please pick a number between 0-1");
		}
		case 7:
			
		//difficulty lvl
			int a5 = 0;
			while (a5 == 0) {
				StdOut.println("Difficulty lvl: ");
				StdOut.println("1 = easy");
				StdOut.println("2 = medium");
				StdOut.println("3 = hard");
				int lvl = StdIn.readInt();
				if((lvl <= 3) && (lvl>=1)) {
					a5 = 1;
					TripCatalogue class7 = new TripCatalogue();
					class7.selectLocation(lvl);
				}
				else
					StdOut.println("Please pick a number between 1-3");
		}
		break;
		
		case 8:
			
			//Kids
			int a6 = 0;
			while (a6 == 0) {
				StdOut.println("Suitiable for kids under 12 years: ");
				StdOut.println("0 = no ");
				StdOut.println("1 = yes");
				int kids = StdIn.readInt();
				if((kids <= 1) && (kids>=0)) {
					a6 = 1;
					TripCatalogue class8 = new TripCatalogue();
					class8.selectLocation(kids);
				}
				else
					StdOut.println("Please pick a number between 0-1");
			}
		break;
		default:
			StdOut.print("Please choose a number between 1-8");
			break;
		

		}
		//Sýna ferðir sem eru í boði
		//velja eina af þeim ferðum
		
		//Identification
		StdOut.println("Enter your name: ");
		String name = StdIn.readString();
		StdOut.println("Enter your kennitala: ");
		String kenni = StdIn.readString();
		
		//Hversu mörg sæti.
		//bóka ferð.
	
}
}
