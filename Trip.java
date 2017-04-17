package trunk;

import java.io.*;
import java.util.*;

public class Trip {

	private String nameOfTrip;
	private int lengthOfTrip;
	private int location;
	private int time;
	private int date;
	private int availableSeats;
	private int themeOfTrip;
	private int handicapped;
	private int difficultyLevel;
	private int suitableForKids;
	private int priceForKids;
	private int ID;
	

	public Trip(String nameOfTrip, int lengthOfTrip, int location, int time, int date, int availableSeats,
		int themeOfTrip, int handicapped, int difficultyLevel, int suitableForKids, int priceForKids, int ID) {
		this.nameOfTrip = nameOfTrip;
		this.lengthOfTrip = lengthOfTrip;
		this.location = location;
		this.time = time;
		this.date = date;
		this.availableSeats = availableSeats;
		this.themeOfTrip = themeOfTrip;
		this.handicapped = handicapped;
		this.difficultyLevel = difficultyLevel;
		this.suitableForKids = suitableForKids;
		this.priceForKids = priceForKids;
		this.ID = ID;
		
	}


	public String getNameOfTrip() {
		return nameOfTrip;
	}

	public void setNameOfTrip(String nameOfTrip) {
		this.nameOfTrip = nameOfTrip;
	}


}
