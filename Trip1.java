package trunk;

import java.io.*;
import java.util.*;

    class Trip1 {

        private String nameOfTrip;
        private int lengthOfTrip;
        private String location;
        private int timeOftrip;
        private int dateOfTrip;
        private int availableSeats;
        private int priceOfTrip;
        private String themeOfTrip;
        private boolean handicapped;
        private int difficultyLevel;
        private boolean suitableForKids;
        private int priceOfTripForKids;
        

        public Trip1(String nameOfTrip, int lengthOfTrip, String location, int timeOftrip, int dateOfTrip, int availableSeats, int priceOfTrip, String themeOfTrip, boolean handicapped, int difficultyLevel, boolean suitableForKids, int priceOfTripForKids) {
            this.setNameOfTrip(nameOfTrip);
            this.setLengthOfTrip(lengthOfTrip);
            this.setLocation(location);
            this.settimeOftrip(timeOftrip);
            this.setdateOfTrip(dateOfTrip);
            this.setAvailableSeats(availableSeats);
            this.setpriceOfTrip(priceOfTrip);
            this.setThemeOfTrip(themeOfTrip);
            this.setHandicapped(handicapped);
            this.setDifficultyLevel(difficultyLevel);
            this.setSuitableForKids(suitableForKids);
            this.setpriceOfTripForKids(priceOfTripForKids);
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

		public int gettimeOftrip() {
			return timeOftrip;
		}

		public void settimeOftrip(int timeOftrip) {
			this.timeOftrip = timeOftrip;
		}

		public int getdateOfTrip() {
			return dateOfTrip;
		}

		public void setdateOfTrip(int dateOfTrip) {
			this.dateOfTrip = dateOfTrip;
		}

		public int getAvailableSeats() {
			return availableSeats;
		}

		public void setAvailableSeats(int availableSeats) {
			this.availableSeats = availableSeats;
		}

		public int getpriceOfTrip() {
			return priceOfTrip;
		}

		public void setpriceOfTrip(int priceOfTrip) {
			this.priceOfTrip = priceOfTrip;
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

		public int getpriceOfTripForKids() {
			return priceOfTripForKids;
		}

		public void setpriceOfTripForKids(int priceOfTripForKids) {
			this.priceOfTripForKids = priceOfTripForKids;
		}
    }
