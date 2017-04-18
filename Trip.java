package trunk;

/*import java.io.*;
import java.util.*;
*/
    public class Trip {

        private String nameOfTrip;
        private int lengthOfTrip;
        private int location;
        private int time;
        //private int date;
        private int availableSeats;
        private int price;
        private int themeOfTrip;
        private int handicapped;
        private int difficultyLevel;
        private int suitableForKids;
        private int priceForKids;
        

        public Trip(String nameOfTrip, int lengthOfTrip, int location, int time, /*int date,*/ int availableSeats, int price,
        	int themeOfTrip, int handicapped, int difficultyLevel, int suitableForKids, int priceForKids) {
            this.setNameOfTrip(nameOfTrip);
            this.setLengthOfTrip(lengthOfTrip);
            this.setLocation(location);
            this.setTime(time);
            //this.setDate(date);
            this.setAvailableSeats(availableSeats);
            this.setPrice(price);
            this.setThemeOfTrip(themeOfTrip);
            this.setHandicapped(handicapped);
            this.setDifficultyLevel(difficultyLevel);
            this.setSuitableForKids(suitableForKids);
            this.setPriceForKids(priceForKids);
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

		public int getLocation() {
			return location;
		}

		public void setLocation(int location) {
			this.location = location;
		}

		public int getTime() {
			return time;
		}

		public void setTime(int time) {
			this.time = time;
		}

		/*public int getDate() {
			return date;
		}

		public void setDate(int date) {
			this.date = date;
		}*/

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

		public int getThemeOfTrip() {
			return themeOfTrip;
		}

		public void setThemeOfTrip(int themeOfTrip) {
			this.themeOfTrip = themeOfTrip;
		}

		public int isHandicapped() {
			return handicapped;
		}

		public void setHandicapped(int handicapped) {
			this.handicapped = handicapped;
		}

		public int getDifficultyLevel() {
			return difficultyLevel;
		}

		public void setDifficultyLevel(int difficultyLevel) {
			this.difficultyLevel = difficultyLevel;
		}

		public int isSuitableForKids() {
			return suitableForKids;
		}

		public void setSuitableForKids(int suitableForKids) {
			this.suitableForKids = suitableForKids;
		}

		public int getPriceForKids() {
			return priceForKids;
		}

		public void setPriceForKids(int priceForKids) {
			this.priceForKids = priceForKids;
		}
    }
