package activities;

public class Activity1 {
	public static void main(String[] args) {
		Car carObj = new Car("Red","Manual", 2020);
		System.out.println();
		carObj.displayCharaceristics();
		carObj.accelarate();
		carObj.brake();
	
	}
}
