package trunk;
import java.util.Scanner;
	public class prufuklasi{
	        public static String search(String Trip) {
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
	        public static void main (String args[]){
	        	
	        String a = search("");
	        System.out.print(a);
	        }
	        
	    }

