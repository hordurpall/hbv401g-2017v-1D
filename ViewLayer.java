package trunk;



public class  ViewLayer {
	public static void main(String[] args){

		//insertKeyword
		StdOut.print("Search keyword: ");
		String keyword = StdIn.readString();
		
		//insertTime
		int a1 = 0;
		while (a1 == 0) {
		StdOut.println("Pick time: ");
		StdOut.println("1 = 08:00");
		StdOut.println("2 = 10:00");
		StdOut.println("3 = 12:00");
		StdOut.println("4 = 14:00");
		StdOut.println("5 = 22:00");
		int time = StdIn.readInt();
		if((time <= 5) && (time>=1)) 
			a1 = 1;
		else
			StdOut.println("Please pick a number between 1-5");
		}
		
		//insertPrice
		StdOut.println("Select lower boundry for prize: ");
		int lower = StdIn.readInt();
		StdOut.println("Select upper boundry for prize: ");
		int upper = StdIn.readInt();

		//insertLocation
		int a2 = 0;
		while (a2 == 0) {
		StdOut.println("Pick location: ");
		StdOut.println("1 = South Iceland");
		StdOut.println("2 = West Iceland");
		StdOut.println("3 = North Iceland");
		StdOut.println("4 = East Iceland");
		int loc = StdIn.readInt();
		if((loc <= 4) && (loc>=1)) 
			a2 = 1;
		else
			StdOut.println("Please pick a number between 1-4");
		}
		
		//insertTheme
		int a3 = 0;
		while (a3 == 0) {
		StdOut.println("Pick theme: ");
		StdOut.println("1 = Outdoors");
		StdOut.println("2 = Vehicle");
		StdOut.println("3 = Sight seeing");
		int theme = StdIn.readInt();
		if((theme <= 3) && (theme>=1)) 
			a3 = 1;
		else
			StdOut.println("Please pick a number between 1-3");
		}
		
		//wheelchair
		int a4 = 0;
		while (a4 == 0) {
		StdOut.println("Suitiable for handicaped: ");
		StdOut.println("0 = no ");
		StdOut.println("1 = yes");
		int acces = StdIn.readInt();
		if((acces <= 1) && (acces>=0)) 
			a4 = 1;
		else
			StdOut.println("Please pick a number between 0-1");
		}
		
		//difficulty lvl
		int a5 = 0;
		while (a5 == 0) {
		StdOut.println("Difficulty lvl: ");
		StdOut.println("1 = easy");
		StdOut.println("2 = medium");
		StdOut.println("3 = hard");
		int acces = StdIn.readInt();
		if((acces <= 3) && (acces>=1)) 
			a5 = 1;
		else
			StdOut.println("Please pick a number between 1-3");
		}
		//Kids
		int a6 = 0;
		while (a6 == 0) {
		StdOut.println("Suitiable for kids under 12 years: ");
		StdOut.println("0 = no ");
		StdOut.println("1 = yes");
		int acces = StdIn.readInt();
		if((acces <= 1) && (acces>=0)) 
			a6 = 1;
		else
			StdOut.println("Please pick a number between 0-1");
		}
		
		//Identification
		StdOut.println("Enter your name: ");
		String name = StdIn.readString();
		StdOut.println("Enter your kennitala: ");
		String kenni = StdIn.readString();
		
		
}
}