

import java.io.*;
import java.util.*;

    class Trip {

        private String nameOfTrip;
        private int lengthOfTrip;
        private String location;
        private int time;
        private int date;
        private int availableSeats;
        private int price;
        private String themeOfTrip;
        private boolean handicapped;
        private int difficultyLevel;
        private boolean suitableForKids;
        private int priceForKids;
        

        public Trip(String nameOfTrip, int lengthOfTrip, String location, int time, int date, int availableSeats, int price, String themeOfTrip, boolean handicapped, int difficultyLevel, boolean suitableForKids, int priceForKids) {
            this.setNameOfTrip(nameOfTrip);
            this.setLengthOfTrip(lengthOfTrip);
            this.setLocation(location);
            this.setTime(time);
            this.setDate(date);
            this.setAvailableSeats(availableSeats);
            this.setPrice(price);
            this.setThemeOfTrip(themeOfTrip);
            this.setHandicapped(handicapped);
            this.setDifficultyLevel(difficultyLevel);
            this.setSuitableForKids(suitableForKids);
            this.setPriceForKids(priceForKids);
        }

        public void fillTripArray() {
            // properties

            int size; // total number of Students in collection

            File file = new File("TripDetails.txt");

            try {
                Scanner in = new Scanner(file);

                while (in.hasNextLine()) {
                    String nameOfTrip = in.next();
                    int lengthOfTrip = in.next();
                    String location = in.next();
                    int time = in.next();
                    int date = in.next();
                    int availableSeats = in.next();
                    int price = in.next();
                    String themeOfTrip = in.next();
                    boolean handicapped = in.next();
                    int difficultyLevel = in.next();
                    boolean suitableForKids = in.next();
                    int priceForKids = in.next();

                    trips.add(new Trip(nameOfTrip, lengthOfTrip, location,time,date,availableSeats,price,themeOfTrip,handicapped,difficultyLevel,suitableForKids,priceForKids));
                }

            }

            catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

       

   

		public String getNameOfTrip() {
			return nameOfTrip;
		}

		public void setNameOfTrip(String nameOfTrip) {
			this.nameOfTrip = nameOfTrip;
		}

		public int getLengthOfTrip() {
			return lengthOfTrip;
		}

		public void setLengthOfTrip(int lengthOfTrip) {
			this.lengthOfTrip = lengthOfTrip;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public int getTime() {
			return time;
		}

		public void setTime(int time) {
			this.time = time;
		}

		public int getDate() {
			return date;
		}

		public void setDate(int date) {
			this.date = date;
		}

		public int getAvailableSeats() {
			return availableSeats;
		}

		public void setAvailableSeats(int availableSeats) {
			this.availableSeats = availableSeats;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getThemeOfTrip() {
			return themeOfTrip;
		}

		public void setThemeOfTrip(String themeOfTrip) {
			this.themeOfTrip = themeOfTrip;
		}

		public boolean isHandicapped() {
			return handicapped;
		}

		public void setHandicapped(boolean handicapped) {
			this.handicapped = handicapped;
		}

		public int getDifficultyLevel() {
			return difficultyLevel;
		}

		public void setDifficultyLevel(int difficultyLevel) {
			this.difficultyLevel = difficultyLevel;
		}

		public boolean isSuitableForKids() {
			return suitableForKids;
		}

		public void setSuitableForKids(boolean suitableForKids) {
			this.suitableForKids = suitableForKids;
		}

		public int getPriceForKids() {
			return priceForKids;
		}

		public void setPriceForKids(int priceForKids) {
			this.priceForKids = priceForKids;
		}
    }
