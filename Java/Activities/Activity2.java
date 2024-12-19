package activities;

public class Activity2 {
	public static void main(String[] args) {
	//Create the object for class 
	Activity2 actObj = new Activity2();
	//Create the integer array
	int[] nums = {10, 77,10,54, -11, 10};
	
	//Set the number to search for
	int searchNum = 10;
	int fixedSum = 30;
	
	Activity2 actObj1;
	//Call the result function and print the result
	System.out.println("Result: " + actObj.result(nums, searchNum, fixedSum));
}
	public boolean result(int[]nums, int searchNum, int fixedSum) {
	// Temp variable to hold the calculated sum
	 int tempSum = 0;
	 
	 //Loop through the array to calculate sum
	 for (int number : nums) {
	// Check if the value is the searchNum
		if(number == searchNum) {
			//Add the value
			 tempSum += searchNum;
		
		}
		//Check if tempSum is greater than fixedSum
		if(tempSum > fixedSum) {
			//Condition fails, break loop
			break;
			
		}
		 
		
	 }
	return fixedSum == tempSum;
	 
		 
	 }
	 
 }