package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTakeOffTime;
	private Date lastLandingTime;
	
	Plane(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<String>();	
	}
	
	public void onboard(String passengersName) {
		this.passengers.add(passengersName);
	}
	public void setTakeOff() {
		this.lastTakeOffTime = new Date();
		
	}
	public Date getTakeOffTime() {
		return this.lastTakeOffTime;
		
	}
	public void setLand() {
		this.lastLandingTime = new Date();
		this.passengers.clear();
		}
	public Date getLastTimelanded() {
		return this.lastLandingTime;
	}
	public List<String> getPassengers() {
		return this.passengers;
	}

}

public class Activity6 {

	public static void main(String[] args)  throws InterruptedException{
		// Create and object of Plane
		Plane b747  = new Plane(10);
		
		//Onboard Passengers
		b747.onboard("Saahil");
		b747.onboard("Rahul");
		b747.onboard("Juhi");
		
		//Set the take off time
		b747.setTakeOff();
		System.out.println("Plane took off at:" + b747.getTakeOffTime());
		System.out.println("The passengers in the plane:" + b747.getPassengers());
		
		//Flying..
		System.out.println("Plane is flying..");
	    Thread.sleep(5000);

	    
	    //Set the landing time
	    b747.setLand();
	    System.out.println("Plane landed at:" +b747.getLastTimelanded());
	    System.out.println("The passengers in the plane after landing: " + b747.getPassengers());
	    
		
		
		

	}

}
