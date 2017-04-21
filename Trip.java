/*import java.io.*;
import java.util.*;
*/
public class Trip {

	private String nameOfTrip;
	private int lengthOfTrip;
	private int locationOfTrip;
	private int timeOfTrip;
	// private int dateOfTrip;
	private int availableSeats;
	private int priceOfTrip;
	private int themeOfTrip;
	private int handicapped;
	private int difficultyLevel;
	private int suitableForKids;
	private int priceForKids;
	private int tripId;

	public Trip(String nameOfTrip, int lengthOfTrip, int locationOfTrip, int timeOfTrip,
			/* int dateOfTrip, */ int availableSeats, int priceOfTrip, int themeOfTrip, int handicapped,
			int difficultyLevel, int suitableForKids, int priceForKids, int tripId) {
		this.setNameOfTrip(nameOfTrip);
		this.setLengthOfTrip(lengthOfTrip);
		this.setLocationOfTrip(locationOfTrip);
		this.setTimeOfTrip(timeOfTrip);
		// this.setdateOfTrip(dateOfTrip);
		this.setAvailableSeats(availableSeats);
		this.setPriceOfTrip(priceOfTrip);
		this.setThemeOfTrip(themeOfTrip);
		this.setHandicapped(handicapped);
		this.setDifficultyLevel(difficultyLevel);
		this.setSuitableForKids(suitableForKids);
		this.setPriceForKids(priceForKids);
		this.setTripId(tripId);
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

	public int getLocationOfTrip() {
		return locationOfTrip;
	}

	public void setLocationOfTrip(int locationOfTrip) {
		this.locationOfTrip = locationOfTrip;
	}

	public int getTimeOfTrip() {
		return timeOfTrip;
	}

	public void setTimeOfTrip(int timeOfTrip) {
		this.timeOfTrip = timeOfTrip;
	}

	/*
	 * public int getDate() { return date; }
	 * 
	 * public void setDate(int date) { this.date = date; }
	 */

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public int getPriceOfTrip() {
		return priceOfTrip;
	}

	public void setPriceOfTrip(int priceOfTrip) {
		this.priceOfTrip = priceOfTrip;
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

	public int getpriceForKids() {
		return priceForKids;
	}

	public void setPriceForKids(int priceForKids) {
		this.priceForKids = priceForKids;
	}

	public int getTripId() {
		return tripId;
	}

	public void setTripId(int tripId) {
		this.tripId = tripId;
	}

	public String toString() {
		return ("Here below are the results for your DayTourSearch" + "\n" + " " + "\n" + "Name of trip:"
				+ this.getNameOfTrip() + "\n" + "Length of trip: " + this.getLengthOfTrip() + "\n" + "Location: "
				+ this.getLocationOfTrip() + "\n" + "Time of Trip: " + this.getTimeOfTrip() + "\n" + "Available Seats: "
				+ this.getAvailableSeats() + "\n" + "Price of trip: " + this.getPriceOfTrip() + "\n" + "Theme of trip: "
				+ this.getThemeOfTrip() + "\n" + "Suited for handicapped: " + this.isHandicapped() + "\n"
				+ "Difficulty level: " + this.getDifficultyLevel() + "\n" + "Suitable for Kids: "
				+ this.isSuitableForKids() + "\n" + "Price for Kids: " + this.getpriceForKids()) + "\n" + "Id of trip: "
				+ this.getTripId() + "\n";

	}

}
