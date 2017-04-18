 package trunk;
import java.util.Scanner;


public class Leit{
        public Leit(MockDB mockDB) {
		// TODO Auto-generated constructor stub
	}

		public String search(String Trip) {
            System.out.print("Enter the name you wish to search: ");


            Scanner keyboard = new Scanner(System.in);
            String nameSearch = keyboard.next();
            if(MockDB.contains(nameSearch)){
            String name = nameSearch;
                return name;
                }
            else
            return null;
        }
    }

